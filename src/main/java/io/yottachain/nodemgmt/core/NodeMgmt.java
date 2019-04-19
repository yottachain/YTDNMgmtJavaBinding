package io.yottachain.nodemgmt.core;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.vo.Node;
import io.yottachain.nodemgmt.core.vo.SuperNode;
import io.yottachain.nodemgmt.core.wrapper.NodeMgmtWrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NodeMgmt {

    public static void start(String urls) throws NodeMgmtException {
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.NewInstance(urls);
        if (errPtr != null) {
            String err = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(err);
        }
    }

    public static List<Node> allocNodes(int shardCount) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.AllocNodes(shardCount);
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Allocnoderet allocNodeRet = new NodeMgmtWrapper.Allocnoderet(ptr);
                if (allocNodeRet.error != null) {
                    String err = allocNodeRet.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                if (allocNodeRet.nodes == null) {
                    return null;
                }
                Pointer[] pVals = allocNodeRet.nodes.getPointerArray(0, allocNodeRet.size);
                List<Node> nodeList = new ArrayList<>();
                for (Pointer p : pVals) {
                    NodeMgmtWrapper.Node n = new NodeMgmtWrapper.Node(p);
                    int id = n.id;
                    String nodeid = (n.nodeid==null)?null:n.nodeid.getString(0);
                    String pubkey = (n.pubkey==null)?null:n.pubkey.getString(0);
                    String[] addrs = (n.addrs==null)?null:n.addrs.getStringArray(0, n.addrsize);
                    Node node = new Node(id, nodeid, pubkey, Arrays.asList(addrs));
                    nodeList.add(node);
                }
                return nodeList;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeAllocnoderet(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static List<Node> getNodes(List<Integer> nodes) throws NodeMgmtException {
        Pointer param = new Memory(nodes.size() * Native.getNativeSize(Integer.TYPE));
        for (int i=0; i<nodes.size(); i++) {
            param.setInt(i * Native.getNativeSize(Integer.TYPE), nodes.get(i));
        }
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetNodes(param, nodes.size());
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Allocnoderet allocNodeRet = new NodeMgmtWrapper.Allocnoderet(ptr);
                if (allocNodeRet.error != null) {
                    String err = allocNodeRet.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                if (allocNodeRet.nodes == null) {
                    return null;
                }
                Pointer[] pVals = allocNodeRet.nodes.getPointerArray(0, allocNodeRet.size);
                List<Node> nodeList = new ArrayList<>();
                for (Pointer p : pVals) {
                    NodeMgmtWrapper.Node n = new NodeMgmtWrapper.Node(p);
                    int id = n.id;
                    String nodeid = (n.nodeid==null)?null:n.nodeid.getString(0);
                    String pubkey = (n.pubkey==null)?null:n.pubkey.getString(0);
                    String[] addrs = (n.addrs==null)?null:n.addrs.getStringArray(0, n.addrsize);
                    Node node = new Node(id, nodeid, pubkey, Arrays.asList(addrs));
                    nodeList.add(node);
                }
                return nodeList;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeAllocnoderet(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static List<SuperNode> getSuperNodes() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSuperNodes();
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Allocsupernoderet allocSuperNodeRet = new NodeMgmtWrapper.Allocsupernoderet(ptr);
                if (allocSuperNodeRet.error != null) {
                    String err = allocSuperNodeRet.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                if (allocSuperNodeRet.supernodes == null) {
                    throw new NodeMgmtException("no super nodes record in mongodb");
                }
                Pointer[] pVals = allocSuperNodeRet.supernodes.getPointerArray(0, allocSuperNodeRet.size);
                List<SuperNode> superNodeList = new ArrayList<>();
                for (Pointer p : pVals) {
                    NodeMgmtWrapper.SuperNode sn = new NodeMgmtWrapper.SuperNode(p);
                    int id = sn.id;
                    String nodeid = (sn.nodeid==null)?null:sn.nodeid.getString(0);
                    String pubkey = (sn.pubkey==null)?null:sn.pubkey.getString(0);
                    String privkey = (sn.privkey==null)?null:sn.privkey.getString(0);
                    String[] addrs = (sn.addrs==null)?null:sn.addrs.getStringArray(0, sn.addrsize);
                    SuperNode supernode = new SuperNode(id, nodeid, pubkey, privkey, Arrays.asList(addrs));
                    superNodeList.add(supernode);
                }
                return superNodeList;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeAllocsupernoderet(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static String getSuperNodePrivateKey(int id) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSuperNodePrivateKey(id);
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Stringwitherror swe = new NodeMgmtWrapper.Stringwitherror(ptr);
                if (swe.error != null) {
                    String err = swe.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                if (swe.str==null) {
                    return null;
                }
                return swe.str.getString(0);
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeStringwitherror(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetNodeIDByPubKey(pubkey);
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Intwitherror iwe = new NodeMgmtWrapper.Intwitherror(ptr);
                if (iwe.error != null) {
                    String err = iwe.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return iwe.id;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeIntwitherror(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSuperNodeIDByPubKey(pubkey);
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Intwitherror iwe = new NodeMgmtWrapper.Intwitherror(ptr);
                if (iwe.error != null) {
                    String err = iwe.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return iwe.id;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeIntwitherror(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public static void main(String[] args) throws Exception {
        NodeMgmt.start("mongodb://localhost:27017");
        // List<Node> nodes = NodeMgmt.allocNodes(100);
//        List<Node> nodes = NodeMgmt.getNodes(Arrays.asList(new Integer[]{1}));
//        for (Node n : nodes) {
//            System.out.println("===========================");
//            System.out.println("ID: " + n.getId());
//            System.out.println("NODE ID: " + n.getNodeid());
//            System.out.println("PUBKEY: " + n.getPubkey());
//            System.out.println("ADDRS: " + n.getAddrs().size());
//        }

        List<SuperNode> supernodes = NodeMgmt.getSuperNodes();
        for (SuperNode n : supernodes) {
            System.out.println("===========================");
            System.out.println("ID: " + n.getId());
            System.out.println("NODE ID: " + n.getNodeid());
            System.out.println("PUBKEY: " + n.getPubkey());
            System.out.println("PRIVKEY: " + n.getPrivkey());
            System.out.println("ADDRS: " + n.getAddrs().size());
        }
        System.out.println("PK: " + NodeMgmt.getNodeIDByPubKey("3333333"));
    }
}
