package io.yottachain.nodemgmt.pb;

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
 * node management micro-servicew
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: types.proto")
public final class YTDNMgmtGrpc {

  private YTDNMgmtGrpc() {}

  public static final String SERVICE_NAME = "pb.YTDNMgmt";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.Empty> getSetMasterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaster",
      requestType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.Empty> getSetMasterMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.Empty> getSetMasterMethod;
    if ((getSetMasterMethod = YTDNMgmtGrpc.getSetMasterMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getSetMasterMethod = YTDNMgmtGrpc.getSetMasterMethod) == null) {
          YTDNMgmtGrpc.getSetMasterMethod = getSetMasterMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("SetMaster"))
              .build();
        }
      }
    }
    return getSetMasterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Empty> getChangeEosURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeEosURL",
      requestType = io.yottachain.nodemgmt.pb.StringMsg.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Empty> getChangeEosURLMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Empty> getChangeEosURLMethod;
    if ((getChangeEosURLMethod = YTDNMgmtGrpc.getChangeEosURLMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getChangeEosURLMethod = YTDNMgmtGrpc.getChangeEosURLMethod) == null) {
          YTDNMgmtGrpc.getChangeEosURLMethod = getChangeEosURLMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeEosURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.StringMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("ChangeEosURL"))
              .build();
        }
      }
    }
    return getChangeEosURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.Int32Msg> getNewNodeIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewNodeID",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.Int32Msg> getNewNodeIDMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.Int32Msg> getNewNodeIDMethod;
    if ((getNewNodeIDMethod = YTDNMgmtGrpc.getNewNodeIDMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getNewNodeIDMethod = YTDNMgmtGrpc.getNewNodeIDMethod) == null) {
          YTDNMgmtGrpc.getNewNodeIDMethod = getNewNodeIDMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.Int32Msg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewNodeID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("NewNodeID"))
              .build();
        }
      }
    }
    return getNewNodeIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.String2Msg,
      io.yottachain.nodemgmt.pb.Empty> getCallAPIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallAPI",
      requestType = io.yottachain.nodemgmt.pb.String2Msg.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.String2Msg,
      io.yottachain.nodemgmt.pb.Empty> getCallAPIMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.String2Msg, io.yottachain.nodemgmt.pb.Empty> getCallAPIMethod;
    if ((getCallAPIMethod = YTDNMgmtGrpc.getCallAPIMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getCallAPIMethod = YTDNMgmtGrpc.getCallAPIMethod) == null) {
          YTDNMgmtGrpc.getCallAPIMethod = getCallAPIMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.String2Msg, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallAPI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.String2Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("CallAPI"))
              .build();
        }
      }
    }
    return getCallAPIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg,
      io.yottachain.nodemgmt.pb.NodeMsg> getUpdateNodeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNodeStatus",
      requestType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      responseType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg,
      io.yottachain.nodemgmt.pb.NodeMsg> getUpdateNodeStatusMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.NodeMsg> getUpdateNodeStatusMethod;
    if ((getUpdateNodeStatusMethod = YTDNMgmtGrpc.getUpdateNodeStatusMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getUpdateNodeStatusMethod = YTDNMgmtGrpc.getUpdateNodeStatusMethod) == null) {
          YTDNMgmtGrpc.getUpdateNodeStatusMethod = getUpdateNodeStatusMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.NodeMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNodeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("UpdateNodeStatus"))
              .build();
        }
      }
    }
    return getUpdateNodeStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.IncrUsedSpaceReq,
      io.yottachain.nodemgmt.pb.Empty> getIncrUsedSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncrUsedSpace",
      requestType = io.yottachain.nodemgmt.pb.IncrUsedSpaceReq.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.IncrUsedSpaceReq,
      io.yottachain.nodemgmt.pb.Empty> getIncrUsedSpaceMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.IncrUsedSpaceReq, io.yottachain.nodemgmt.pb.Empty> getIncrUsedSpaceMethod;
    if ((getIncrUsedSpaceMethod = YTDNMgmtGrpc.getIncrUsedSpaceMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getIncrUsedSpaceMethod = YTDNMgmtGrpc.getIncrUsedSpaceMethod) == null) {
          YTDNMgmtGrpc.getIncrUsedSpaceMethod = getIncrUsedSpaceMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.IncrUsedSpaceReq, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncrUsedSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.IncrUsedSpaceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("IncrUsedSpace"))
              .build();
        }
      }
    }
    return getIncrUsedSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.AllocNodesReq,
      io.yottachain.nodemgmt.pb.NodesResp> getAllocNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllocNodes",
      requestType = io.yottachain.nodemgmt.pb.AllocNodesReq.class,
      responseType = io.yottachain.nodemgmt.pb.NodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.AllocNodesReq,
      io.yottachain.nodemgmt.pb.NodesResp> getAllocNodesMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.AllocNodesReq, io.yottachain.nodemgmt.pb.NodesResp> getAllocNodesMethod;
    if ((getAllocNodesMethod = YTDNMgmtGrpc.getAllocNodesMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getAllocNodesMethod = YTDNMgmtGrpc.getAllocNodesMethod) == null) {
          YTDNMgmtGrpc.getAllocNodesMethod = getAllocNodesMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.AllocNodesReq, io.yottachain.nodemgmt.pb.NodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllocNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.AllocNodesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("AllocNodes"))
              .build();
        }
      }
    }
    return getAllocNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg,
      io.yottachain.nodemgmt.pb.Empty> getSyncNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncNode",
      requestType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg,
      io.yottachain.nodemgmt.pb.Empty> getSyncNodeMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.Empty> getSyncNodeMethod;
    if ((getSyncNodeMethod = YTDNMgmtGrpc.getSyncNodeMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getSyncNodeMethod = YTDNMgmtGrpc.getSyncNodeMethod) == null) {
          YTDNMgmtGrpc.getSyncNodeMethod = getSyncNodeMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("SyncNode"))
              .build();
        }
      }
    }
    return getSyncNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetNodesReq,
      io.yottachain.nodemgmt.pb.NodesResp> getGetNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodes",
      requestType = io.yottachain.nodemgmt.pb.GetNodesReq.class,
      responseType = io.yottachain.nodemgmt.pb.NodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetNodesReq,
      io.yottachain.nodemgmt.pb.NodesResp> getGetNodesMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetNodesReq, io.yottachain.nodemgmt.pb.NodesResp> getGetNodesMethod;
    if ((getGetNodesMethod = YTDNMgmtGrpc.getGetNodesMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetNodesMethod = YTDNMgmtGrpc.getGetNodesMethod) == null) {
          YTDNMgmtGrpc.getGetNodesMethod = getGetNodesMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.GetNodesReq, io.yottachain.nodemgmt.pb.NodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.GetNodesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetNodes"))
              .build();
        }
      }
    }
    return getGetNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.SuperNodesResp> getGetSuperNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSuperNodes",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.SuperNodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.SuperNodesResp> getGetSuperNodesMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.SuperNodesResp> getGetSuperNodesMethod;
    if ((getGetSuperNodesMethod = YTDNMgmtGrpc.getGetSuperNodesMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSuperNodesMethod = YTDNMgmtGrpc.getGetSuperNodesMethod) == null) {
          YTDNMgmtGrpc.getGetSuperNodesMethod = getGetSuperNodesMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.SuperNodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSuperNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.SuperNodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSuperNodes"))
              .build();
        }
      }
    }
    return getGetSuperNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.StringMsg> getGetSuperNodePrivateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSuperNodePrivateKey",
      requestType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      responseType = io.yottachain.nodemgmt.pb.StringMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.StringMsg> getGetSuperNodePrivateKeyMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.StringMsg> getGetSuperNodePrivateKeyMethod;
    if ((getGetSuperNodePrivateKeyMethod = YTDNMgmtGrpc.getGetSuperNodePrivateKeyMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSuperNodePrivateKeyMethod = YTDNMgmtGrpc.getGetSuperNodePrivateKeyMethod) == null) {
          YTDNMgmtGrpc.getGetSuperNodePrivateKeyMethod = getGetSuperNodePrivateKeyMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSuperNodePrivateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.StringMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSuperNodePrivateKey"))
              .build();
        }
      }
    }
    return getGetSuperNodePrivateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Int32Msg> getGetNodeIDByPubKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeIDByPubKey",
      requestType = io.yottachain.nodemgmt.pb.StringMsg.class,
      responseType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Int32Msg> getGetNodeIDByPubKeyMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Int32Msg> getGetNodeIDByPubKeyMethod;
    if ((getGetNodeIDByPubKeyMethod = YTDNMgmtGrpc.getGetNodeIDByPubKeyMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetNodeIDByPubKeyMethod = YTDNMgmtGrpc.getGetNodeIDByPubKeyMethod) == null) {
          YTDNMgmtGrpc.getGetNodeIDByPubKeyMethod = getGetNodeIDByPubKeyMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Int32Msg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeIDByPubKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.StringMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetNodeIDByPubKey"))
              .build();
        }
      }
    }
    return getGetNodeIDByPubKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetNodeByPubKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeByPubKey",
      requestType = io.yottachain.nodemgmt.pb.StringMsg.class,
      responseType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetNodeByPubKeyMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.NodeMsg> getGetNodeByPubKeyMethod;
    if ((getGetNodeByPubKeyMethod = YTDNMgmtGrpc.getGetNodeByPubKeyMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetNodeByPubKeyMethod = YTDNMgmtGrpc.getGetNodeByPubKeyMethod) == null) {
          YTDNMgmtGrpc.getGetNodeByPubKeyMethod = getGetNodeByPubKeyMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.NodeMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeByPubKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.StringMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetNodeByPubKey"))
              .build();
        }
      }
    }
    return getGetNodeByPubKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Int32Msg> getGetSuperNodeIDByPubKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSuperNodeIDByPubKey",
      requestType = io.yottachain.nodemgmt.pb.StringMsg.class,
      responseType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg,
      io.yottachain.nodemgmt.pb.Int32Msg> getGetSuperNodeIDByPubKeyMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Int32Msg> getGetSuperNodeIDByPubKeyMethod;
    if ((getGetSuperNodeIDByPubKeyMethod = YTDNMgmtGrpc.getGetSuperNodeIDByPubKeyMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSuperNodeIDByPubKeyMethod = YTDNMgmtGrpc.getGetSuperNodeIDByPubKeyMethod) == null) {
          YTDNMgmtGrpc.getGetSuperNodeIDByPubKeyMethod = getGetSuperNodeIDByPubKeyMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.StringMsg, io.yottachain.nodemgmt.pb.Int32Msg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSuperNodeIDByPubKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.StringMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSuperNodeIDByPubKey"))
              .build();
        }
      }
    }
    return getGetSuperNodeIDByPubKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq,
      io.yottachain.nodemgmt.pb.Empty> getAddDNIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDNI",
      requestType = io.yottachain.nodemgmt.pb.DNIReq.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq,
      io.yottachain.nodemgmt.pb.Empty> getAddDNIMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq, io.yottachain.nodemgmt.pb.Empty> getAddDNIMethod;
    if ((getAddDNIMethod = YTDNMgmtGrpc.getAddDNIMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getAddDNIMethod = YTDNMgmtGrpc.getAddDNIMethod) == null) {
          YTDNMgmtGrpc.getAddDNIMethod = getAddDNIMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.DNIReq, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDNI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.DNIReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("AddDNI"))
              .build();
        }
      }
    }
    return getAddDNIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodesResp> getActiveNodesListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveNodesList",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.NodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodesResp> getActiveNodesListMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodesResp> getActiveNodesListMethod;
    if ((getActiveNodesListMethod = YTDNMgmtGrpc.getActiveNodesListMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getActiveNodesListMethod = YTDNMgmtGrpc.getActiveNodesListMethod) == null) {
          YTDNMgmtGrpc.getActiveNodesListMethod = getActiveNodesListMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveNodesList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("ActiveNodesList"))
              .build();
        }
      }
    }
    return getActiveNodesListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodeStatMsg> getStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Statistics",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.NodeStatMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodeStatMsg> getStatisticsMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodeStatMsg> getStatisticsMethod;
    if ((getStatisticsMethod = YTDNMgmtGrpc.getStatisticsMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getStatisticsMethod = YTDNMgmtGrpc.getStatisticsMethod) == null) {
          YTDNMgmtGrpc.getStatisticsMethod = getStatisticsMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodeStatMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Statistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeStatMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("Statistics"))
              .build();
        }
      }
    }
    return getStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.GetSpotCheckListResp> getGetSpotCheckListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpotCheckList",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.GetSpotCheckListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.GetSpotCheckListResp> getGetSpotCheckListMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.GetSpotCheckListResp> getGetSpotCheckListMethod;
    if ((getGetSpotCheckListMethod = YTDNMgmtGrpc.getGetSpotCheckListMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSpotCheckListMethod = YTDNMgmtGrpc.getGetSpotCheckListMethod) == null) {
          YTDNMgmtGrpc.getGetSpotCheckListMethod = getGetSpotCheckListMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.GetSpotCheckListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpotCheckList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.GetSpotCheckListResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSpotCheckList"))
              .build();
        }
      }
    }
    return getGetSpotCheckListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetSTNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSTNode",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetSTNodeMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodeMsg> getGetSTNodeMethod;
    if ((getGetSTNodeMethod = YTDNMgmtGrpc.getGetSTNodeMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSTNodeMethod = YTDNMgmtGrpc.getGetSTNodeMethod) == null) {
          YTDNMgmtGrpc.getGetSTNodeMethod = getGetSTNodeMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.NodeMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSTNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSTNode"))
              .build();
        }
      }
    }
    return getGetSTNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg,
      io.yottachain.nodemgmt.pb.NodesResp> getGetSTNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSTNodes",
      requestType = io.yottachain.nodemgmt.pb.Int64Msg.class,
      responseType = io.yottachain.nodemgmt.pb.NodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg,
      io.yottachain.nodemgmt.pb.NodesResp> getGetSTNodesMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg, io.yottachain.nodemgmt.pb.NodesResp> getGetSTNodesMethod;
    if ((getGetSTNodesMethod = YTDNMgmtGrpc.getGetSTNodesMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetSTNodesMethod = YTDNMgmtGrpc.getGetSTNodesMethod) == null) {
          YTDNMgmtGrpc.getGetSTNodesMethod = getGetSTNodesMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Int64Msg, io.yottachain.nodemgmt.pb.NodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSTNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int64Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetSTNodes"))
              .build();
        }
      }
    }
    return getGetSTNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.UpdateTaskStatusReq,
      io.yottachain.nodemgmt.pb.Empty> getUpdateTaskStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTaskStatus",
      requestType = io.yottachain.nodemgmt.pb.UpdateTaskStatusReq.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.UpdateTaskStatusReq,
      io.yottachain.nodemgmt.pb.Empty> getUpdateTaskStatusMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.UpdateTaskStatusReq, io.yottachain.nodemgmt.pb.Empty> getUpdateTaskStatusMethod;
    if ((getUpdateTaskStatusMethod = YTDNMgmtGrpc.getUpdateTaskStatusMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getUpdateTaskStatusMethod = YTDNMgmtGrpc.getUpdateTaskStatusMethod) == null) {
          YTDNMgmtGrpc.getUpdateTaskStatusMethod = getUpdateTaskStatusMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.UpdateTaskStatusReq, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTaskStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.UpdateTaskStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("UpdateTaskStatus"))
              .build();
        }
      }
    }
    return getUpdateTaskStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.GetInvalidNodesResp> getGetInvalidNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvalidNodes",
      requestType = io.yottachain.nodemgmt.pb.Empty.class,
      responseType = io.yottachain.nodemgmt.pb.GetInvalidNodesResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty,
      io.yottachain.nodemgmt.pb.GetInvalidNodesResp> getGetInvalidNodesMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.GetInvalidNodesResp> getGetInvalidNodesMethod;
    if ((getGetInvalidNodesMethod = YTDNMgmtGrpc.getGetInvalidNodesMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetInvalidNodesMethod = YTDNMgmtGrpc.getGetInvalidNodesMethod) == null) {
          YTDNMgmtGrpc.getGetInvalidNodesMethod = getGetInvalidNodesMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Empty, io.yottachain.nodemgmt.pb.GetInvalidNodesResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvalidNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.GetInvalidNodesResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetInvalidNodes"))
              .build();
        }
      }
    }
    return getGetInvalidNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetRebuildItemReq,
      io.yottachain.nodemgmt.pb.GetRebuildItemResp> getGetRebuildItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRebuildItem",
      requestType = io.yottachain.nodemgmt.pb.GetRebuildItemReq.class,
      responseType = io.yottachain.nodemgmt.pb.GetRebuildItemResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetRebuildItemReq,
      io.yottachain.nodemgmt.pb.GetRebuildItemResp> getGetRebuildItemMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.GetRebuildItemReq, io.yottachain.nodemgmt.pb.GetRebuildItemResp> getGetRebuildItemMethod;
    if ((getGetRebuildItemMethod = YTDNMgmtGrpc.getGetRebuildItemMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetRebuildItemMethod = YTDNMgmtGrpc.getGetRebuildItemMethod) == null) {
          YTDNMgmtGrpc.getGetRebuildItemMethod = getGetRebuildItemMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.GetRebuildItemReq, io.yottachain.nodemgmt.pb.GetRebuildItemResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRebuildItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.GetRebuildItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.GetRebuildItemResp.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetRebuildItem"))
              .build();
        }
      }
    }
    return getGetRebuildItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetRebuildNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRebuildNode",
      requestType = io.yottachain.nodemgmt.pb.Int64Msg.class,
      responseType = io.yottachain.nodemgmt.pb.NodeMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg,
      io.yottachain.nodemgmt.pb.NodeMsg> getGetRebuildNodeMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int64Msg, io.yottachain.nodemgmt.pb.NodeMsg> getGetRebuildNodeMethod;
    if ((getGetRebuildNodeMethod = YTDNMgmtGrpc.getGetRebuildNodeMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getGetRebuildNodeMethod = YTDNMgmtGrpc.getGetRebuildNodeMethod) == null) {
          YTDNMgmtGrpc.getGetRebuildNodeMethod = getGetRebuildNodeMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Int64Msg, io.yottachain.nodemgmt.pb.NodeMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRebuildNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int64Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("GetRebuildNode"))
              .build();
        }
      }
    }
    return getGetRebuildNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq,
      io.yottachain.nodemgmt.pb.Empty> getDeleteDNIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDNI",
      requestType = io.yottachain.nodemgmt.pb.DNIReq.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq,
      io.yottachain.nodemgmt.pb.Empty> getDeleteDNIMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.DNIReq, io.yottachain.nodemgmt.pb.Empty> getDeleteDNIMethod;
    if ((getDeleteDNIMethod = YTDNMgmtGrpc.getDeleteDNIMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getDeleteDNIMethod = YTDNMgmtGrpc.getDeleteDNIMethod) == null) {
          YTDNMgmtGrpc.getDeleteDNIMethod = getDeleteDNIMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.DNIReq, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDNI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.DNIReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("DeleteDNI"))
              .build();
        }
      }
    }
    return getDeleteDNIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.Empty> getFinishRebuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishRebuild",
      requestType = io.yottachain.nodemgmt.pb.Int32Msg.class,
      responseType = io.yottachain.nodemgmt.pb.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg,
      io.yottachain.nodemgmt.pb.Empty> getFinishRebuildMethod() {
    io.grpc.MethodDescriptor<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.Empty> getFinishRebuildMethod;
    if ((getFinishRebuildMethod = YTDNMgmtGrpc.getFinishRebuildMethod) == null) {
      synchronized (YTDNMgmtGrpc.class) {
        if ((getFinishRebuildMethod = YTDNMgmtGrpc.getFinishRebuildMethod) == null) {
          YTDNMgmtGrpc.getFinishRebuildMethod = getFinishRebuildMethod =
              io.grpc.MethodDescriptor.<io.yottachain.nodemgmt.pb.Int32Msg, io.yottachain.nodemgmt.pb.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishRebuild"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Int32Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.yottachain.nodemgmt.pb.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new YTDNMgmtMethodDescriptorSupplier("FinishRebuild"))
              .build();
        }
      }
    }
    return getFinishRebuildMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YTDNMgmtStub newStub(io.grpc.Channel channel) {
    return new YTDNMgmtStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YTDNMgmtBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new YTDNMgmtBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YTDNMgmtFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new YTDNMgmtFutureStub(channel);
  }

  /**
   * <pre>
   * node management micro-servicew
   * </pre>
   */
  public static abstract class YTDNMgmtImplBase implements io.grpc.BindableService {

    /**
     */
    public void setMaster(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMasterMethod(), responseObserver);
    }

    /**
     */
    public void changeEosURL(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeEosURLMethod(), responseObserver);
    }

    /**
     */
    public void newNodeID(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnimplementedUnaryCall(getNewNodeIDMethod(), responseObserver);
    }

    /**
     */
    public void callAPI(io.yottachain.nodemgmt.pb.String2Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCallAPIMethod(), responseObserver);
    }

    /**
     */
    public void updateNodeStatus(io.yottachain.nodemgmt.pb.NodeMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNodeStatusMethod(), responseObserver);
    }

    /**
     */
    public void incrUsedSpace(io.yottachain.nodemgmt.pb.IncrUsedSpaceReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrUsedSpaceMethod(), responseObserver);
    }

    /**
     */
    public void allocNodes(io.yottachain.nodemgmt.pb.AllocNodesReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getAllocNodesMethod(), responseObserver);
    }

    /**
     */
    public void syncNode(io.yottachain.nodemgmt.pb.NodeMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncNodeMethod(), responseObserver);
    }

    /**
     */
    public void getNodes(io.yottachain.nodemgmt.pb.GetNodesReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodesMethod(), responseObserver);
    }

    /**
     */
    public void getSuperNodes(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.SuperNodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSuperNodesMethod(), responseObserver);
    }

    /**
     */
    public void getSuperNodePrivateKey(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSuperNodePrivateKeyMethod(), responseObserver);
    }

    /**
     */
    public void getNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeIDByPubKeyMethod(), responseObserver);
    }

    /**
     */
    public void getNodeByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeByPubKeyMethod(), responseObserver);
    }

    /**
     */
    public void getSuperNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSuperNodeIDByPubKeyMethod(), responseObserver);
    }

    /**
     */
    public void addDNI(io.yottachain.nodemgmt.pb.DNIReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDNIMethod(), responseObserver);
    }

    /**
     */
    public void activeNodesList(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getActiveNodesListMethod(), responseObserver);
    }

    /**
     */
    public void statistics(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeStatMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getStatisticsMethod(), responseObserver);
    }

    /**
     */
    public void getSpotCheckList(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetSpotCheckListResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpotCheckListMethod(), responseObserver);
    }

    /**
     */
    public void getSTNode(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSTNodeMethod(), responseObserver);
    }

    /**
     */
    public void getSTNodes(io.yottachain.nodemgmt.pb.Int64Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSTNodesMethod(), responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.pb.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskStatusMethod(), responseObserver);
    }

    /**
     */
    public void getInvalidNodes(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetInvalidNodesResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInvalidNodesMethod(), responseObserver);
    }

    /**
     */
    public void getRebuildItem(io.yottachain.nodemgmt.pb.GetRebuildItemReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetRebuildItemResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRebuildItemMethod(), responseObserver);
    }

    /**
     */
    public void getRebuildNode(io.yottachain.nodemgmt.pb.Int64Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRebuildNodeMethod(), responseObserver);
    }

    /**
     */
    public void deleteDNI(io.yottachain.nodemgmt.pb.DNIReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDNIMethod(), responseObserver);
    }

    /**
     */
    public void finishRebuild(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getFinishRebuildMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMasterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Int32Msg,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_SET_MASTER)))
          .addMethod(
            getChangeEosURLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.StringMsg,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_CHANGE_EOS_URL)))
          .addMethod(
            getNewNodeIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.Int32Msg>(
                  this, METHODID_NEW_NODE_ID)))
          .addMethod(
            getCallAPIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.String2Msg,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_CALL_API)))
          .addMethod(
            getUpdateNodeStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.NodeMsg,
                io.yottachain.nodemgmt.pb.NodeMsg>(
                  this, METHODID_UPDATE_NODE_STATUS)))
          .addMethod(
            getIncrUsedSpaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.IncrUsedSpaceReq,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_INCR_USED_SPACE)))
          .addMethod(
            getAllocNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.AllocNodesReq,
                io.yottachain.nodemgmt.pb.NodesResp>(
                  this, METHODID_ALLOC_NODES)))
          .addMethod(
            getSyncNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.NodeMsg,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_SYNC_NODE)))
          .addMethod(
            getGetNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.GetNodesReq,
                io.yottachain.nodemgmt.pb.NodesResp>(
                  this, METHODID_GET_NODES)))
          .addMethod(
            getGetSuperNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.SuperNodesResp>(
                  this, METHODID_GET_SUPER_NODES)))
          .addMethod(
            getGetSuperNodePrivateKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Int32Msg,
                io.yottachain.nodemgmt.pb.StringMsg>(
                  this, METHODID_GET_SUPER_NODE_PRIVATE_KEY)))
          .addMethod(
            getGetNodeIDByPubKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.StringMsg,
                io.yottachain.nodemgmt.pb.Int32Msg>(
                  this, METHODID_GET_NODE_IDBY_PUB_KEY)))
          .addMethod(
            getGetNodeByPubKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.StringMsg,
                io.yottachain.nodemgmt.pb.NodeMsg>(
                  this, METHODID_GET_NODE_BY_PUB_KEY)))
          .addMethod(
            getGetSuperNodeIDByPubKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.StringMsg,
                io.yottachain.nodemgmt.pb.Int32Msg>(
                  this, METHODID_GET_SUPER_NODE_IDBY_PUB_KEY)))
          .addMethod(
            getAddDNIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.DNIReq,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_ADD_DNI)))
          .addMethod(
            getActiveNodesListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.NodesResp>(
                  this, METHODID_ACTIVE_NODES_LIST)))
          .addMethod(
            getStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.NodeStatMsg>(
                  this, METHODID_STATISTICS)))
          .addMethod(
            getGetSpotCheckListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.GetSpotCheckListResp>(
                  this, METHODID_GET_SPOT_CHECK_LIST)))
          .addMethod(
            getGetSTNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.NodeMsg>(
                  this, METHODID_GET_STNODE)))
          .addMethod(
            getGetSTNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Int64Msg,
                io.yottachain.nodemgmt.pb.NodesResp>(
                  this, METHODID_GET_STNODES)))
          .addMethod(
            getUpdateTaskStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.UpdateTaskStatusReq,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_UPDATE_TASK_STATUS)))
          .addMethod(
            getGetInvalidNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Empty,
                io.yottachain.nodemgmt.pb.GetInvalidNodesResp>(
                  this, METHODID_GET_INVALID_NODES)))
          .addMethod(
            getGetRebuildItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.GetRebuildItemReq,
                io.yottachain.nodemgmt.pb.GetRebuildItemResp>(
                  this, METHODID_GET_REBUILD_ITEM)))
          .addMethod(
            getGetRebuildNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Int64Msg,
                io.yottachain.nodemgmt.pb.NodeMsg>(
                  this, METHODID_GET_REBUILD_NODE)))
          .addMethod(
            getDeleteDNIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.DNIReq,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_DELETE_DNI)))
          .addMethod(
            getFinishRebuildMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.yottachain.nodemgmt.pb.Int32Msg,
                io.yottachain.nodemgmt.pb.Empty>(
                  this, METHODID_FINISH_REBUILD)))
          .build();
    }
  }

  /**
   * <pre>
   * node management micro-servicew
   * </pre>
   */
  public static final class YTDNMgmtStub extends io.grpc.stub.AbstractStub<YTDNMgmtStub> {
    private YTDNMgmtStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YTDNMgmtStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YTDNMgmtStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YTDNMgmtStub(channel, callOptions);
    }

    /**
     */
    public void setMaster(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMasterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeEosURL(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeEosURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newNodeID(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewNodeIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callAPI(io.yottachain.nodemgmt.pb.String2Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallAPIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNodeStatus(io.yottachain.nodemgmt.pb.NodeMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNodeStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void incrUsedSpace(io.yottachain.nodemgmt.pb.IncrUsedSpaceReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrUsedSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allocNodes(io.yottachain.nodemgmt.pb.AllocNodesReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllocNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncNode(io.yottachain.nodemgmt.pb.NodeMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodes(io.yottachain.nodemgmt.pb.GetNodesReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuperNodes(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.SuperNodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSuperNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuperNodePrivateKey(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSuperNodePrivateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeIDByPubKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodeByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeByPubKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuperNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSuperNodeIDByPubKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDNI(io.yottachain.nodemgmt.pb.DNIReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDNIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activeNodesList(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActiveNodesListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statistics(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeStatMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSpotCheckList(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetSpotCheckListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpotCheckListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSTNode(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSTNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSTNodes(io.yottachain.nodemgmt.pb.Int64Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSTNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTaskStatus(io.yottachain.nodemgmt.pb.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInvalidNodes(io.yottachain.nodemgmt.pb.Empty request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetInvalidNodesResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInvalidNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRebuildItem(io.yottachain.nodemgmt.pb.GetRebuildItemReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetRebuildItemResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRebuildItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRebuildNode(io.yottachain.nodemgmt.pb.Int64Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRebuildNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDNI(io.yottachain.nodemgmt.pb.DNIReq request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDNIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishRebuild(io.yottachain.nodemgmt.pb.Int32Msg request,
        io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinishRebuildMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * node management micro-servicew
   * </pre>
   */
  public static final class YTDNMgmtBlockingStub extends io.grpc.stub.AbstractStub<YTDNMgmtBlockingStub> {
    private YTDNMgmtBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YTDNMgmtBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YTDNMgmtBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YTDNMgmtBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty setMaster(io.yottachain.nodemgmt.pb.Int32Msg request) {
      return blockingUnaryCall(
          getChannel(), getSetMasterMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty changeEosURL(io.yottachain.nodemgmt.pb.StringMsg request) {
      return blockingUnaryCall(
          getChannel(), getChangeEosURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Int32Msg newNodeID(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getNewNodeIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty callAPI(io.yottachain.nodemgmt.pb.String2Msg request) {
      return blockingUnaryCall(
          getChannel(), getCallAPIMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodeMsg updateNodeStatus(io.yottachain.nodemgmt.pb.NodeMsg request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNodeStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty incrUsedSpace(io.yottachain.nodemgmt.pb.IncrUsedSpaceReq request) {
      return blockingUnaryCall(
          getChannel(), getIncrUsedSpaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodesResp allocNodes(io.yottachain.nodemgmt.pb.AllocNodesReq request) {
      return blockingUnaryCall(
          getChannel(), getAllocNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty syncNode(io.yottachain.nodemgmt.pb.NodeMsg request) {
      return blockingUnaryCall(
          getChannel(), getSyncNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodesResp getNodes(io.yottachain.nodemgmt.pb.GetNodesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.SuperNodesResp getSuperNodes(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSuperNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.StringMsg getSuperNodePrivateKey(io.yottachain.nodemgmt.pb.Int32Msg request) {
      return blockingUnaryCall(
          getChannel(), getGetSuperNodePrivateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Int32Msg getNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeIDByPubKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodeMsg getNodeByPubKey(io.yottachain.nodemgmt.pb.StringMsg request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeByPubKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Int32Msg getSuperNodeIDByPubKey(io.yottachain.nodemgmt.pb.StringMsg request) {
      return blockingUnaryCall(
          getChannel(), getGetSuperNodeIDByPubKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty addDNI(io.yottachain.nodemgmt.pb.DNIReq request) {
      return blockingUnaryCall(
          getChannel(), getAddDNIMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodesResp activeNodesList(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActiveNodesListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodeStatMsg statistics(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.GetSpotCheckListResp getSpotCheckList(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSpotCheckListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodeMsg getSTNode(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSTNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodesResp getSTNodes(io.yottachain.nodemgmt.pb.Int64Msg request) {
      return blockingUnaryCall(
          getChannel(), getGetSTNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty updateTaskStatus(io.yottachain.nodemgmt.pb.UpdateTaskStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.GetInvalidNodesResp getInvalidNodes(io.yottachain.nodemgmt.pb.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetInvalidNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.GetRebuildItemResp getRebuildItem(io.yottachain.nodemgmt.pb.GetRebuildItemReq request) {
      return blockingUnaryCall(
          getChannel(), getGetRebuildItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.NodeMsg getRebuildNode(io.yottachain.nodemgmt.pb.Int64Msg request) {
      return blockingUnaryCall(
          getChannel(), getGetRebuildNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty deleteDNI(io.yottachain.nodemgmt.pb.DNIReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDNIMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.yottachain.nodemgmt.pb.Empty finishRebuild(io.yottachain.nodemgmt.pb.Int32Msg request) {
      return blockingUnaryCall(
          getChannel(), getFinishRebuildMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * node management micro-servicew
   * </pre>
   */
  public static final class YTDNMgmtFutureStub extends io.grpc.stub.AbstractStub<YTDNMgmtFutureStub> {
    private YTDNMgmtFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private YTDNMgmtFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YTDNMgmtFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new YTDNMgmtFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> setMaster(
        io.yottachain.nodemgmt.pb.Int32Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMasterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> changeEosURL(
        io.yottachain.nodemgmt.pb.StringMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeEosURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Int32Msg> newNodeID(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getNewNodeIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> callAPI(
        io.yottachain.nodemgmt.pb.String2Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getCallAPIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodeMsg> updateNodeStatus(
        io.yottachain.nodemgmt.pb.NodeMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNodeStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> incrUsedSpace(
        io.yottachain.nodemgmt.pb.IncrUsedSpaceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrUsedSpaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodesResp> allocNodes(
        io.yottachain.nodemgmt.pb.AllocNodesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAllocNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> syncNode(
        io.yottachain.nodemgmt.pb.NodeMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodesResp> getNodes(
        io.yottachain.nodemgmt.pb.GetNodesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.SuperNodesResp> getSuperNodes(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSuperNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.StringMsg> getSuperNodePrivateKey(
        io.yottachain.nodemgmt.pb.Int32Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSuperNodePrivateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Int32Msg> getNodeIDByPubKey(
        io.yottachain.nodemgmt.pb.StringMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeIDByPubKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodeMsg> getNodeByPubKey(
        io.yottachain.nodemgmt.pb.StringMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeByPubKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Int32Msg> getSuperNodeIDByPubKey(
        io.yottachain.nodemgmt.pb.StringMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSuperNodeIDByPubKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> addDNI(
        io.yottachain.nodemgmt.pb.DNIReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDNIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodesResp> activeNodesList(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActiveNodesListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodeStatMsg> statistics(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.GetSpotCheckListResp> getSpotCheckList(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpotCheckListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodeMsg> getSTNode(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSTNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodesResp> getSTNodes(
        io.yottachain.nodemgmt.pb.Int64Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSTNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> updateTaskStatus(
        io.yottachain.nodemgmt.pb.UpdateTaskStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.GetInvalidNodesResp> getInvalidNodes(
        io.yottachain.nodemgmt.pb.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInvalidNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.GetRebuildItemResp> getRebuildItem(
        io.yottachain.nodemgmt.pb.GetRebuildItemReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRebuildItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.NodeMsg> getRebuildNode(
        io.yottachain.nodemgmt.pb.Int64Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRebuildNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> deleteDNI(
        io.yottachain.nodemgmt.pb.DNIReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDNIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.yottachain.nodemgmt.pb.Empty> finishRebuild(
        io.yottachain.nodemgmt.pb.Int32Msg request) {
      return futureUnaryCall(
          getChannel().newCall(getFinishRebuildMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_MASTER = 0;
  private static final int METHODID_CHANGE_EOS_URL = 1;
  private static final int METHODID_NEW_NODE_ID = 2;
  private static final int METHODID_CALL_API = 3;
  private static final int METHODID_UPDATE_NODE_STATUS = 4;
  private static final int METHODID_INCR_USED_SPACE = 5;
  private static final int METHODID_ALLOC_NODES = 6;
  private static final int METHODID_SYNC_NODE = 7;
  private static final int METHODID_GET_NODES = 8;
  private static final int METHODID_GET_SUPER_NODES = 9;
  private static final int METHODID_GET_SUPER_NODE_PRIVATE_KEY = 10;
  private static final int METHODID_GET_NODE_IDBY_PUB_KEY = 11;
  private static final int METHODID_GET_NODE_BY_PUB_KEY = 12;
  private static final int METHODID_GET_SUPER_NODE_IDBY_PUB_KEY = 13;
  private static final int METHODID_ADD_DNI = 14;
  private static final int METHODID_ACTIVE_NODES_LIST = 15;
  private static final int METHODID_STATISTICS = 16;
  private static final int METHODID_GET_SPOT_CHECK_LIST = 17;
  private static final int METHODID_GET_STNODE = 18;
  private static final int METHODID_GET_STNODES = 19;
  private static final int METHODID_UPDATE_TASK_STATUS = 20;
  private static final int METHODID_GET_INVALID_NODES = 21;
  private static final int METHODID_GET_REBUILD_ITEM = 22;
  private static final int METHODID_GET_REBUILD_NODE = 23;
  private static final int METHODID_DELETE_DNI = 24;
  private static final int METHODID_FINISH_REBUILD = 25;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final YTDNMgmtImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(YTDNMgmtImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_MASTER:
          serviceImpl.setMaster((io.yottachain.nodemgmt.pb.Int32Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_EOS_URL:
          serviceImpl.changeEosURL((io.yottachain.nodemgmt.pb.StringMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_NEW_NODE_ID:
          serviceImpl.newNodeID((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg>) responseObserver);
          break;
        case METHODID_CALL_API:
          serviceImpl.callAPI((io.yottachain.nodemgmt.pb.String2Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NODE_STATUS:
          serviceImpl.updateNodeStatus((io.yottachain.nodemgmt.pb.NodeMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg>) responseObserver);
          break;
        case METHODID_INCR_USED_SPACE:
          serviceImpl.incrUsedSpace((io.yottachain.nodemgmt.pb.IncrUsedSpaceReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_ALLOC_NODES:
          serviceImpl.allocNodes((io.yottachain.nodemgmt.pb.AllocNodesReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp>) responseObserver);
          break;
        case METHODID_SYNC_NODE:
          serviceImpl.syncNode((io.yottachain.nodemgmt.pb.NodeMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_GET_NODES:
          serviceImpl.getNodes((io.yottachain.nodemgmt.pb.GetNodesReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp>) responseObserver);
          break;
        case METHODID_GET_SUPER_NODES:
          serviceImpl.getSuperNodes((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.SuperNodesResp>) responseObserver);
          break;
        case METHODID_GET_SUPER_NODE_PRIVATE_KEY:
          serviceImpl.getSuperNodePrivateKey((io.yottachain.nodemgmt.pb.Int32Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.StringMsg>) responseObserver);
          break;
        case METHODID_GET_NODE_IDBY_PUB_KEY:
          serviceImpl.getNodeIDByPubKey((io.yottachain.nodemgmt.pb.StringMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg>) responseObserver);
          break;
        case METHODID_GET_NODE_BY_PUB_KEY:
          serviceImpl.getNodeByPubKey((io.yottachain.nodemgmt.pb.StringMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg>) responseObserver);
          break;
        case METHODID_GET_SUPER_NODE_IDBY_PUB_KEY:
          serviceImpl.getSuperNodeIDByPubKey((io.yottachain.nodemgmt.pb.StringMsg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Int32Msg>) responseObserver);
          break;
        case METHODID_ADD_DNI:
          serviceImpl.addDNI((io.yottachain.nodemgmt.pb.DNIReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_ACTIVE_NODES_LIST:
          serviceImpl.activeNodesList((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp>) responseObserver);
          break;
        case METHODID_STATISTICS:
          serviceImpl.statistics((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeStatMsg>) responseObserver);
          break;
        case METHODID_GET_SPOT_CHECK_LIST:
          serviceImpl.getSpotCheckList((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetSpotCheckListResp>) responseObserver);
          break;
        case METHODID_GET_STNODE:
          serviceImpl.getSTNode((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg>) responseObserver);
          break;
        case METHODID_GET_STNODES:
          serviceImpl.getSTNodes((io.yottachain.nodemgmt.pb.Int64Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodesResp>) responseObserver);
          break;
        case METHODID_UPDATE_TASK_STATUS:
          serviceImpl.updateTaskStatus((io.yottachain.nodemgmt.pb.UpdateTaskStatusReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_GET_INVALID_NODES:
          serviceImpl.getInvalidNodes((io.yottachain.nodemgmt.pb.Empty) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetInvalidNodesResp>) responseObserver);
          break;
        case METHODID_GET_REBUILD_ITEM:
          serviceImpl.getRebuildItem((io.yottachain.nodemgmt.pb.GetRebuildItemReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.GetRebuildItemResp>) responseObserver);
          break;
        case METHODID_GET_REBUILD_NODE:
          serviceImpl.getRebuildNode((io.yottachain.nodemgmt.pb.Int64Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.NodeMsg>) responseObserver);
          break;
        case METHODID_DELETE_DNI:
          serviceImpl.deleteDNI((io.yottachain.nodemgmt.pb.DNIReq) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
          break;
        case METHODID_FINISH_REBUILD:
          serviceImpl.finishRebuild((io.yottachain.nodemgmt.pb.Int32Msg) request,
              (io.grpc.stub.StreamObserver<io.yottachain.nodemgmt.pb.Empty>) responseObserver);
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

  private static abstract class YTDNMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YTDNMgmtBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YTDNMgmt");
    }
  }

  private static final class YTDNMgmtFileDescriptorSupplier
      extends YTDNMgmtBaseDescriptorSupplier {
    YTDNMgmtFileDescriptorSupplier() {}
  }

  private static final class YTDNMgmtMethodDescriptorSupplier
      extends YTDNMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    YTDNMgmtMethodDescriptorSupplier(String methodName) {
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
      synchronized (YTDNMgmtGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YTDNMgmtFileDescriptorSupplier())
              .addMethod(getSetMasterMethod())
              .addMethod(getChangeEosURLMethod())
              .addMethod(getNewNodeIDMethod())
              .addMethod(getCallAPIMethod())
              .addMethod(getUpdateNodeStatusMethod())
              .addMethod(getIncrUsedSpaceMethod())
              .addMethod(getAllocNodesMethod())
              .addMethod(getSyncNodeMethod())
              .addMethod(getGetNodesMethod())
              .addMethod(getGetSuperNodesMethod())
              .addMethod(getGetSuperNodePrivateKeyMethod())
              .addMethod(getGetNodeIDByPubKeyMethod())
              .addMethod(getGetNodeByPubKeyMethod())
              .addMethod(getGetSuperNodeIDByPubKeyMethod())
              .addMethod(getAddDNIMethod())
              .addMethod(getActiveNodesListMethod())
              .addMethod(getStatisticsMethod())
              .addMethod(getGetSpotCheckListMethod())
              .addMethod(getGetSTNodeMethod())
              .addMethod(getGetSTNodesMethod())
              .addMethod(getUpdateTaskStatusMethod())
              .addMethod(getGetInvalidNodesMethod())
              .addMethod(getGetRebuildItemMethod())
              .addMethod(getGetRebuildNodeMethod())
              .addMethod(getDeleteDNIMethod())
              .addMethod(getFinishRebuildMethod())
              .build();
        }
      }
    }
    return result;
  }
}
