// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.rebuilder.pb;

public interface NodeStatMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pbrebuilder.NodeStatMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * count of active miners
   * </pre>
   *
   * <code>int64 activeMiners = 1;</code>
   */
  long getActiveMiners();

  /**
   * <pre>
   * count of all miners
   * </pre>
   *
   * <code>int64 totalMiners = 2;</code>
   */
  long getTotalMiners();

  /**
   * <pre>
   * total disk size of all miners' storage
   * </pre>
   *
   * <code>int64 maxTotal = 3;</code>
   */
  long getMaxTotal();

  /**
   * <pre>
   * total amount of all miners' assigned space
   * </pre>
   *
   * <code>int64 assignedTotal = 4;</code>
   */
  long getAssignedTotal();

  /**
   * <pre>
   * total amount of all miners' productive space
   * </pre>
   *
   * <code>int64 productiveTotal = 5;</code>
   */
  long getProductiveTotal();

  /**
   * <pre>
   * total amount of all miners' used space
   * </pre>
   *
   * <code>int64 usedTotal = 6;</code>
   */
  long getUsedTotal();
}
