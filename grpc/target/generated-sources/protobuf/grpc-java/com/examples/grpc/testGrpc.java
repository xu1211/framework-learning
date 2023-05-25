package com.examples.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class testGrpc {

  private testGrpc() {}

  public static final String SERVICE_NAME = "test.test";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.examples.grpc.testproto.test1Request,
      com.examples.grpc.testproto.test1Response> getTest1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test1",
      requestType = com.examples.grpc.testproto.test1Request.class,
      responseType = com.examples.grpc.testproto.test1Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.examples.grpc.testproto.test1Request,
      com.examples.grpc.testproto.test1Response> getTest1Method() {
    io.grpc.MethodDescriptor<com.examples.grpc.testproto.test1Request, com.examples.grpc.testproto.test1Response> getTest1Method;
    if ((getTest1Method = testGrpc.getTest1Method) == null) {
      synchronized (testGrpc.class) {
        if ((getTest1Method = testGrpc.getTest1Method) == null) {
          testGrpc.getTest1Method = getTest1Method =
              io.grpc.MethodDescriptor.<com.examples.grpc.testproto.test1Request, com.examples.grpc.testproto.test1Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.grpc.testproto.test1Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.grpc.testproto.test1Response.getDefaultInstance()))
              .setSchemaDescriptor(new testMethodDescriptorSupplier("test1"))
              .build();
        }
      }
    }
    return getTest1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static testStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<testStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<testStub>() {
        @java.lang.Override
        public testStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new testStub(channel, callOptions);
        }
      };
    return testStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static testBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<testBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<testBlockingStub>() {
        @java.lang.Override
        public testBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new testBlockingStub(channel, callOptions);
        }
      };
    return testBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static testFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<testFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<testFutureStub>() {
        @java.lang.Override
        public testFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new testFutureStub(channel, callOptions);
        }
      };
    return testFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void test1(com.examples.grpc.testproto.test1Request request,
        io.grpc.stub.StreamObserver<com.examples.grpc.testproto.test1Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTest1Method(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service test.
   */
  public static abstract class testImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return testGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service test.
   */
  public static final class testStub
      extends io.grpc.stub.AbstractAsyncStub<testStub> {
    private testStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new testStub(channel, callOptions);
    }

    /**
     */
    public void test1(com.examples.grpc.testproto.test1Request request,
        io.grpc.stub.StreamObserver<com.examples.grpc.testproto.test1Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTest1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service test.
   */
  public static final class testBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<testBlockingStub> {
    private testBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new testBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.examples.grpc.testproto.test1Response test1(com.examples.grpc.testproto.test1Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTest1Method(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service test.
   */
  public static final class testFutureStub
      extends io.grpc.stub.AbstractFutureStub<testFutureStub> {
    private testFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected testFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new testFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.examples.grpc.testproto.test1Response> test1(
        com.examples.grpc.testproto.test1Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTest1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST1 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST1:
          serviceImpl.test1((com.examples.grpc.testproto.test1Request) request,
              (io.grpc.stub.StreamObserver<com.examples.grpc.testproto.test1Response>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTest1Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.examples.grpc.testproto.test1Request,
              com.examples.grpc.testproto.test1Response>(
                service, METHODID_TEST1)))
        .build();
  }

  private static abstract class testBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    testBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.examples.grpc.testproto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("test");
    }
  }

  private static final class testFileDescriptorSupplier
      extends testBaseDescriptorSupplier {
    testFileDescriptorSupplier() {}
  }

  private static final class testMethodDescriptorSupplier
      extends testBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    testMethodDescriptorSupplier(String methodName) {
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
      synchronized (testGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new testFileDescriptorSupplier())
              .addMethod(getTest1Method())
              .build();
        }
      }
    }
    return result;
  }
}
