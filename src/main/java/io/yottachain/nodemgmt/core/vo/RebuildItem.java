package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class RebuildItem {
    private Node node;

    private List<byte[]> shards;

    public RebuildItem(){}

    public RebuildItem(Node node, List<byte[]> shards) {
        this.node = node;
        this.shards = shards;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<byte[]> getShards() {
        return shards;
    }

    public void setShards(List<byte[]> shards) {
        this.shards = shards;
    }
}
