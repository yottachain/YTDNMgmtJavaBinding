package io.yottachain.nodemgmt.core.interfaces;

import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.vo.*;

import java.util.List;
import java.util.Map;

public interface NodeMgmtInterface {
    int newNodeID() throws NodeMgmtException;
    void preRegisterNode(String trx) throws NodeMgmtException;
    void changeMinerPool(String trx) throws NodeMgmtException;
    Node registerNode(Node node) throws NodeMgmtException;
    Node updateNodeStatus(Node node) throws NodeMgmtException;
    List<Node> allocNodes(int shardCount, int[] errIDs) throws NodeMgmtException;
    void syncNode(Node node) throws NodeMgmtException;
    List<Node> getNodes(List<Integer> nodeIDs) throws NodeMgmtException;
    List<SuperNode> getSuperNodes() throws NodeMgmtException;
    String getSuperNodePrivateKey(int id) throws NodeMgmtException;
    Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException;
    Node getNodeByPubKey(String pubkey) throws NodeMgmtException;
    Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException;
    void addDNI(int id, byte[] shard) throws NodeMgmtException;
    List<Node> activeNodesList() throws NodeMgmtException;
    Map<String, Long> statistics() throws NodeMgmtException;
    List<SpotCheckList> getSpotCheckList() throws NodeMgmtException;
    Node getSTNode() throws NodeMgmtException;
    List<Node> getSTNodes(long count) throws NodeMgmtException;
    void updateTaskStatus(String id, int[] nodeIDs) throws NodeMgmtException;
    List<ShardCount> getInvalidNodes() throws NodeMgmtException;
    RebuildItem getRebuildItem(int minerID, long index, long total) throws NodeMgmtException;
    void deleteDNI(int id, byte[] shard) throws NodeMgmtException;
}
