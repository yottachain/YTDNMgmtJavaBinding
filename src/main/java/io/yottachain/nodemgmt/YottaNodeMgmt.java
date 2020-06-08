package io.yottachain.nodemgmt;

import com.ibm.etcd.api.KeyValue;
import com.ibm.etcd.api.RangeResponse;
import com.ibm.etcd.client.EtcdClient;
import com.ibm.etcd.client.KeyUtils;
import com.ibm.etcd.client.KvStoreClient;
import com.ibm.etcd.client.kv.KvClient;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.yottachain.nodemgmt.pb.NodeMsg;
import io.yottachain.nodemgmt.core.*;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.interfaces.NodeMgmtInterface;
import io.yottachain.nodemgmt.core.vo.*;
import io.yottachain.nodemgmt.pb.PbClient;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public class YottaNodeMgmt {

    private static final Logger logger = Logger.getLogger(YottaNodeMgmt.class.getName());

    private static NodeMgmt client;
    private static AtomicBoolean flag = new AtomicBoolean(true);

    private static final String NODEMGMT_ETCD_PREFIX = "/nodemgmt/";
    private static final String NODEMGMT_MONGOURL = NODEMGMT_ETCD_PREFIX + "mongoURL";
    private static final String NODEMGMT_EOSURL = NODEMGMT_ETCD_PREFIX + "eosURL";
    private static final String NODEMGMT_BPACCOUNT = NODEMGMT_ETCD_PREFIX + "bpAccount";
    private static final String NODEMGMT_BPPRIVKEY = NODEMGMT_ETCD_PREFIX + "bpPrivkey";
    private static final String NODEMGMT_CONTRACTOWNERM = NODEMGMT_ETCD_PREFIX + "contractOwnerM";
    private static final String NODEMGMT_CONTRACTOWNERD = NODEMGMT_ETCD_PREFIX + "contractOwnerD";
    private static final String NODEMGMT_SHADOWACCOUNT = NODEMGMT_ETCD_PREFIX + "shadowAccount";
    private static final String NODEMGMT_BPID = NODEMGMT_ETCD_PREFIX + "bpid";
    private static final String NODEMGMT_MASTER = NODEMGMT_ETCD_PREFIX + "master";


    public static void start(final String mongoURL, final String eosURL, final String bpAccount, final String bpPrivkey, final String contractOwnerM, final String contractOwnerD, final String shadowAccount, final int bpid, final boolean isMaster) throws NodeMgmtException {
        int master = isMaster?1:0;
//        String embededStr = System.getenv("NODEMGMT_EMBEDED");
//        if (!StringUtil.isNullOrEmpty(embededStr) && embededStr.equals("false")) {
//            logger.info("NodeMgmt is under standalone mode");
//            String etcdportStr = System.getenv("ETCDPORT");
//            int etcdport = 2379;
//            try {
//                etcdport = Integer.parseInt(etcdportStr);
//            } catch (Exception e) {}
//            logger.info("ETCD port is " + etcdport);
//            String etcdhostname = System.getenv("ETCDHOSTNAME");
//            if (StringUtil.isNullOrEmpty(etcdhostname)) {
//                etcdhostname = "etcd-svc";
//            }
//            logger.info("ETCD hostname is " + etcdhostname);
//            //1. 注册参数
//            KvStoreClient etcdClient = EtcdClient.forEndpoint(etcdhostname, etcdport).withPlainText().build();
//            final KvClient kvclient = etcdClient.getKvClient();
//            logger.info("Create connection to ETCD: " + etcdhostname + ":" + etcdport);
//            new Thread(() -> {
//                while (flag.get()) {
//                    try {
//                        RangeResponse mongoUrlResp = kvclient.get(KeyUtils.bs(NODEMGMT_MONGOURL)).sync();
//                        String mongoUrlNew = null;
//                        if (mongoUrlResp.getKvsCount()>0) {
//                            mongoUrlNew = mongoUrlResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read mongoDB URL from ETCD: " + mongoUrlNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(mongoUrlNew) || !mongoURL.equals(mongoUrlNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_MONGOURL), KeyUtils.bs(mongoURL)).sync();
//                            logger.info("Write new mongoDB URL to ETCD: " + mongoURL);
//                        }
//
//                        RangeResponse eosUrlResp = kvclient.get(KeyUtils.bs(NODEMGMT_EOSURL)).sync();
//                        String eosUrlNew = null;
//                        if (eosUrlResp.getKvsCount()>0) {
//                            eosUrlNew = eosUrlResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read EOS URL from ETCD: " + eosUrlNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(eosUrlNew) || !eosURL.equals(eosUrlNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_EOSURL), KeyUtils.bs(eosURL)).sync();
//                            logger.info("Write new EOS URL to ETCD: " + eosURL);
//                        }
//
//                        RangeResponse bpAccountResp = kvclient.get(KeyUtils.bs(NODEMGMT_BPACCOUNT)).sync();
//                        String bpAccountNew = null;
//                        if (bpAccountResp.getKvsCount()>0) {
//                            bpAccountNew = bpAccountResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read BP account from ETCD: " + bpAccountNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(bpAccountNew) || !bpAccount.equals(bpAccountNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_BPACCOUNT), KeyUtils.bs(bpAccount)).sync();
//                            logger.info("Write new BP account to ETCD: " + bpAccount);
//                        }
//
//                        RangeResponse bpPrivkeyResp = kvclient.get(KeyUtils.bs(NODEMGMT_BPPRIVKEY)).sync();
//                        String bpPrivkeyNew = null;
//                        if (bpPrivkeyResp.getKvsCount()>0) {
//                            bpPrivkeyNew = bpPrivkeyResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read BP private key from ETCD: " + bpPrivkeyNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(bpPrivkeyNew) || !bpPrivkey.equals(bpPrivkeyNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_BPPRIVKEY), KeyUtils.bs(bpPrivkey)).sync();
//                            logger.info("Write new BP private key to ETCD: " + bpPrivkey);
//                        }
//
//                        RangeResponse contractOwnerMResp = kvclient.get(KeyUtils.bs(NODEMGMT_CONTRACTOWNERM)).sync();
//                        String contractOwnerMNew = null;
//                        if (contractOwnerMResp.getKvsCount()>0) {
//                            contractOwnerMNew = contractOwnerMResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read contract owner M from ETCD: " + contractOwnerMNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(contractOwnerMNew) || !contractOwnerM.equals(contractOwnerMNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_CONTRACTOWNERM), KeyUtils.bs(contractOwnerM)).sync();
//                            logger.info("Write contract owner M to ETCD: " + contractOwnerM);
//                        }
//
//                        RangeResponse contractOwnerDResp = kvclient.get(KeyUtils.bs(NODEMGMT_CONTRACTOWNERD)).sync();
//                        String contractOwnerDNew = null;
//                        if (contractOwnerDResp.getKvsCount()>0) {
//                            contractOwnerDNew = contractOwnerDResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read contract owner D from ETCD: " + contractOwnerDNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(contractOwnerDNew) || !contractOwnerD.equals(contractOwnerDNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_CONTRACTOWNERD), KeyUtils.bs(contractOwnerD)).sync();
//                            logger.info("Write contract owner D to ETCD: " + contractOwnerD);
//                        }
//
//                        RangeResponse shadowAccountResp = kvclient.get(KeyUtils.bs(NODEMGMT_SHADOWACCOUNT)).sync();
//                        String shadowAccountNew = null;
//                        if (shadowAccountResp.getKvsCount()>0) {
//                            shadowAccountNew = shadowAccountResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read shadow account from ETCD: " + shadowAccountNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(shadowAccountNew) || !shadowAccount.equals(shadowAccountNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_SHADOWACCOUNT), KeyUtils.bs(shadowAccount)).sync();
//                            logger.info("Write shadow account to ETCD: " + shadowAccount);
//                        }
//
//                        RangeResponse bpidResp = kvclient.get(KeyUtils.bs(NODEMGMT_BPID)).sync();
//                        String bpidNew = null;
//                        if (bpidResp.getKvsCount()>0) {
//                            bpidNew = bpidResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read BP ID from ETCD: " + bpidNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(bpidNew) || !Integer.toString(bpid).equals(bpidNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_BPID), KeyUtils.bs(Integer.toString(bpid))).sync();
//                            logger.info("Write BP ID to ETCD: " + bpid);
//                        }
//
//                        RangeResponse masterResp = kvclient.get(KeyUtils.bs(NODEMGMT_MASTER)).sync();
//                        String masterNew = null;
//                        if (masterResp.getKvsCount()>0) {
//                            masterNew = masterResp.getKvs(0).getValue().toStringUtf8();
//                            logger.info("Read master status from ETCD: " + masterNew);
//                        }
//                        if (StringUtil.isNullOrEmpty(masterNew) || !Integer.toString(master).equals(masterNew)) {
//                            kvclient.put(KeyUtils.bs(NODEMGMT_MASTER), KeyUtils.bs(Integer.toString(master))).sync();
//                            logger.info("Write master status to ETCD: " + master);
//                        }
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        Thread.sleep(60000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                try {
//                    etcdClient.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {}
//            //2. 建立GRPC连接
//            String nodemgmtPortStr = System.getenv("NODEMGMT_GRPCPORT");
//            int nodemgmtPort = 11001;
//            try {
//                nodemgmtPort = Integer.parseInt(nodemgmtPortStr);
//            } catch (Exception e) {}
//            String nodemgmthostname = System.getenv("NODEMGMT_GRPCHOSTNAME");
//            if (StringUtil.isNullOrEmpty(nodemgmthostname)) {
//                nodemgmthostname = "nodemgmt-svc";
//            }
//            client = new PbClient(nodemgmthostname, nodemgmtPort);
//            logger.info("Create NodeMgmt GRPC connection: " + nodemgmthostname + ":" + nodemgmtPort);
//        } else {
            logger.info("NodeMgmt is under embeded mode");
            String nodemgmthostname = System.getenv("NODEMGMT_GRPCHOSTNAME");
            if (StringUtil.isNullOrEmpty(nodemgmthostname)) {
                nodemgmthostname = "127.0.0.1";
            }
            String nodemgmtPortStr = System.getenv("NODEMGMT_GRPCPORT");
            int nodemgmtPort = 11001;
            try {
                nodemgmtPort = Integer.parseInt(nodemgmtPortStr);
            } catch (Exception e) {}
            String analysisHost = System.getenv("NODEMGMT_ANALYSISHOSTNAME");
            if (StringUtil.isNullOrEmpty(analysisHost)) {
                analysisHost = "127.0.0.1";
            }
            String analysisPortStr = System.getenv("NODEMGMT_ANALYSISPORT");
            int analysisPort = 8080;
            try {
                analysisPort = Integer.parseInt(analysisPortStr);
            } catch (Exception e) {}
            String analysisTimeoutStr = System.getenv("NODEMGMT_ANALYSISTIMEOUT");
            int analysisTimeout = 5000;
            try {
                analysisTimeout = Integer.parseInt(analysisTimeoutStr);
            } catch (Exception e) {}
            client = new NodeMgmt(mongoURL, eosURL, bpAccount, bpPrivkey, contractOwnerM, contractOwnerD, shadowAccount, bpid, master, nodemgmthostname, nodemgmtPort, analysisHost, analysisPort, analysisTimeout);
//        }
    }

    public static void setMaster(boolean isMaster) throws NodeMgmtException {
        client.setMaster(isMaster);
    }

    public static void changeEosURL(String eosURL) throws NodeMgmtException {
        client.changeEosURL(eosURL);
    }

    public static int newNodeID() throws NodeMgmtException {
        return client.newNodeID();
    }

//    public static void preRegisterNode(String trx) throws NodeMgmtException {
//        callAPI(trx, ApiName.PreRegisterNode);
//    }
//
//    public static void changeMinerPool(String trx) throws NodeMgmtException {
//        callAPI(trx, ApiName.ChangeMinerPool);
//    }

    public static void callAPI(String trx, ApiName apiName)  throws NodeMgmtException {
        client.callAPI(trx, apiName.toString());
    }

    public static Node updateNodeStatus(int id, int cpu, int memory, int bandwidth, long maxDataSpace, long usedSpace, List<String> addrs, boolean relay, int version, int rebuilding, long realSpace, long tx, long rx, String other) throws NodeMgmtException {
        if (addrs==null || addrs.size()==0) {
            throw new NodeMgmtException("Addresses of data node cannot be null");
        }
        Node node = new Node();
        node.setId(id);
        node.setCpu(cpu);
        node.setMemory(memory);
        node.setBandwidth(bandwidth);
        node.setMaxDataSpace(maxDataSpace);
        node.setUsedSpace(usedSpace);
        node.setAddrs(addrs);
        node.setRelay(relay?1:0);
        node.setVersion(version);
        node.setRebuilding(rebuilding);
        node.setRealSpace(realSpace);
        node.setTx(tx);
        node.setRx(rx);
        node.setOther(other);
        return client.updateNodeStatus(node);
    }

    public static List<Node> allocNodes(int shardCount, int[] errIDs) throws NodeMgmtException {
        return client.allocNodes(shardCount, errIDs);
    }

    public static void syncNode(Node node) throws NodeMgmtException {
         //client.syncNode(node);
    }

    public static List<Node> getNodes(List<Integer> nodes) throws NodeMgmtException {
        return client.getNodes(nodes);
    }

    public static List<SuperNode> getSuperNodes() throws NodeMgmtException {
        return client.getSuperNodes();
    }

    public static String getSuperNodePrivateKey(int id) throws NodeMgmtException {
        return client.getSuperNodePrivateKey(id);
    }

    public static Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        return client.getNodeIDByPubKey(pubkey);
    }

    public static Node getNodeByPubKey(String pubkey) throws NodeMgmtException {
        return client.getNodeByPubKey(pubkey);
    }

    public static Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        return client.getSuperNodeIDByPubKey(pubkey);
    }

    public static void addDNI(int id, byte[] shard) throws NodeMgmtException {
        client.addDNI(id, shard);
    }

    public static List<Map<String, String>> activeNodesList() throws NodeMgmtException {
        List<Node> list = client.activeNodesList();
        List<Map<String, String>> result = new ArrayList<>();
        for (Node n : list) {
            Map<String, String> m = new HashMap<>();
            List<String> addrs = n.getAddrs();
            // String ip = checkPublicIP(addrs);
            String ip = addrs.get(0);
            if (ip != null && !ip.equals("")) {
                m.put("id", Integer.toString(n.getId()));
                m.put("ip", ip);
                m.put("nodeid", n.getNodeid());
                result.add(m);
            }
        }
        return result;
    }

    public static Map<String, Long> statistics() throws NodeMgmtException {
        return client.statistics();
    }

    public static List<SpotCheckList> getSpotCheckList() throws NodeMgmtException {
        return client.getSpotCheckList();
    }

    public static Node getSTNode() throws NodeMgmtException {
        return client.getSTNode();
    }

    public static boolean spotcheckSelected() throws NodeMgmtException {
        Node n = client.getSTNode();
        if (n.getId()==1) {
            return true;
        }
        return false;
    }

    public static List<Node> getSTNodes(long count) throws NodeMgmtException {
        return client.getSTNodes(count);
    }

    public static void updateTaskStatus(String id, int[] nodeIDs) throws NodeMgmtException {
        client.updateTaskStatus(id, nodeIDs);
    }

    public static List<ShardCount> getInvalidNodes() throws NodeMgmtException {
        return client.getInvalidNodes();
    }

    public static RebuildItem getRebuildItem(int minerID, long index, long total) throws NodeMgmtException {
        return client.getRebuildItem(minerID, index, total);
    }

    public static void deleteDNI(int id, byte[] shard) throws NodeMgmtException {
        client.deleteDNI(id, shard);
    }

    public static void finishRebuild(int id) throws NodeMgmtException {
        client.finishRebuild(id);
    }

//    private static String checkPublicIP(List<String> addrs) {
//        for (String addr : addrs) {
//            if (addr.startsWith("/ip4/127.") ||
//                    addr.startsWith("/ip4/192.168.") ||
//                    addr.startsWith("/ip4/169.254.") ||
//                    addr.startsWith("/ip4/10.") ||
//                    addr.startsWith("/ip4/172.16.") ||
//                    addr.startsWith("/ip4/172.17.") ||
//                    addr.startsWith("/ip4/172.18.") ||
//                    addr.startsWith("/ip4/172.19.") ||
//                    addr.startsWith("/ip4/172.20.") ||
//                    addr.startsWith("/ip4/172.21.") ||
//                    addr.startsWith("/ip4/172.22.") ||
//                    addr.startsWith("/ip4/172.23.") ||
//                    addr.startsWith("/ip4/172.24.") ||
//                    addr.startsWith("/ip4/172.25.") ||
//                    addr.startsWith("/ip4/172.26.") ||
//                    addr.startsWith("/ip4/172.27.") ||
//                    addr.startsWith("/ip4/172.28.") ||
//                    addr.startsWith("/ip4/172.29.") ||
//                    addr.startsWith("/ip4/172.30.") ||
//                    addr.startsWith("/ip4/172.31.") ||
//                    addr.startsWith("/p2p-circuit/")
//                    ) {
//                continue;
//            } else {
//                return addr;
//            }
//        }
//        return null;
//    }

    private static List<String> getPublicIP(List<String> addrs) {
        List<String> pubAddrs = new ArrayList<>();
        for (String addr : addrs) {
            if (addr.startsWith("/ip4/127.") ||
                    addr.startsWith("/ip4/192.168.") ||
                    addr.startsWith("/ip4/169.254.") ||
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
                pubAddrs.add(addr);
            }
        }
        return pubAddrs;
    }

    public static void main(String[] args) throws Exception {
        PbClient client = new PbClient("127.0.0.1", 11001);
        try {
            client.callAPI("adhkahjkahda", "PreRegisterNode");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//            logger.info("Create NodeMgmt GRPC connection: " + nodemgmthostname + ":" + nodemgmtPort);
        NodeMsg.Builder builder =  NodeMsg.newBuilder().putAllUspaces(null);
        YottaNodeMgmt.start("mongodb://127.0.0.1:27017", "http://152.136.18.185:8888", "producer1", "5HtM6e3mQNLEu2TkQ1ZrbMNpRQiHGsKxEsLdxd9VsdCmp1um8QH", "hddpool12345", "hdddeposit12", "producer1", 1, true);
        for (int i=0; i<1800; i++) {
            boolean b = YottaNodeMgmt.spotcheckSelected();
            if (b)
                System.out.println(b);
        }
        //        List<ShardCount> sclist = YottaNodeMgmt.getInvalidNodes();
//        for (ShardCount sc : sclist) {
//            System.out.println(sc.getId() + ":" + sc.getCnt());
//        }
//        RebuildItem item = YottaNodeMgmt.getRebuildItem(4, 0, 10);
//        System.out.println(item.getShards().size());
//        //Node dddd = YottaNodeMgmt.updateNodeStatus(872, 42, 65, 0, 2621440, Arrays.asList("/ip4/127.0.0.1/tcp/8888"), true);
//
//        //System.out.println(YottaNodeMgmt.newNodeID());
//        //Node nn = YottaNodeMgmt.getNodeByPubKey("8KPrhwPsqWs23w5KjsAaEgEwLMbvSRPksEFeYhB7jA1EZWX9MT");
//        //Node node = YottaNodeMgmt.registerNode("1234", "abcd", "username1234", 100000, Arrays.asList("/ip4/127.0.0.1/tcp/8888"));
//        List<SpotCheckList> list = YottaNodeMgmt.getSpotCheckList();
//        List<Node> n = YottaNodeMgmt.getSTNodes(3);
//        YottaNodeMgmt.updateTaskStatus(list.get(0).getTaskID(), new int[]{188});

        List<Node> nodes = YottaNodeMgmt.allocNodes(10, new int[]{4, 7});
        List<Map<String, String>> actives = YottaNodeMgmt.activeNodesList();
        Map<String, Long> map = client.statistics();
        System.out.println(map.get("activeMiner"));
//        NodeMgmt.addDNI(2, "abc".getBytes());
//        NodeMgmt.incrUsedSpace(4,5);
//        YottaNodeMgmt.registerNode("16Uiu2HAm5hqd85Hzpvvg4BfVBVfAsXPaRMj9YNhwkkGnD2Qiqxn9", "hahaha","user1234", 1000l, Arrays.asList(new String[]{"/ip4/127.0.0.1/tcp/2222"}));
//        Node node = new Node(716, null, null, null, Arrays.asList("/ip4/192.168.2.159/tcp/9001", "/ip4/192.168.242.1/tcp/9001", "/ip4/192.168.75.1/tcp/9001", "/ip4/127.0.0.1/tcp/9001"),37, 73, 0, 2621440, 0, 0, 0, 1);
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

    public static void main2(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("/ip4/127.0.0.1/tcp/9999");
//        list.add("/ip4/192.168.0.1/tcp/9999");
//        list.add("/ip4/10.244.244.1/tcp/9999");
//        list.add("/ip4/136.123.0.1/tcp/9999");
//        list = getPublicIP(list);
//        for (String s : list) {
//            System.out.println(s);
//        }

        KvStoreClient client = EtcdClient.forEndpoint("192.168.111.128", 2379).withPlainText().build();
        KvClient kvclient = client.getKvClient();
        for ( int n=0; n<100; n++) {
            try {
                Thread.sleep(1000);
                //kvclient.put(KeyUtils.bs("hello"), KeyUtils.bs("test")).sync();

                RangeResponse rr = kvclient.get(KeyUtils.bs("hello1")).sync();
                for (int i = 0; i < rr.getKvsCount(); i++) {
                    KeyValue kv = rr.getKvs(i);
                    System.out.println(i + " : " + kv.getKey().toStringUtf8() + " : " + kv.getValue().toStringUtf8());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
