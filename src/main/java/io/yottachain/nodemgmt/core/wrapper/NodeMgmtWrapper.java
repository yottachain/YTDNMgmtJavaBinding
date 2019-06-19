package io.yottachain.nodemgmt.core.wrapper;

import com.sun.jna.*;
import io.yottachain.nodemgmt.core.vo.SpotCheckList;
import io.yottachain.nodemgmt.core.vo.SpotCheckTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NodeMgmtWrapper {

    public static class Node extends Structure {

        public int id;
        public Pointer nodeid;
        public Pointer pubkey;
        public Pointer owner;
        public Pointer addrs;
        public int addrsize;
        public int cpu;
        public int memory;
        public int bandwidth;
        public long maxDataSpace;
        public long assignedSpace;
        public long productiveSpace;
        public long usedSpace;
        public int relay;
        public Pointer error;

        public Node() {
            super();
        }

        public Node(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "nodeid", "pubkey", "owner", "addrs", "addrsize", "cpu", "memory", "bandwidth", "maxDataSpace", "assignedSpace", "productiveSpace", "usedSpace", "relay", "error"});
        }

        public void fill(io.yottachain.nodemgmt.core.vo.Node node) {
            if (node==null) {
                throw new RuntimeException("node cannot be null");
            }
            this.id = node.getId();
            if (node.getNodeid() != null) {
                this.nodeid = new Memory(node.getNodeid().length() + 1);
                this.nodeid.setString(0, node.getNodeid());
            }
            if (node.getPubkey() != null) {
                this.pubkey = new Memory(node.getPubkey().length() + 1);
                this.pubkey.setString(0, node.getPubkey());
            }
            if (node.getOwner() != null) {
                this.owner = new Memory(node.getOwner().length() + 1);
                this.owner.setString(0, node.getOwner());
            }
            if (node.getAddrs() != null) {
                this.addrs = new StringArray(node.getAddrs().toArray(new String[0]));
                this.addrsize = node.getAddrs().size();
            }
            this.cpu = node.getCpu();
            this.memory = node.getMemory();
            this.bandwidth = node.getBandwidth();
            this.maxDataSpace = node.getMaxDataSpace();
            this.assignedSpace = node.getAssignedSpace();
            this.productiveSpace = node.getProductiveSpace();
            this.usedSpace = node.getUsedSpace();
            this.relay = node.getRelay();
        }

        public io.yottachain.nodemgmt.core.vo.Node convertTo() {
            io.yottachain.nodemgmt.core.vo.Node node = new io.yottachain.nodemgmt.core.vo.Node();
            node.setId(this.id);
            node.setNodeid(this.nodeid!=null?this.nodeid.getString(0):null);
            node.setPubkey(this.pubkey!=null?this.pubkey.getString(0):null);
            node.setOwner(this.owner!=null?this.owner.getString(0):null);
            node.setAddrs(this.addrs!=null?Arrays.asList(this.addrs.getStringArray(0, this.addrsize)):null);
            node.setCpu(this.cpu);
            node.setMemory(this.memory);
            node.setBandwidth(this.bandwidth);
            node.setMaxDataSpace(this.maxDataSpace);
            node.setAssignedSpace(this.assignedSpace);
            node.setProductiveSpace(this.productiveSpace);
            node.setUsedSpace(this.usedSpace);
            node.setRelay(this.relay);
            return node;
        }
    }

    public static class SuperNode extends Structure {
        public int id;
        public Pointer nodeid;
        public Pointer pubkey;
        public Pointer privkey;
        public Pointer addrs;
        public int addrsize;
        public Pointer error;

        public SuperNode() {
            super();
        }

        public SuperNode(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "nodeid", "pubkey", "privkey", "addrs", "addrsize", "error"});
        }

        public void fill(io.yottachain.nodemgmt.core.vo.SuperNode supernode) {
            if (supernode==null) {
                throw new RuntimeException("supernode cannot be null");
            }
            this.id = supernode.getId();
            if (supernode.getNodeid() != null) {
                this.nodeid = new Memory(supernode.getNodeid().length() + 1);
                this.nodeid.setString(0, supernode.getNodeid());
            }
            if (supernode.getPubkey() != null) {
                this.pubkey = new Memory(supernode.getPubkey().length() + 1);
                this.pubkey.setString(0, supernode.getPubkey());
            }
            if (supernode.getPrivkey() != null) {
                this.privkey = new Memory(supernode.getPrivkey().length() + 1);
                this.privkey.setString(0, supernode.getPrivkey());
            }
            if (supernode.getAddrs() != null) {
                this.addrs = new StringArray(supernode.getAddrs().toArray(new String[0]));
                this.addrsize = supernode.getAddrs().size();
            }
        }

        public io.yottachain.nodemgmt.core.vo.SuperNode convertTo() {
            io.yottachain.nodemgmt.core.vo.SuperNode supernode = new io.yottachain.nodemgmt.core.vo.SuperNode();
            supernode.setId(this.id);
            supernode.setNodeid(this.nodeid!=null?this.nodeid.getString(0):null);
            supernode.setPubkey(this.pubkey!=null?this.pubkey.getString(0):null);
            supernode.setPrivkey(this.privkey!=null?this.privkey.getString(0):null);
            supernode.setAddrs(this.addrs!=null?Arrays.asList(this.addrs.getStringArray(0, this.addrsize)):null);
            return supernode;
        }
    }

    public static class Allocnoderet extends Structure {
        public Pointer nodes;
        public int size;
        public Pointer error;

        public Allocnoderet(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"nodes", "size", "error"});
        }
    }

    public static class Allocsupernoderet extends Structure {
        public Pointer supernodes;
        public int size;
        public Pointer error;

        public Allocsupernoderet(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"supernodes", "size", "error"});
        }
    }

    public static class Nodestatret extends Structure {
        public long activeMiners;
        public long totalMiners;
        public long maxTotal;
        public long assignedTotal;
        public long productiveTotal;
        public long usedTotal;
        public Pointer error;

        public Nodestatret(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"activeMiners", "totalMiners", "maxTotal", "assignedTotal", "productiveTotal", "usedTotal", "error"});
        }

    }

    public static class Spotchecklists extends Structure {
        public Pointer list;
        public int size;
        public Pointer error;

        public Spotchecklists(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"list", "size", "error"});
        }
    }

    public static class Spotchecklist extends Structure {
        public Pointer taskid;
        public Pointer tasklist;
        public int size;
        public int progress;
        public long timestamp;
        public long duration;

        public Spotchecklist(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"taskid", "tasklist", "size", "progress", "timestamp", "duration"});
        }

        public SpotCheckList convertTo() {
            SpotCheckList list = new SpotCheckList();
            list.setTaskID(this.taskid!=null?this.taskid.getString(0): null);
            list.setProgress(this.progress);
            list.setDuration(this.duration);
            list.setTimestamp(this.timestamp);
            if (this.tasklist != null) {
                List<SpotCheckTask> tasklist = new ArrayList<SpotCheckTask>();
                Pointer[] ptrs = this.tasklist.getPointerArray(0, this.size);
                for (int i = 0; i< ptrs.length; i++){
                    Pointer p = ptrs[i];
                    NodeMgmtWrapper.Spotchecktask sctask = new NodeMgmtWrapper.Spotchecktask(p);
                    SpotCheckTask task = sctask.convertTo();
                    tasklist.add(task);
                }
                list.setTaskList(tasklist);
            }
            return list;
        }
    }

    public static class Spotchecktask extends Structure {
        public int id;
        public Pointer nodeid;
        public Pointer addr;
        public Pointer vni;

        public Spotchecktask(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "nodeid", "addr", "vni"});
        }

        public io.yottachain.nodemgmt.core.vo.SpotCheckTask convertTo() {
            io.yottachain.nodemgmt.core.vo.SpotCheckTask task = new io.yottachain.nodemgmt.core.vo.SpotCheckTask();
            task.setId(this.id);
            task.setNodeID(this.nodeid!=null?this.nodeid.getString(0):null);
            task.setAddr(this.addr!=null?this.addr.getString(0):null);
            task.setVni(this.vni!=null?this.vni.getString(0):null);
            return task;
        }
    }

    public static class Stringwitherror extends Structure {
        public Pointer str;
        public Pointer error;

        public Stringwitherror(Pointer ptr) {
            super(ptr);
            read();
        }


        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"str", "error"});
        }
    }

    public static class Intwitherror extends Structure {
        public int id;
        public Pointer error;

        public Intwitherror(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "error"});
        }
    }


    public interface NodeMgmtLib extends Library {
        NodeMgmtLib INSTANCE = (NodeMgmtLib)
                Native.load(Platform.isWindows()?"nodemgmt.dll":"nodemgmt.so",
                        NodeMgmtLib.class);

        Pointer NewInstance(String mongoURL, String eosURL, String bpAccount, String bpPrivkey, String contractOwner, int bpid);
        Pointer RegisterNode(Node node);
        Pointer IncrUsedSpace(int id, long incr);
        Pointer UpdateNodeStatus(Node node);
        Pointer AllocNodes(int shardCount);
        Pointer GetNodes(Pointer nodeIDs, int size);
        Pointer GetSuperNodes();
        Pointer GetSuperNodePrivateKey(int id);
        Pointer GetNodeIDByPubKey(String pubkey);
        Pointer GetSuperNodeIDByPubKey(String pubkey);
        Pointer AddDNI(int id, Pointer shard, long size);
        Pointer ActiveNodesList();
        Pointer Statistics();
        Pointer GetSpotCheckList();
        Pointer GetSTNode();
        Pointer UpdateTaskStatus(String id, int progress, Pointer invalidNodeList, int size);

        void FreeNode(Pointer ptr);
        void FreeSuperNode(Pointer ptr);
        void FreeAllocnoderet(Pointer ptr);
        void FreeAllocsupernoderet(Pointer ptr);
        void FreeNodestatret(Pointer ptr);
        void FreeSpotchecklists(Pointer ptr);
        void FreeStringwitherror(Pointer ptr);
        void FreeIntwitherror(Pointer ptr);
        void FreeString(Pointer ptr);
    }
}
