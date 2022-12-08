package com.employee.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.employee.stub.Employee.addAndGetMulRequest;
import com.employee.stub.Employee.addAndGetMulResponse;
import com.employee.stub.Employee.addMulRequest;
import com.employee.stub.Employee.addMulResponse;
import com.employee.stub.Employee.addRequest;
import com.employee.stub.Employee.addResponse;
import com.employee.stub.Employee.getMulRequest;
import com.employee.stub.Employee.getMulResponse;
import com.employee.stub.employeeGrpc.employeeImplBase;

import io.grpc.stub.StreamObserver;

public class BookingService extends employeeImplBase {

	Connection connection;

	//******************************* DB Code ****************************************
	
	public BookingService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/streampractice", "root", "password");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException " + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println("SQLException " + se.getMessage());
		} catch (Exception e) {
			System.out.println("Error Occur " + e.getMessage());
		}
	}

	//******************************* UNARY STREAMING ****************************************
	
	@Override
	public void addEmployee(addRequest request, StreamObserver<addResponse> responseObserver) {
		String query = "insert into employee (id, name, salary) values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, request.getId());
			ps.setString(2, request.getName());
			ps.setDouble(3, request.getSalary());
			int resultOfInsertion = ps.executeUpdate();

		} catch (SQLException sql) {
			System.out.println("SQLException generated in estb connection");
		}

		addResponse.Builder response = addResponse.newBuilder().setId(request.getId());
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	//******************************* CLIENT STREAMING ****************************************
	
	@Override
	public StreamObserver<addMulRequest> addMultipleEmployees(StreamObserver<addMulResponse> responseObserver) {
		
		return new StreamObserver<addMulRequest>() {

			@Override
			public void onNext(addMulRequest value) {
				String query = "insert into employee (id, name, salary) values(?,?,?)";
				try {
					PreparedStatement ps = connection.prepareStatement(query);
					ps.setInt(1,value.getId());
					ps.setString(2,value.getName());
					ps.setDouble(3, value.getSalary());
					int resultOfInsertion = ps.executeUpdate();
				} catch (SQLException sql) {
					System.out.println("SQLException generated in adding employee");
				}
			}

			@Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(addMulResponse.newBuilder().setResponse("Saved").build());
				responseObserver.onCompleted();
			}
		};
	}

	
	//******************************* SERVER STREAMING ****************************************
	
	@Override
	public void getMutilpleEmployee(getMulRequest request, StreamObserver<getMulResponse> responseObserver) {
		String name = request.getName();

		getMulResponse.Builder response = getMulResponse.newBuilder();
		
		try {
			String query = "select * from employee where name = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, name);

			ResultSet result = ps.executeQuery();

			while (result.next()) {
				response.setId(result.getInt("id")).setName(result.getString("name"))
						.setSalary(result.getDouble("salary")).build();
				
				responseObserver.onNext(response.build());
			}
		} catch (SQLException e) {
			System.out.println("SQLException generated in getting employees ");
		}
		responseObserver.onCompleted();
	}
	
	//******************************* BiDirectional STREAMING ****************************************

	@Override
	public StreamObserver<addAndGetMulRequest> addAndGetMulEmployee(
			StreamObserver<addAndGetMulResponse> responseObserver) {
		
		return new StreamObserver<addAndGetMulRequest>() {
			//****** For Client ******
			@Override
			public void onNext(addAndGetMulRequest value) {
				String query = "insert into employee (id, name, salary) values(?,?,?)";
				try {
					PreparedStatement ps = connection.prepareStatement(query);
					ps.setInt(1,value.getId());
					ps.setString(2,value.getName());
					ps.setDouble(3, value.getSalary());
					int resultOfInsertion = ps.executeUpdate();
				} catch (SQLException sql) {
					System.out.println("SQLException generated in adding employee");
				}
			}

			@Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				//****** For Server ******
				addAndGetMulResponse.Builder res = addAndGetMulResponse.newBuilder();
				
				try {
					String query1 = "select * from employee";
					PreparedStatement ps = connection.prepareStatement(query1);
					ResultSet result = ps.executeQuery();

					while (result.next()) {
						res.setId(result.getInt("id")).setName(result.getString("name"))
								.setSalary(result.getDouble("salary")).build();
						
						responseObserver.onNext(res.build());
					}
				} catch (SQLException e) {
					System.out.println("SQLException generated in  getting employees ");
				}
				responseObserver.onCompleted();
			}
			
		};
				
	}

}
