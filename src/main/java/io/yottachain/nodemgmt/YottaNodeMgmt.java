package io.yottachain.nodemgmt;

import io.yottachain.nodemgmt.core.NodeMgmt;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.vo.Node;
import io.yottachain.nodemgmt.core.vo.SuperNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static List<Map<String, String>> activeNodesList() throws NodeMgmtException {
        List<Node> list = NodeMgmt.activeNodesList();
        List<Map<String, String>> result = new ArrayList<>();
        for (Node n : list) {
            Map<String, String> m = new HashMap<>();
            List<String> addrs = n.getAddrs();
            String ip = checkPublicIP(addrs);
            if (ip != null) {
                m.put("id", Integer.toString(n.getId()));
                m.put("ip", ip);
                result.add(m);
            }
        }
        return result;
    }

    public static Map<String, Long> statistics() throws NodeMgmtException {
        return NodeMgmt.statistics();
    }

    private static String checkPublicIP(List<String> addrs) {
        for (String addr : addrs) {
            if (addr.startsWith("/ip4/127.0.0.1") ||
                    addr.startsWith("/ip4/192.168.") ||
                    addr.startsWith("/ip4/10.") ||
                    addr.startsWith("/ip4/172.16.") ||
                    addr.startsWith("/ip4/172.17.") ||
                    addr.startsWith("/ip4/172.18.") ||
                    addr.startsWith("/ip4/172.19.") ||
                    addr.startsWith("/ip4/172.20.") ||
                    addr.startsWith("/ip4/172.21.") ||
                    addr.startsWith("/ip4/172.22.") ||
                    addr.startsWith("/ip4/172.23.") ||
                    addr.startsWith("/ip4/172.24.") ||
                    addr.startsWith("/ip4/172.25.") ||
                    addr.startsWith("/ip4/172.26.") ||
                    addr.startsWith("/ip4/172.27.") ||
                    addr.startsWith("/ip4/172.28.") ||
                    addr.startsWith("/ip4/172.29.") ||
                    addr.startsWith("/ip4/172.30.") ||
                    addr.startsWith("/ip4/172.31.") ||
                    addr.startsWith("/p2p-circuit/")
                    ) {
                continue;
            } else {
                return addr;
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        YottaNodeMgmt.start("mongodb://127.0.0.1:27017", "http://152.136.11.202:8888");
        List<Node> nodes = YottaNodeMgmt.allocNodes(10);
        List<Map<String, String>> actives = YottaNodeMgmt.activeNodesList();
        Map<String, Long> map = NodeMgmt.statistics();
        System.out.println(map.get("activeMiner"));
//        NodeMgmt.addDNI(2, "abc".getBytes());
//        NodeMgmt.incrUsedSpace(4,5);
//        YottaNodeMgmt.registerNode("16Uiu2HAm5hqd85Hzpvvg4BfVBVfAsXPaRMj9YNhwkkGnD2Qiqxn9", "hahaha","user1234", 1000l, Arrays.asList(new String[]{"/ip4/127.0.0.1/tcp/2222"}));
//        Node node = new Node(11, "123", "456", "user123", Arrays.asList("/ip4/127.0.0.1/tcp/1888", "/ip4/10.0.1.2/tcp/1888"),10, 20, 30, 40, 50, 60, 70);
//        node = NodeMgmt.updateNodeStatus(node);
//        System.out.println("===========================");
//        System.out.println("ID: " + node.getId());
//        System.out.println("NODE ID: " + node.getNodeid());
//        System.out.println("PUBKEY: " + node.getPubkey());
//        System.out.println("ADDRS: " + node.getAddrs().size());



//        List<Node> nodes = NodeMgmt.allocNodes(100);
//        //List<Node> nodes = NodeMgmt.getNodes(Arrays.asList(new Integer[]{1}));
//        for (Node n : nodes) {
//            System.out.println("===========================");
//            System.out.println("ID: " + n.getId());
//            System.out.println("NODE ID: " + n.getNodeid());
//            System.out.println("PUBKEY: " + n.getPubkey());
//            System.out.println("ADDRS: " + n.getAddrs().size());
//        }
//
//        List<SuperNode> supernodes = NodeMgmt.getSuperNodes();
//        for (SuperNode n : supernodes) {
//            System.out.println("===========================");
//            System.out.println("ID: " + n.getId());
//            System.out.println("NODE ID: " + n.getNodeid());
//            System.out.println("PUBKEY: " + n.getPubkey());
//            System.out.println("PRIVKEY: " + n.getPrivkey());
//            System.out.println("ADDRS: " + n.getAddrs().size());
//        }
//        System.out.println("PK: " + NodeMgmt.getNodeIDByPubKey("5JvCxXLSLzihWdXT7C9mtQkfLFHJZPdX1hxQo6su7dNt28mZ5W2"));
    }
}
