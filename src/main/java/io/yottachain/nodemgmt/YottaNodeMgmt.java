package io.yottachain.nodemgmt;

import io.yottachain.nodemgmt.core.NodeMgmt;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.vo.Node;
import io.yottachain.nodemgmt.core.vo.SuperNode;

import java.util.List;

public class YottaNodeMgmt {
    public static void start(String mongoURL, String eosURL) throws NodeMgmtException {
        NodeMgmt.start(mongoURL, eosURL);
    }

    public static Node registerNode(String nodeid, String pubkey, String owner, long maxDataSpace, List<String> addrs) throws NodeMgmtException {
        Node node = new Node();
        node.setNodeid(nodeid);
        node.setPubkey(pubkey);
        node.setOwner(owner);
        node.setMaxDataSpace(maxDataSpace);
        node.setAddrs(addrs);
        return  NodeMgmt.registerNode(node);
    }

    public static Node updateNodeStatus(int id, int cpu, int memory, int bandwidth, long maxDataSpace, List<String> addrs) throws NodeMgmtException {
        Node node = new Node();
        node.setId(id);
        node.setCpu(cpu);
        node.setMemory(memory);
        node.setBandwidth(bandwidth);
        node.setMaxDataSpace(maxDataSpace);
        node.setAddrs(addrs);
        return  NodeMgmt.updateNodeStatus(node);
    }

    public static List<Node> allocNodes(int shardCount) throws NodeMgmtException {
        return NodeMgmt.allocNodes(shardCount);
    }

    public static List<Node> getNodes(List<Integer> nodes) throws NodeMgmtException {
        return NodeMgmt.getNodes(nodes);
    }

    public static List<SuperNode> getSuperNodes() throws NodeMgmtException {
        return NodeMgmt.getSuperNodes();
    }

    public static String getSuperNodePrivateKey(int id) throws NodeMgmtException {
        return NodeMgmt.getSuperNodePrivateKey(id);
    }

    public static Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        return NodeMgmt.getNodeIDByPubKey(pubkey);
    }

    public static Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        return NodeMgmt.getSuperNodeIDByPubKey(pubkey);
    }

    public static void addDNI(int id, byte[] shard) throws NodeMgmtException {
        NodeMgmt.addDNI(id, shard);
    }
}
