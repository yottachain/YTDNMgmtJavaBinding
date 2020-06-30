package io.yottachain.nodemgmt.analysis.pb;

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
 * yotta-analysis micro-servicew
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: types.proto")
public final class AnalysisGrpc {

  private AnalysisGrpc() {}

  public static final String SERVICE_NAME = "pbanalysis.Analysis";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty,
      io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> getGetSpotCheckListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpotCheckList",
      requestType = io.yottachain.nodemgmt.analysis.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty,
      io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> getGetSpotCheckListMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty, io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> getGetSpotCheckListMethod;
    if ((getGetSpotCheckListMethod = AnalysisGrpc.getGetSpotCheckListMethod) == null) {
      synchronized (AnalysisGrpc.class) {
        if ((getGetSpotCheckListMethod = AnalysisGrpc.getGetSpotCheckListMethod) == null) {
          AnalysisGrpc.getGetSpotCheckListMethod = getGetSpotCheckListMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.analysis.pb.Empty, io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpotCheckList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg.getDefaultInstance()))
              .setSchemaDescriptor(new AnalysisMethodDescriptorSupplier("GetSpotCheckList"))
              .build();
        }
      }
    }
    return getGetSpotCheckListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty,
      io.yottachain.nodemgmt.analysis.pb.BoolMessage> getIsNodeSelectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsNodeSelected",
      requestType = io.yottachain.nodemgmt.analysis.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.analysis.pb.BoolMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty,
      io.yottachain.nodemgmt.analysis.pb.BoolMessage> getIsNodeSelectedMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.Empty, io.yottachain.nodemgmt.analysis.pb.BoolMessage> getIsNodeSelectedMethod;
    if ((getIsNodeSelectedMethod = AnalysisGrpc.getIsNodeSelectedMethod) == null) {
      synchronized (AnalysisGrpc.class) {
        if ((getIsNodeSelectedMethod = AnalysisGrpc.getIsNodeSelectedMethod) == null) {
          AnalysisGrpc.getIsNodeSelectedMethod = getIsNodeSelectedMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.analysis.pb.Empty, io.yottachain.nodemgmt.analysis.pb.BoolMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsNodeSelected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.BoolMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnalysisMethodDescriptorSupplier("IsNodeSelected"))
              .build();
        }
      }
    }
    return getIsNodeSelectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq,
      io.yottachain.nodemgmt.analysis.pb.Empty> getUpdateTaskStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTaskStatus",
      requestType = io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq.class,
      responseType = io.yottachain.nodemgmt.analysis.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq,
      io.yottachain.nodemgmt.analysis.pb.Empty> getUpdateTaskStatusMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq, io.yottachain.nodemgmt.analysis.pb.Empty> getUpdateTaskStatusMethod;
    if ((getUpdateTaskStatusMethod = AnalysisGrpc.getUpdateTaskStatusMethod) == null) {
      synchronized (AnalysisGrpc.class) {
        if ((getUpdateTaskStatusMethod = AnalysisGrpc.getUpdateTaskStatusMethod) == null) {
          AnalysisGrpc.getUpdateTaskStatusMethod = getUpdateTaskStatusMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq, io.yottachain.nodemgmt.analysis.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTaskStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.analysis.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AnalysisMethodDescriptorSupplier("UpdateTaskStatus"))
              .build();
        }
      }
    }
    return getUpdateTaskStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnalysisStub newStub(io.grpc.Channel channel) {
    return new AnalysisStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnalysisBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnalysisBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnalysisFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnalysisFutureStub(channel);
  }

  /**
   * <pre>
   * yotta-analysis micro-servicew
   * </pre>
   */
  public static abstract class AnalysisImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSpotCheckList(io.yottachain.nodemgmt.analysis.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpotCheckListMethod(), responseObserver);
    }

    /**
     */
    public void isNodeSelected(io.yottachain.nodemgmt.analysis.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.BoolMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getIsNodeSelectedMethod(), responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSpotCheckListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.analysis.pb.Empty,
                io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg>(
                  this, METHODID_GET_SPOT_CHECK_LIST)))
          .addMethod(
            getIsNodeSelectedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.analysis.pb.Empty,
                io.yottachain.nodemgmt.analysis.pb.BoolMessage>(
                  this, METHODID_IS_NODE_SELECTED)))
          .addMethod(
            getUpdateTaskStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq,
                io.yottachain.nodemgmt.analysis.pb.Empty>(
                  this, METHODID_UPDATE_TASK_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * yotta-analysis micro-servicew
   * </pre>
   */
  public static final class AnalysisStub extends io.grpc.stub.AbstractStub<AnalysisStub> {
    private AnalysisStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisStub(channel, callOptions);
    }

    /**
     */
    public void getSpotCheckList(io.yottachain.nodemgmt.analysis.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpotCheckListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isNodeSelected(io.yottachain.nodemgmt.analysis.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.BoolMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsNodeSelectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * yotta-analysis micro-servicew
   * </pre>
   */
  public static final class AnalysisBlockingStub extends io.grpc.stub.AbstractStub<AnalysisBlockingStub> {
    private AnalysisBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg getSpotCheckList(io.yottachain.nodemgmt.analysis.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSpotCheckListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.analysis.pb.BoolMessage isNodeSelected(io.yottachain.nodemgmt.analysis.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIsNodeSelectedMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.analysis.pb.Empty updateTaskStatus(io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * yotta-analysis micro-servicew
   * </pre>
   */
  public static final class AnalysisFutureStub extends io.grpc.stub.AbstractStub<AnalysisFutureStub> {
    private AnalysisFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalysisFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalysisFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalysisFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg> getSpotCheckList(
        io.yottachain.nodemgmt.analysis.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpotCheckListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.analysis.pb.BoolMessage> isNodeSelected(
        io.yottachain.nodemgmt.analysis.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIsNodeSelectedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.analysis.pb.Empty> updateTaskStatus(
        io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SPOT_CHECK_LIST = 0;
  private static final int METHODID_IS_NODE_SELECTED = 1;
  private static final int METHODID_UPDATE_TASK_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnalysisImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnalysisImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SPOT_CHECK_LIST:
          serviceImpl.getSpotCheckList((io.yottachain.nodemgmt.analysis.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.SpotCheckListMsg>) responseObserver);
          break;
        case METHODID_IS_NODE_SELECTED:
          serviceImpl.isNodeSelected((io.yottachain.nodemgmt.analysis.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.BoolMessage>) responseObserver);
          break;
        case METHODID_UPDATE_TASK_STATUS:
          serviceImpl.updateTaskStatus((io.yottachain.nodemgmt.analysis.pb.UpdateTaskStatusReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.analysis.pb.Empty>) responseObserver);
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

  private static abstract class AnalysisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnalysisBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Analysis");
    }
  }

  private static final class AnalysisFileDescriptorSupplier
      extends AnalysisBaseDescriptorSupplier {
    AnalysisFileDescriptorSupplier() {}
  }

  private static final class AnalysisMethodDescriptorSupplier
      extends AnalysisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnalysisMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnalysisGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnalysisFileDescriptorSupplier())
              .addMethod(getGetSpotCheckListMethod())
              .addMethod(getIsNodeSelectedMethod())
              .addMethod(getUpdateTaskStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
