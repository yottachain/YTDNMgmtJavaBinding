package io.yottachain.nodemgmt.core.wrapper;

import com.sun.jna.*;

import java.util.Arrays;
import java.util.List;

public class NodeMgmtWrapper {

    public static class Node extends Structure {

        public int id;
        public Pointer nodeid;
        public Pointer pubkey;
        public Pointer addrs;
        public int addrsize;
        public Pointer error;

        public Node(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "nodeid", "pubkey", "addrs", "addrsize", "error"});
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

        public SuperNode(Pointer ptr) {
            super(ptr);
            read();
        }

        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[]{"id", "nodeid", "pubkey", "privkey", "addrs", "addrsize", "error"});
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

        Pointer NewInstance(String urls);
        Pointer AllocNodes(int shardCount);
        Pointer GetNodes(Pointer nodeIDs, int size);
        Pointer GetSuperNodes();
        Pointer GetSuperNodePrivateKey(int id);
        Pointer GetNodeIDByPubKey(String pubkey);
        Pointer GetSuperNodeIDByPubKey(String pubkey);

        void FreeAllocnoderet(Pointer ptr);
        void FreeAllocsupernoderet(Pointer ptr);
        void FreeStringwitherror(Pointer ptr);
        void FreeIntwitherror(Pointer ptr);
        void FreeString(Pointer ptr);
    }
}
