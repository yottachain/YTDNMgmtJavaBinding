package io.yottachain.nodemgmt.rebuilder.pb;

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
 * <pre>
 * yotta-rebuilder micro-servicew
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: types.proto")
public final class RebuilderGrpc {

  private RebuilderGrpc() {}

  public static final String SERVICE_NAME = "pb.Rebuilder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.Empty,
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> getGetRebuildTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRebuildTasks",
      requestType = io.yottachain.nodemgmt.rebuilder.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.Empty,
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> getGetRebuildTasksMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.Empty, io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> getGetRebuildTasksMethod;
    if ((getGetRebuildTasksMethod = RebuilderGrpc.getGetRebuildTasksMethod) == null) {
      synchronized (RebuilderGrpc.class) {
        if ((getGetRebuildTasksMethod = RebuilderGrpc.getGetRebuildTasksMethod) == null) {
          RebuilderGrpc.getGetRebuildTasksMethod = getGetRebuildTasksMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.rebuilder.pb.Empty, io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRebuildTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.rebuilder.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription.getDefaultInstance()))
              .setSchemaDescriptor(new RebuilderMethodDescriptorSupplier("GetRebuildTasks"))
              .build();
        }
      }
    }
    return getGetRebuildTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult,
      io.yottachain.nodemgmt.rebuilder.pb.Empty> getUpdateTaskStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTaskStatus",
      requestType = io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.class,
      responseType = io.yottachain.nodemgmt.rebuilder.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult,
      io.yottachain.nodemgmt.rebuilder.pb.Empty> getUpdateTaskStatusMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult, io.yottachain.nodemgmt.rebuilder.pb.Empty> getUpdateTaskStatusMethod;
    if ((getUpdateTaskStatusMethod = RebuilderGrpc.getUpdateTaskStatusMethod) == null) {
      synchronized (RebuilderGrpc.class) {
        if ((getUpdateTaskStatusMethod = RebuilderGrpc.getUpdateTaskStatusMethod) == null) {
          RebuilderGrpc.getUpdateTaskStatusMethod = getUpdateTaskStatusMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult, io.yottachain.nodemgmt.rebuilder.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTaskStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.rebuilder.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RebuilderMethodDescriptorSupplier("UpdateTaskStatus"))
              .build();
        }
      }
    }
    return getUpdateTaskStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RebuilderStub newStub(io.grpc.Channel channel) {
    return new RebuilderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RebuilderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RebuilderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RebuilderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RebuilderFutureStub(channel);
  }

  /**
   * <pre>
   * yotta-rebuilder micro-servicew
   * </pre>
   */
  public static abstract class RebuilderImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRebuildTasks(io.yottachain.nodemgmt.rebuilder.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRebuildTasksMethod(), responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRebuildTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.rebuilder.pb.Empty,
                io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription>(
                  this, METHODID_GET_REBUILD_TASKS)))
          .addMethod(
            getUpdateTaskStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult,
                io.yottachain.nodemgmt.rebuilder.pb.Empty>(
                  this, METHODID_UPDATE_TASK_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * yotta-rebuilder micro-servicew
   * </pre>
   */
  public static final class RebuilderStub extends io.grpc.stub.AbstractStub<RebuilderStub> {
    private RebuilderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RebuilderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RebuilderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RebuilderStub(channel, callOptions);
    }

    /**
     */
    public void getRebuildTasks(io.yottachain.nodemgmt.rebuilder.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRebuildTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * yotta-rebuilder micro-servicew
   * </pre>
   */
  public static final class RebuilderBlockingStub extends io.grpc.stub.AbstractStub<RebuilderBlockingStub> {
    private RebuilderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RebuilderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RebuilderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RebuilderBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription getRebuildTasks(io.yottachain.nodemgmt.rebuilder.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetRebuildTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.rebuilder.pb.Empty updateTaskStatus(io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * yotta-rebuilder micro-servicew
   * </pre>
   */
  public static final class RebuilderFutureStub extends io.grpc.stub.AbstractStub<RebuilderFutureStub> {
    private RebuilderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RebuilderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RebuilderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RebuilderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription> getRebuildTasks(
        io.yottachain.nodemgmt.rebuilder.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRebuildTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.rebuilder.pb.Empty> updateTaskStatus(
        io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REBUILD_TASKS = 0;
  private static final int METHODID_UPDATE_TASK_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RebuilderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RebuilderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REBUILD_TASKS:
          serviceImpl.getRebuildTasks((io.yottachain.nodemgmt.rebuilder.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.MultiTaskDescription>) responseObserver);
          break;
        case METHODID_UPDATE_TASK_STATUS:
          serviceImpl.updateTaskStatus((io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.rebuilder.pb.Empty>) responseObserver);
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

  private static abstract class RebuilderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RebuilderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rebuilder");
    }
  }

  private static final class RebuilderFileDescriptorSupplier
      extends RebuilderBaseDescriptorSupplier {
    RebuilderFileDescriptorSupplier() {}
  }

  private static final class RebuilderMethodDescriptorSupplier
      extends RebuilderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RebuilderMethodDescriptorSupplier(String methodName) {
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
      synchronized (RebuilderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RebuilderFileDescriptorSupplier())
              .addMethod(getGetRebuildTasksMethod())
              .addMethod(getUpdateTaskStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
