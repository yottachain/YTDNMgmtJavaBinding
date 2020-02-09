package io.yottachain.nodemgmt.pb;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.interfaces.NodeMgmtInterface;
import io.yottachain.nodemgmt.core.vo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PbClient implements NodeMgmtInterface {

    private final ManagedChannel channel;
    private final YTDNMgmtGrpc.YTDNMgmtBlockingStub blockingStub;

    public PbClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = YTDNMgmtGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    @Override
    public void setMaster(boolean b) throws NodeMgmtException {
        int v = b?1:0;
        try {
            blockingStub.setMaster(Int32Msg.newBuilder().setValue(v).build());
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void changeEosURL(String eosURL) throws NodeMgmtException {
        if (eosURL == null) {
            throw new NodeMgmtException("EOS URL must not be null");
        }
        try {
            blockingStub.changeEosURL(StringMsg.newBuilder().setValue(eosURL).build());
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public int newNodeID() throws NodeMgmtException {
        try {
            Int32Msg resp = blockingStub.newNodeID(Empty.newBuilder().build());
            return resp.getValue();
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void callAPI(String trx, String apiName) throws NodeMgmtException {
        if (StringUtil.isNullOrEmpty(trx) || StringUtil.isNullOrEmpty(apiName)) {
            throw new NodeMgmtException("transaction or API name cannot be empty");
        }
        String2Msg req = String2Msg.newBuilder().setParam1(trx).setParam2(apiName).build();
        try {
            blockingStub.callAPI(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public Node updateNodeStatus(Node node) throws NodeMgmtException {
        try {
            NodeMsg req = MessageUtil.convertNodeToMsg(node);
            NodeMsg resp = blockingStub.updateNodeStatus(req);
            return MessageUtil.convertMsgToNode(resp);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<Node> allocNodes(int shardCount, int[] errIDs) throws NodeMgmtException {
        List<Integer> errList = new ArrayList<>();
        for (Integer s : errIDs) {
            errList.add(s);
        }
        AllocNodesReq req = AllocNodesReq.newBuilder()
                .setShardCount(shardCount)
                .addAllErrIDs(errList)
                .build();
        try {
            NodesResp resp = blockingStub.allocNodes(req);
            List<NodeMsg> nodeMsgs = resp.getNodesList();
            List<Node> nodes = new ArrayList<>();
            for (NodeMsg msg : nodeMsgs) {
                nodes.add(MessageUtil.convertMsgToNode(msg));
            }
            return nodes;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void syncNode(Node node) throws NodeMgmtException {
        try {
            NodeMsg req = MessageUtil.convertNodeToMsg(node);
            blockingStub.syncNode(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<Node> getNodes(List<Integer> nodeIDs) throws NodeMgmtException {
        GetNodesReq req = GetNodesReq.newBuilder()
                .addAllNodeIDs(nodeIDs)
                .build();
        try {
            NodesResp resp = blockingStub.getNodes(req);
            List<NodeMsg> nodeMsgs = resp.getNodesList();
            List<Node> nodes = new ArrayList<>();
            for (NodeMsg msg : nodeMsgs) {
                nodes.add(MessageUtil.convertMsgToNode(msg));
            }
            return nodes;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<SuperNode> getSuperNodes() throws NodeMgmtException {
        try {
            SuperNodesResp resp = blockingStub.getSuperNodes(Empty.newBuilder().build());
            List<SuperNodeMsg> superNodeMsgs = resp.getSuperNodesList();
            List<SuperNode> superNodes = new ArrayList<>();
            for (SuperNodeMsg msg : superNodeMsgs) {
                superNodes.add(MessageUtil.convertMsgToSuperNode(msg));
            }
            return superNodes;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public String getSuperNodePrivateKey(int id) throws NodeMgmtException {
        try {
            StringMsg resp = blockingStub.getSuperNodePrivateKey(Int32Msg.newBuilder().setValue(id).build());
            return resp.getValue();
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    public Integer getNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        try {
            Int32Msg resp = blockingStub.getNodeIDByPubKey(StringMsg.newBuilder().setValue(pubkey).build());
            return resp.getValue();
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public Node getNodeByPubKey(String pubkey) throws NodeMgmtException {
        try {
            NodeMsg resp = blockingStub.getNodeByPubKey(StringMsg.newBuilder().setValue(pubkey).build());
            return MessageUtil.convertMsgToNode(resp);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public Integer getSuperNodeIDByPubKey(String pubkey) throws NodeMgmtException {
        try {
            Int32Msg resp = blockingStub.getSuperNodeIDByPubKey(StringMsg.newBuilder().setValue(pubkey).build());
            return resp.getValue();
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void addDNI(int id, byte[] shard) throws NodeMgmtException {
        try {
            DNIReq req = DNIReq.newBuilder()
                    .setId(id)
                    .setShard(ByteString.copyFrom(shard))
                    .build();
            blockingStub.addDNI(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<Node> activeNodesList() throws NodeMgmtException {
        try {
            NodesResp resp = blockingStub.activeNodesList(Empty.newBuilder().build());
            List<NodeMsg> nodeMsgs = resp.getNodesList();
            List<Node> nodes = new ArrayList<>();
            for (NodeMsg msg : nodeMsgs) {
                nodes.add(MessageUtil.convertMsgToNode(msg));
            }
            return nodes;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public Map<String, Long> statistics() throws NodeMgmtException {
        try {
            NodeStatMsg resp = blockingStub.statistics(Empty.newBuilder().build());
            Map<String, Long> result = new HashMap<>();
            result.put("activeMiner", resp.getActiveMiners());
            result.put("totalMiner", resp.getTotalMiners());
            result.put("maxDataSpace", resp.getMaxTotal());
            result.put("assignedSpace", resp.getAssignedTotal());
            result.put("productiveSpace", resp.getProductiveTotal());
            result.put("usedSpace", resp.getUsedTotal());
            return result;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<SpotCheckList> getSpotCheckList() throws NodeMgmtException {
        try {
            GetSpotCheckListResp resp = blockingStub.getSpotCheckList(Empty.newBuilder().build());
            return MessageUtil.convertMsgToSpotCheckList(resp);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public Node getSTNode() throws NodeMgmtException {
        try {
            NodeMsg resp = blockingStub.getSTNode(Empty.newBuilder().build());
            return MessageUtil.convertMsgToNode(resp);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<Node> getSTNodes(long count) throws NodeMgmtException {
        try {
            NodesResp resp = blockingStub.getSTNodes(Int64Msg.newBuilder().setValue(count).build());
            List<NodeMsg> nodeMsgs = resp.getNodesList();
            List<Node> nodes = new ArrayList<>();
            for (NodeMsg msg : nodeMsgs) {
                nodes.add(MessageUtil.convertMsgToNode(msg));
            }
            return nodes;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void updateTaskStatus(String id, int[] nodeIDs) throws NodeMgmtException {
        try {
            List<Integer> invalidNodeList = new ArrayList<>();
            for (Integer s : nodeIDs) {
                invalidNodeList.add(s);
            }
            UpdateTaskStatusReq req = UpdateTaskStatusReq.newBuilder()
                    .setId(id)
                    .addAllInvalidNodeList(invalidNodeList)
                    .build();
            blockingStub.updateTaskStatus(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public List<ShardCount> getInvalidNodes() throws NodeMgmtException {
        try {
            GetInvalidNodesResp resp = blockingStub.getInvalidNodes(Empty.newBuilder().build());
            List<ShardCountMsg> shardCounts = resp.getShardCountsList();
            List<ShardCount> result = new ArrayList<>();
            for (ShardCountMsg msg : shardCounts) {
                result.add(MessageUtil.convertMsgToShardCount(msg));
            }
            return result;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public RebuildItem getRebuildItem(int minerID, long index, long total) throws NodeMgmtException {
        try {
            GetRebuildItemReq req = GetRebuildItemReq.newBuilder()
                    .setMinerID(minerID)
                    .setIndex(index)
                    .setTotal(total)
                    .build();
            GetRebuildItemResp resp = blockingStub.getRebuildItem(req);
            return MessageUtil.convertMsgToRebuildItem(resp);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void deleteDNI(int id, byte[] shard) throws NodeMgmtException {
        try {
            DNIReq req = DNIReq.newBuilder()
                    .setId(id)
                    .setShard(ByteString.copyFrom(shard))
                    .build();
            blockingStub.deleteDNI(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    @Override
    public void finishRebuild(int id) throws NodeMgmtException {
        try {
            blockingStub.finishRebuild(Int32Msg.newBuilder().setValue(id).build());
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    public static void main(String[] args) throws Exception {
        PbClient client = new PbClient("127.0.0.1", 1234);
        for (int i=0; i<1000; i++) {
            try {
                System.out.println(client.newNodeID());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(1000);
        }
        client.shutdown();
    }
}
