package io.yottachain.nodemgmt.rebuilder.pb;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.yottachain.nodemgmt.core.exception.NodeMgmtException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RebuilderCli {
    private final ManagedChannel channel;
    private final RebuilderGrpc.RebuilderBlockingStub blockingStub;
    private int timeout;

    public RebuilderCli(String host, int port, int timeout) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = RebuilderGrpc.newBlockingStub(channel);
        this.timeout = timeout;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public List<byte[]> getRebuildTasks() throws NodeMgmtException {
        try {
            MultiTaskDescription result = blockingStub.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).getRebuildTasks(Empty.newBuilder().build());
            List<ByteString> list = result.getTasklistList();
            List<byte[]> ret = new ArrayList<byte[]>();
            for (ByteString b : list) {
                ret.add(b.toByteArray());
            }
            return ret;
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException(e.getMessage(), e);
        }
    }

    public void updateTaskStatus(List<byte[]> ids, List<Integer> results) throws NodeMgmtException {
        try {
            List<ByteString> idlist = new ArrayList<>();
            for (byte[] id : ids) {
                idlist.add(ByteString.copyFrom(id));
            }
            MultiTaskOpResult request = MultiTaskOpResult.newBuilder().addAllId(idlist).addAllRES(results).build();
            Empty ret = blockingStub.withDeadlineAfter(timeout, TimeUnit.MILLISECONDS).updateTaskStatus(request);
        } catch (StatusRuntimeException e) {
            throw new NodeMgmtException(e.getMessage(), e);
        }
    }
}
