package com.examples.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: helloword.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class hellowordGrpc {

  private hellowordGrpc() {}

  public static final String SERVICE_NAME = "helloword.helloword";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.examples.grpc.Helloword.helloRequest,
      com.examples.grpc.Helloword.helloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.examples.grpc.Helloword.helloRequest.class,
      responseType = com.examples.grpc.Helloword.helloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.examples.grpc.Helloword.helloRequest,
      com.examples.grpc.Helloword.helloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.examples.grpc.Helloword.helloRequest, com.examples.grpc.Helloword.helloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = hellowordGrpc.getSayHelloMethod) == null) {
      synchronized (hellowordGrpc.class) {
        if ((getSayHelloMethod = hellowordGrpc.getSayHelloMethod) == null) {
          hellowordGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.examples.grpc.Helloword.helloRequest, com.examples.grpc.Helloword.helloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.grpc.Helloword.helloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.grpc.Helloword.helloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new hellowordMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static hellowordStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<hellowordStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<hellowordStub>() {
        @java.lang.Override
        public hellowordStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new hellowordStub(channel, callOptions);
        }
      };
    return hellowordStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static hellowordBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<hellowordBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<hellowordBlockingStub>() {
        @java.lang.Override
        public hellowordBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new hellowordBlockingStub(channel, callOptions);
        }
      };
    return hellowordBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static hellowordFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<hellowordFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<hellowordFutureStub>() {
        @java.lang.Override
        public hellowordFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new hellowordFutureStub(channel, callOptions);
        }
      };
    return hellowordFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.examples.grpc.Helloword.helloRequest request,
        io.grpc.stub.StreamObserver<com.examples.grpc.Helloword.helloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service helloword.
   */
  public static abstract class hellowordImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return hellowordGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service helloword.
   */
  public static final class hellowordStub
      extends io.grpc.stub.AbstractAsyncStub<hellowordStub> {
    private hellowordStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected hellowordStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new hellowordStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.examples.grpc.Helloword.helloRequest request,
        io.grpc.stub.StreamObserver<com.examples.grpc.Helloword.helloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service helloword.
   */
  public static final class hellowordBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<hellowordBlockingStub> {
    private hellowordBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected hellowordBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new hellowordBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.examples.grpc.Helloword.helloResponse sayHello(com.examples.grpc.Helloword.helloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service helloword.
   */
  public static final class hellowordFutureStub
      extends io.grpc.stub.AbstractFutureStub<hellowordFutureStub> {
    private hellowordFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected hellowordFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new hellowordFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.examples.grpc.Helloword.helloResponse> sayHello(
        com.examples.grpc.Helloword.helloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.examples.grpc.Helloword.helloRequest) request,
              (io.grpc.stub.StreamObserver<com.examples.grpc.Helloword.helloResponse>) responseObserver);
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
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.examples.grpc.Helloword.helloRequest,
              com.examples.grpc.Helloword.helloResponse>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class hellowordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    hellowordBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.examples.grpc.Helloword.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("helloword");
    }
  }

  private static final class hellowordFileDescriptorSupplier
      extends hellowordBaseDescriptorSupplier {
    hellowordFileDescriptorSupplier() {}
  }

  private static final class hellowordMethodDescriptorSupplier
      extends hellowordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    hellowordMethodDescriptorSupplier(String methodName) {
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
      synchronized (hellowordGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new hellowordFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
