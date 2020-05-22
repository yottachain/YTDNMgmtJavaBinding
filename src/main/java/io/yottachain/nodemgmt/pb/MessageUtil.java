package io.yottachain.nodemgmt.pb;

import com.google.protobuf.ByteString;
import io.yottachain.nodemgmt.core.vo.*;

import java.util.ArrayList;
import java.util.List;

public class MessageUtil {
    public static io.yottachain.nodemgmt.pb.NodeMsg convertNodeToMsg(Node node) {
        NodeMsg.Builder builder =  NodeMsg.newBuilder()
                .setID(node.getId());
        if (node.getNodeid() != null)
            builder.setNodeID(node.getNodeid());
        if (node.getPubkey() != null)
            builder.setPubKey(node.getPubkey());
        if (node.getOwner() != null)
            builder.setOwner(node.getOwner());
        if (node.getProfitAcc() != null)
            builder.setProfitAcc(node.getProfitAcc());
        if (node.getPoolID() != null)
            builder.setPoolID(node.getPoolID());
        if (node.getPoolOwner() != null)
            builder.setPoolOwner(node.getPoolOwner());
        builder.setQuota(node.getQuota());
        if (node.getAddrs() != null)
            builder.addAllAddrs(node.getAddrs());
        builder.setCPU(node.getCpu())
                .setMemory(node.getMemory())
                .setBandwidth(node.getBandwidth())
                .setMaxDataSpace(node.getMaxDataSpace())
                .setAssignedSpace(node.getAssignedSpace())
                .setProductiveSpace(node.getProductiveSpace())
                .setUsedSpace(node.getUsedSpace())
                .putAllUspaces(node.getUspaces())
                .setWeight(node.getWeight())
                .setValid(node.getValid())
                .setRelay(node.getRelay())
                .setStatus(node.getStatus())
                .setTimestamp(node.getTimestamp())
                .setVersion(node.getVersion())
                .setRebuilding(node.getRebuilding())
                .setRealSpace(node.getRealSpace())
                .setTx(node.getTx())
                .setRx(node.getRx());
        if (node.getOther() != null)
            builder.setExt(node.getOther());
        return builder.build();

    }

    public static Node convertMsgToNode(NodeMsg msg) {
        Node node = new Node();
        node.setId(msg.getID());
        node.setNodeid(msg.getNodeID());
        node.setPubkey(msg.getPubKey());
        node.setOwner(msg.getOwner());
        node.setProfitAcc(msg.getProfitAcc());
        node.setPoolID(msg.getPoolID());
        node.setPoolOwner(msg.getPoolOwner());
        node.setQuota(msg.getQuota());
        node.setAddrs(msg.getAddrsList());
        node.setCpu(msg.getCPU());
        node.setMemory(msg.getMemory());
        node.setBandwidth(msg.getBandwidth());
        node.setMaxDataSpace(msg.getMaxDataSpace());
        node.setAssignedSpace(msg.getAssignedSpace());
        node.setProductiveSpace(msg.getProductiveSpace());
        node.setUsedSpace(msg.getUsedSpace());
        node.setUspaces(msg.getUspacesMap());
        node.setWeight(msg.getWeight());
        node.setValid(msg.getValid());
        node.setRelay(msg.getRelay());
        node.setStatus(msg.getStatus());
        node.setTimestamp(msg.getTimestamp());
        node.setVersion(msg.getVersion());
        node.setRebuilding(msg.getRebuilding());
        node.setRealSpace(msg.getRealSpace());
        node.setTx(msg.getTx());
        node.setRx(msg.getRx());
        node.setOther(msg.getExt());
        return node;
    }

    public static SuperNodeMsg convertSuperNodeToMsg(SuperNode superNode) {
        SuperNodeMsg.Builder builder = SuperNodeMsg.newBuilder();
        builder.setID(superNode.getId());
        if (superNode.getNodeid() != null)
            builder.setNodeID(superNode.getNodeid());
        if (superNode.getPubkey() != null)
            builder.setPubKey(superNode.getPubkey());
        if (superNode.getPrivkey() != null)
            builder.setPrivKey(superNode.getPrivkey());
        if (superNode.getAddrs() != null)
            builder.addAllAddrs(superNode.getAddrs());
        return builder.build();
    }

    public static SuperNode convertMsgToSuperNode(SuperNodeMsg msg) {
        SuperNode superNode = new SuperNode();
        superNode.setId(msg.getID());
        superNode.setNodeid(msg.getNodeID());
        superNode.setPubkey(msg.getPubKey());
        superNode.setPrivkey(msg.getPrivKey());
        superNode.setAddrs(msg.getAddrsList());
        return superNode;
    }

    public static ShardCountMsg convertShardCountToMsg(ShardCount shardCount) {
        return ShardCountMsg.newBuilder()
                .setID(shardCount.getId())
                .setCnt(shardCount.getCnt())
                .build();
    }

    public static ShardCount convertMsgToShardCount(ShardCountMsg msg) {
        ShardCount shardCount = new ShardCount();
        shardCount.setId(msg.getID());
        shardCount.setCnt(msg.getCnt());
        return shardCount;
    }

    public static GetRebuildItemResp convertRebuildItemToMsg(RebuildItem rebuildItem) {
        GetRebuildItemResp.Builder builder = GetRebuildItemResp.newBuilder()
                .setNode(convertNodeToMsg(rebuildItem.getNode()));
        List<byte[]> shards = rebuildItem.getShards();
        for (byte[] b : shards) {
            builder.addShards(ByteString.copyFrom(b));
        }
        return builder.build();
    }

    public static RebuildItem convertMsgToRebuildItem(GetRebuildItemResp msg) {
        RebuildItem result = new RebuildItem();
        result.setNode(convertMsgToNode(msg.getNode()));
        List<byte[]> shards = new ArrayList<>();
        List<ByteString> lists = msg.getShardsList();
        for (ByteString b : lists) {
            shards.add(b.toByteArray());
        }
        result.setShards(shards);
        return result;
    }

    public static List<SpotCheckList> convertMsgToSpotCheckList(GetSpotCheckListResp msg) {
        List<SpotCheckListMsg> list = msg.getSpotCheckListsList();
        List<SpotCheckList> spotCheckLists = new ArrayList<>();
        for (SpotCheckListMsg m : list) {
            String taskID = m.getTaskID();
            List<SpotCheckTaskMsg> tasks = m.getTaskListList();
            long timestamp = m.getTimestamp();
            SpotCheckList spotCheckList = new SpotCheckList();
            spotCheckList.setTaskID(taskID);
            spotCheckList.setTaskList(new ArrayList<>());
            for (SpotCheckTaskMsg tm : tasks) {
                SpotCheckTask t = new SpotCheckTask();
                t.setId(tm.getID());
                t.setNodeID(tm.getNodeID());
                t.setVni(tm.getVNI());
                t.setAddr(tm.getAddr());
                spotCheckList.getTaskList().add(t);
            }
            spotCheckList.setTimestamp(timestamp);
            spotCheckLists.add(spotCheckList);
        }
        return spotCheckLists;
    }
}
