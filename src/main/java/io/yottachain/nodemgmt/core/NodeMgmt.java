package io.yottachain.nodemgmt.core;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.interfaces.NodeMgmtInterface;
import io.yottachain.nodemgmt.core.vo.*;
import io.yottachain.nodemgmt.core.wrapper.NodeMgmtWrapper;

import java.util.*;

public class NodeMgmt implements NodeMgmtInterface {

    public NodeMgmt(String mongoURL, String eosURL, String bpAccount, String bpPrivkey, String contractOwnerM, String contractOwnerD,int bpid) throws NodeMgmtException {
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.NewInstance(mongoURL, eosURL, bpAccount, bpPrivkey, contractOwnerM, contractOwnerD, bpid);
        if (errPtr != null) {
            String err = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(err);
        }
    }

    public int newNodeID() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.NewNodeID();
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

    public void preRegisterNode(String trx) throws NodeMgmtException {
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.PreRegisterNode(trx);
        if (errPtr != null) {
            String errstr = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(errstr);
        }
    }

    public void changeMinerPool(String trx) throws NodeMgmtException {
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.ChangeMinerPool(trx);
        if (errPtr != null) {
            String errstr = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(errstr);
        }
    }

    public Node registerNode(Node node) throws NodeMgmtException {
        if (node == null) {
            throw new NodeMgmtException("register node cannot be null.");
        }
        NodeMgmtWrapper.Node ntnode = new NodeMgmtWrapper.Node();
        ntnode.fill(node);
        Pointer nodePtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.RegisterNode(ntnode);
        if (nodePtr != null) {
            try {
                NodeMgmtWrapper.Node retnode = new NodeMgmtWrapper.Node(nodePtr);
                if (retnode.error != null) {
                    String err = retnode.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return retnode.convertTo();
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeNode(nodePtr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public Node updateNodeStatus(Node node) throws NodeMgmtException {
        if (node == null) {
            throw new NodeMgmtException("update status cannot be null.");
        }
        NodeMgmtWrapper.Node ntnode = new NodeMgmtWrapper.Node();
        ntnode.fill(node);
        Pointer nodePtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.UpdateNodeStatus(ntnode);
        if (nodePtr != null) {
            try {
                NodeMgmtWrapper.Node retnode = new NodeMgmtWrapper.Node(nodePtr);
                if (retnode.error != null) {
                    String err = retnode.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return retnode.convertTo();
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeNode(nodePtr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public void incrUsedSpace(int id, long incr) throws NodeMgmtException {
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.IncrUsedSpace(id, incr);
        if (errPtr != null) {
            String errstr = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(errstr);
        }
    }

    public List<Node> allocNodes(int shardCount, int[] errIDs) throws NodeMgmtException {
        Pointer param = null;
        int size = 0;
        if (errIDs!=null && errIDs.length>0) {
            param = new Memory(errIDs.length * Native.getNativeSize(Integer.TYPE));
            for (int i = 0; i < errIDs.length; i++) {
                param.setInt(i * Native.getNativeSize(Integer.TYPE), errIDs[i]);
            }
            size = errIDs.length;
        }
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.AllocNodes(shardCount, param, size);
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
                    Node node = new Node(id, nodeid, pubkey, addrs==null?null:Arrays.asList(addrs));
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

    public void syncNode(Node node) throws NodeMgmtException {
        if (node == null) {
            throw new NodeMgmtException("update status cannot be null.");
        }
        NodeMgmtWrapper.Node ntnode = new NodeMgmtWrapper.Node();
        ntnode.fill(node);
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.SyncNode(ntnode);
        if (errPtr != null) {
            String errstr = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(errstr);
        }
    }

    public List<Node> getNodes(List<Integer> nodes) throws NodeMgmtException {
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

    public List<SuperNode> getSuperNodes() throws NodeMgmtException {
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

    public String getSuperNodePrivateKey(int id) throws NodeMgmtException {
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

    public Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException {
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

    public Node getNodeByPubKey(String pubkey) throws NodeMgmtException {
        Pointer nodePtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetNodeByPubKey(pubkey);
        if (nodePtr != null) {
            try {
                NodeMgmtWrapper.Node retnode = new NodeMgmtWrapper.Node(nodePtr);
                if (retnode.error != null) {
                    String err = retnode.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return retnode.convertTo();
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeNode(nodePtr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException {
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

    public void addDNI(int id, byte[] shard) throws NodeMgmtException {
        Pointer shardPtr = new Memory(Native.getNativeSize(Byte.TYPE) * shard.length);
        for (int i=0; i<shard.length; i++) {
            shardPtr.setByte(i, shard[i]);
        }
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.AddDNI(id, shardPtr, shard.length);
        Native.free(Pointer.nativeValue(shardPtr));
        Pointer.nativeValue(shardPtr, 0);
        if (errPtr != null) {
            String err = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(err);
        }
    }

    public List<Node> activeNodesList() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.ActiveNodesList();
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

    public Map<String, Long> statistics() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.Statistics();
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Nodestatret nodestatret = new NodeMgmtWrapper.Nodestatret(ptr);
                if (nodestatret.error != null) {
                    String err = nodestatret.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                Map<String, Long> map = new HashMap<>();
                map.put("activeMiner", nodestatret.activeMiners);
                map.put("totalMiner", nodestatret.totalMiners);
                map.put("maxDataSpace", nodestatret.maxTotal);
                map.put("assignedSpace", nodestatret.assignedTotal);
                map.put("productiveSpace", nodestatret.productiveTotal);
                map.put("usedSpace", nodestatret.usedTotal);
                return map;
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeNodestatret(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public List<SpotCheckList> getSpotCheckList() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSpotCheckList();
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Spotchecklists spotchecklists = new NodeMgmtWrapper.Spotchecklists(ptr);
                if (spotchecklists.error != null) {
                    String err = spotchecklists.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                List<SpotCheckList> spotCheckList = new ArrayList<SpotCheckList>();
                if (spotchecklists.list != null) {
                    Pointer[] ptrs = spotchecklists.list.getPointerArray(0, spotchecklists.size);
                    for (int i = 0; i< ptrs.length; i++){
                        Pointer p = ptrs[i];
                        NodeMgmtWrapper.Spotchecklist sclist = new NodeMgmtWrapper.Spotchecklist(p);
                        spotCheckList.add(sclist.convertTo());
                    }
                }
                return spotCheckList;

            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeSpotchecklists(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public Node getSTNode() throws NodeMgmtException {
        Pointer nodePtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSTNode();
        if (nodePtr != null) {
            try {
                NodeMgmtWrapper.Node retnode = new NodeMgmtWrapper.Node(nodePtr);
                if (retnode.error != null) {
                    String err = retnode.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return retnode.convertTo();
            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeNode(nodePtr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public List<Node> getSTNodes(long count) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetSTNodes(count);
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
                    Node node = n.convertTo();
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

    public void updateTaskStatus(String id, int[] nodeIDs) throws NodeMgmtException {
        Pointer param = null;
        if (nodeIDs != null) {
            param = new Memory(nodeIDs.length * Native.getNativeSize(Integer.TYPE));
            for (int i = 0; i < nodeIDs.length; i++) {
                param.setInt(i * Native.getNativeSize(Integer.TYPE), nodeIDs[i]);
            }
        }
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.UpdateTaskStatus(id, param, nodeIDs!=null?nodeIDs.length:0);
        if (param != null) {
            Native.free(Pointer.nativeValue(param));
            Pointer.nativeValue(param, 0);
        }
        if (errPtr != null) {
            String err = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(err);
        }
    }

    public List<ShardCount> getInvalidNodes() throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetInvalidNodes();
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Shardcountlist shardcountlist = new NodeMgmtWrapper.Shardcountlist(ptr);
                if (shardcountlist.error != null) {
                    String err = shardcountlist.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                List<ShardCount> shardcounts = new ArrayList<ShardCount>();
                if (shardcountlist.shardcounts != null) {
                    Pointer[] ptrs = shardcountlist.shardcounts.getPointerArray(0, shardcountlist.size);
                    for (int i = 0; i< ptrs.length; i++){
                        Pointer p = ptrs[i];
                        NodeMgmtWrapper.Shardcount sc = new NodeMgmtWrapper.Shardcount(p);
                        shardcounts.add(sc.convertTo());
                    }
                }
                return shardcounts.size()==0 ? null : shardcounts;

            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeShardcountlist(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public RebuildItem getRebuildItem(int minerID, long index, long total) throws NodeMgmtException {
        Pointer ptr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.GetRebuildItem(minerID, index, total);
        if (ptr != null) {
            try {
                NodeMgmtWrapper.Rebuilditem rebuilditem = new NodeMgmtWrapper.Rebuilditem(ptr);
                if (rebuilditem.error != null) {
                    String err = rebuilditem.error.getString(0);
                    throw new NodeMgmtException(err);
                }
                return rebuilditem.convertTo();

            } finally {
                NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeRebuilditem(ptr);
            }
        } else {
            throw new NodeMgmtException("unknown exception");
        }
    }

    public void deleteDNI(int id, byte[] shard) throws NodeMgmtException {
        Pointer shardPtr = new Memory(Native.getNativeSize(Byte.TYPE) * shard.length);
        for (int i=0; i<shard.length; i++) {
            shardPtr.setByte(i, shard[i]);
        }
        Pointer errPtr = NodeMgmtWrapper.NodeMgmtLib.INSTANCE.DeleteDNI(id, shardPtr, shard.length);
        Native.free(Pointer.nativeValue(shardPtr));
        Pointer.nativeValue(shardPtr, 0);
        if (errPtr != null) {
            String err = errPtr.getString(0);
            NodeMgmtWrapper.NodeMgmtLib.INSTANCE.FreeString(errPtr);
            throw new NodeMgmtException(err);
        }
    }

}
