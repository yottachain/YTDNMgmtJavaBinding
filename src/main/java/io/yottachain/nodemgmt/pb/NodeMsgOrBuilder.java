// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

public interface NodeMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb.NodeMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *data node index
   * </pre>
   *
   * <code>int32 iD = 1;</code>
   */
  int getID();

  /**
   * <pre>
   *data node ID, generated from PubKey
   * </pre>
   *
   * <code>string nodeID = 2;</code>
   */
  java.lang.String getNodeID();
  /**
   * <pre>
   *data node ID, generated from PubKey
   * </pre>
   *
   * <code>string nodeID = 2;</code>
   */
  com.google.protobuf.ByteString
      getNodeIDBytes();

  /**
   * <pre>
   *public key of data node
   * </pre>
   *
   * <code>string pubKey = 3;</code>
   */
  java.lang.String getPubKey();
  /**
   * <pre>
   *public key of data node
   * </pre>
   *
   * <code>string pubKey = 3;</code>
   */
  com.google.protobuf.ByteString
      getPubKeyBytes();

  /**
   * <pre>
   *owner account of this miner
   * </pre>
   *
   * <code>string owner = 4;</code>
   */
  java.lang.String getOwner();
  /**
   * <pre>
   *owner account of this miner
   * </pre>
   *
   * <code>string owner = 4;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   *profit account of this miner
   * </pre>
   *
   * <code>string profitAcc = 5;</code>
   */
  java.lang.String getProfitAcc();
  /**
   * <pre>
   *profit account of this miner
   * </pre>
   *
   * <code>string profitAcc = 5;</code>
   */
  com.google.protobuf.ByteString
      getProfitAccBytes();

  /**
   * <pre>
   *ID of associated miner pool
   * </pre>
   *
   * <code>string poolID = 6;</code>
   */
  java.lang.String getPoolID();
  /**
   * <pre>
   *ID of associated miner pool
   * </pre>
   *
   * <code>string poolID = 6;</code>
   */
  com.google.protobuf.ByteString
      getPoolIDBytes();

  /**
   * <pre>
   *quota allocated by associated miner pool
   * </pre>
   *
   * <code>int64 quota = 7;</code>
   */
  long getQuota();

  /**
   * <pre>
   *listening addresses of data node
   * </pre>
   *
   * <code>repeated string addrs = 8;</code>
   */
  java.util.List<java.lang.String>
      getAddrsList();
  /**
   * <pre>
   *listening addresses of data node
   * </pre>
   *
   * <code>repeated string addrs = 8;</code>
   */
  int getAddrsCount();
  /**
   * <pre>
   *listening addresses of data node
   * </pre>
   *
   * <code>repeated string addrs = 8;</code>
   */
  java.lang.String getAddrs(int index);
  /**
   * <pre>
   *listening addresses of data node
   * </pre>
   *
   * <code>repeated string addrs = 8;</code>
   */
  com.google.protobuf.ByteString
      getAddrsBytes(int index);

  /**
   * <pre>
   *CPU usage of data node
   * </pre>
   *
   * <code>int32 cPU = 9;</code>
   */
  int getCPU();

  /**
   * <pre>
   *memory usage of data node
   * </pre>
   *
   * <code>int32 memory = 10;</code>
   */
  int getMemory();

  /**
   * <pre>
   *bandwidth usage of data node
   * </pre>
   *
   * <code>int32 bandwidth = 11;</code>
   */
  int getBandwidth();

  /**
   * <pre>
   *max space of data node
   * </pre>
   *
   * <code>int64 maxDataSpace = 12;</code>
   */
  long getMaxDataSpace();

  /**
   * <pre>
   *space assigned to YTFS
   * </pre>
   *
   * <code>int64 assignedSpace = 13;</code>
   */
  long getAssignedSpace();

  /**
   * <pre>
   *pre-allocated space of data node
   * </pre>
   *
   * <code>int64 productiveSpace = 14;</code>
   */
  long getProductiveSpace();

  /**
   * <pre>
   *used space of data node
   * </pre>
   *
   * <code>int64 usedSpace = 15;</code>
   */
  long getUsedSpace();

  /**
   * <pre>
   *weight for allocate data node
   * </pre>
   *
   * <code>double weight = 16;</code>
   */
  double getWeight();

  /**
   * <pre>
   *Is node valid
   * </pre>
   *
   * <code>int32 valid = 17;</code>
   */
  int getValid();

  /**
   * <pre>
   *Is relay node
   * </pre>
   *
   * <code>int32 relay = 18;</code>
   */
  int getRelay();

  /**
   * <pre>
   *status code: 0 - registered 1 - active
   * </pre>
   *
   * <code>int32 status = 19;</code>
   */
  int getStatus();

  /**
   * <pre>
   *timestamp of status updating operation
   * </pre>
   *
   * <code>int64 timestamp = 20;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   *version number of miner
   * </pre>
   *
   * <code>int32 version = 21;</code>
   */
  int getVersion();

  /**
   * <pre>
   *if node is under rebuilding
   * </pre>
   *
   * <code>int32 rebuilding = 22;</code>
   */
  int getRebuilding();
}
