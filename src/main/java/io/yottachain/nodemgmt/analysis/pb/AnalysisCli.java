package io.yottachain.nodemgmt.analysis.pb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;
import io.yottachain.nodemgmt.core.vo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnalysisCli {

    private final ManagedChannel channel;
    private final AnalysisGrpc.AnalysisBlockingStub blockingStub;
    private int timeout;

    public AnalysisCli(String host, int port, int timeout) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = AnalysisGrpc.newBlockingStub(channel);
        this.timeout = timeout;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public SpotCheckList getSpotCheckList() throws NodeMgmtException {
        try {
            SpotCheckListMsg resp = blockingStub.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).getSpotCheckList(Empty.newBuilder().build());
            String taskID = resp.getTaskID();
            List<SpotCheckTaskMsg> tasks = resp.getTaskListList();
            long timestamp = resp.getTimestamp();
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
            return spotCheckList;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    public boolean isNodeSelected() throws NodeMgmtException {
        try {
            BoolMessage resp = blockingStub.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).isNodeSelected(Empty.newBuilder().build());
            return resp.getValue();
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }

    public void updateTaskStatus(String id, int nodeID) throws NodeMgmtException {
        try {
            UpdateTaskStatusReq req = UpdateTaskStatusReq.newBuilder()
                    .setId(id)
                    .setInvalidNode(nodeID)
                    .build();
            blockingStub.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).updateTaskStatus(req);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException("", e);
        }
    }
}
