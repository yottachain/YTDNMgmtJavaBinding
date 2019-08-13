package io.yottachain.nodemgmt.core.vo;

public class ShardCount {
    private int id;
    private long cnt;

    public ShardCount(){}

    public ShardCount(int id, long cnt) {
        this.setId(id);
        this.setCnt(cnt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCnt() {
        return cnt;
    }

    public void setCnt(long cnt) {
        this.cnt = cnt;
    }
}
