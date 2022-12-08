package com.employee.server;

import java.io.IOException;

import com.employee.service.BookingService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class EmployeeServer {

	public static void main(String[] args) throws IOException, InterruptedException {

		Server server = ServerBuilder.forPort(8082).addService(new BookingService()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Recieved ShutDown Request");
			server.shutdown();
			System.out.println("Server Stopped");
		}));
		server.awaitTermination();
		
	}
}
