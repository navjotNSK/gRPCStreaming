package com.employee.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Employee.proto")
public final class employeeGrpc {

  private employeeGrpc() {}

  public static final String SERVICE_NAME = "employee";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.employee.stub.Employee.addRequest,
      com.employee.stub.Employee.addResponse> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployee",
      requestType = com.employee.stub.Employee.addRequest.class,
      responseType = com.employee.stub.Employee.addResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employee.stub.Employee.addRequest,
      com.employee.stub.Employee.addResponse> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.stub.Employee.addRequest, com.employee.stub.Employee.addResponse> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = employeeGrpc.getAddEmployeeMethod) == null) {
      synchronized (employeeGrpc.class) {
        if ((getAddEmployeeMethod = employeeGrpc.getAddEmployeeMethod) == null) {
          employeeGrpc.getAddEmployeeMethod = getAddEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.employee.stub.Employee.addRequest, com.employee.stub.Employee.addResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee", "addEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new employeeMethodDescriptorSupplier("addEmployee"))
                  .build();
          }
        }
     }
     return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.stub.Employee.addMulRequest,
      com.employee.stub.Employee.addMulResponse> getAddMultipleEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addMultipleEmployees",
      requestType = com.employee.stub.Employee.addMulRequest.class,
      responseType = com.employee.stub.Employee.addMulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.employee.stub.Employee.addMulRequest,
      com.employee.stub.Employee.addMulResponse> getAddMultipleEmployeesMethod() {
    io.grpc.MethodDescriptor<com.employee.stub.Employee.addMulRequest, com.employee.stub.Employee.addMulResponse> getAddMultipleEmployeesMethod;
    if ((getAddMultipleEmployeesMethod = employeeGrpc.getAddMultipleEmployeesMethod) == null) {
      synchronized (employeeGrpc.class) {
        if ((getAddMultipleEmployeesMethod = employeeGrpc.getAddMultipleEmployeesMethod) == null) {
          employeeGrpc.getAddMultipleEmployeesMethod = getAddMultipleEmployeesMethod = 
              io.grpc.MethodDescriptor.<com.employee.stub.Employee.addMulRequest, com.employee.stub.Employee.addMulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "employee", "addMultipleEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addMulRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addMulResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new employeeMethodDescriptorSupplier("addMultipleEmployees"))
                  .build();
          }
        }
     }
     return getAddMultipleEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.stub.Employee.getMulRequest,
      com.employee.stub.Employee.getMulResponse> getGetMutilpleEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMutilpleEmployee",
      requestType = com.employee.stub.Employee.getMulRequest.class,
      responseType = com.employee.stub.Employee.getMulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.employee.stub.Employee.getMulRequest,
      com.employee.stub.Employee.getMulResponse> getGetMutilpleEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.stub.Employee.getMulRequest, com.employee.stub.Employee.getMulResponse> getGetMutilpleEmployeeMethod;
    if ((getGetMutilpleEmployeeMethod = employeeGrpc.getGetMutilpleEmployeeMethod) == null) {
      synchronized (employeeGrpc.class) {
        if ((getGetMutilpleEmployeeMethod = employeeGrpc.getGetMutilpleEmployeeMethod) == null) {
          employeeGrpc.getGetMutilpleEmployeeMethod = getGetMutilpleEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.employee.stub.Employee.getMulRequest, com.employee.stub.Employee.getMulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "employee", "getMutilpleEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.getMulRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.getMulResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new employeeMethodDescriptorSupplier("getMutilpleEmployee"))
                  .build();
          }
        }
     }
     return getGetMutilpleEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.stub.Employee.addAndGetMulRequest,
      com.employee.stub.Employee.addAndGetMulResponse> getAddAndGetMulEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAndGetMulEmployee",
      requestType = com.employee.stub.Employee.addAndGetMulRequest.class,
      responseType = com.employee.stub.Employee.addAndGetMulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.employee.stub.Employee.addAndGetMulRequest,
      com.employee.stub.Employee.addAndGetMulResponse> getAddAndGetMulEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.stub.Employee.addAndGetMulRequest, com.employee.stub.Employee.addAndGetMulResponse> getAddAndGetMulEmployeeMethod;
    if ((getAddAndGetMulEmployeeMethod = employeeGrpc.getAddAndGetMulEmployeeMethod) == null) {
      synchronized (employeeGrpc.class) {
        if ((getAddAndGetMulEmployeeMethod = employeeGrpc.getAddAndGetMulEmployeeMethod) == null) {
          employeeGrpc.getAddAndGetMulEmployeeMethod = getAddAndGetMulEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.employee.stub.Employee.addAndGetMulRequest, com.employee.stub.Employee.addAndGetMulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "employee", "addAndGetMulEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addAndGetMulRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.stub.Employee.addAndGetMulResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new employeeMethodDescriptorSupplier("addAndGetMulEmployee"))
                  .build();
          }
        }
     }
     return getAddAndGetMulEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static employeeStub newStub(io.grpc.Channel channel) {
    return new employeeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static employeeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new employeeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static employeeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new employeeFutureStub(channel);
  }

  /**
   */
  public static abstract class employeeImplBase implements io.grpc.BindableService {

    /**
     */
    public void addEmployee(com.employee.stub.Employee.addRequest request,
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.employee.stub.Employee.addMulRequest> addMultipleEmployees(
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addMulResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddMultipleEmployeesMethod(), responseObserver);
    }

    /**
     */
    public void getMutilpleEmployee(com.employee.stub.Employee.getMulRequest request,
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.getMulResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMutilpleEmployeeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.employee.stub.Employee.addAndGetMulRequest> addAndGetMulEmployee(
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addAndGetMulResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddAndGetMulEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.employee.stub.Employee.addRequest,
                com.employee.stub.Employee.addResponse>(
                  this, METHODID_ADD_EMPLOYEE)))
          .addMethod(
            getAddMultipleEmployeesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.employee.stub.Employee.addMulRequest,
                com.employee.stub.Employee.addMulResponse>(
                  this, METHODID_ADD_MULTIPLE_EMPLOYEES)))
          .addMethod(
            getGetMutilpleEmployeeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.employee.stub.Employee.getMulRequest,
                com.employee.stub.Employee.getMulResponse>(
                  this, METHODID_GET_MUTILPLE_EMPLOYEE)))
          .addMethod(
            getAddAndGetMulEmployeeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.employee.stub.Employee.addAndGetMulRequest,
                com.employee.stub.Employee.addAndGetMulResponse>(
                  this, METHODID_ADD_AND_GET_MUL_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class employeeStub extends io.grpc.stub.AbstractStub<employeeStub> {
    private employeeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeStub(channel, callOptions);
    }

    /**
     */
    public void addEmployee(com.employee.stub.Employee.addRequest request,
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.employee.stub.Employee.addMulRequest> addMultipleEmployees(
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addMulResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddMultipleEmployeesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getMutilpleEmployee(com.employee.stub.Employee.getMulRequest request,
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.getMulResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMutilpleEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.employee.stub.Employee.addAndGetMulRequest> addAndGetMulEmployee(
        io.grpc.stub.StreamObserver<com.employee.stub.Employee.addAndGetMulResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAddAndGetMulEmployeeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class employeeBlockingStub extends io.grpc.stub.AbstractStub<employeeBlockingStub> {
    private employeeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.employee.stub.Employee.addResponse addEmployee(com.employee.stub.Employee.addRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.employee.stub.Employee.getMulResponse> getMutilpleEmployee(
        com.employee.stub.Employee.getMulRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMutilpleEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class employeeFutureStub extends io.grpc.stub.AbstractStub<employeeFutureStub> {
    private employeeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private employeeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected employeeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new employeeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employee.stub.Employee.addResponse> addEmployee(
        com.employee.stub.Employee.addRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EMPLOYEE = 0;
  private static final int METHODID_GET_MUTILPLE_EMPLOYEE = 1;
  private static final int METHODID_ADD_MULTIPLE_EMPLOYEES = 2;
  private static final int METHODID_ADD_AND_GET_MUL_EMPLOYEE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final employeeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(employeeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((com.employee.stub.Employee.addRequest) request,
              (io.grpc.stub.StreamObserver<com.employee.stub.Employee.addResponse>) responseObserver);
          break;
        case METHODID_GET_MUTILPLE_EMPLOYEE:
          serviceImpl.getMutilpleEmployee((com.employee.stub.Employee.getMulRequest) request,
              (io.grpc.stub.StreamObserver<com.employee.stub.Employee.getMulResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_MULTIPLE_EMPLOYEES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addMultipleEmployees(
              (io.grpc.stub.StreamObserver<com.employee.stub.Employee.addMulResponse>) responseObserver);
        case METHODID_ADD_AND_GET_MUL_EMPLOYEE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addAndGetMulEmployee(
              (io.grpc.stub.StreamObserver<com.employee.stub.Employee.addAndGetMulResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class employeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    employeeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.employee.stub.Employee.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("employee");
    }
  }

  private static final class employeeFileDescriptorSupplier
      extends employeeBaseDescriptorSupplier {
    employeeFileDescriptorSupplier() {}
  }

  private static final class employeeMethodDescriptorSupplier
      extends employeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    employeeMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (employeeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new employeeFileDescriptorSupplier())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getAddMultipleEmployeesMethod())
              .addMethod(getGetMutilpleEmployeeMethod())
              .addMethod(getAddAndGetMulEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
