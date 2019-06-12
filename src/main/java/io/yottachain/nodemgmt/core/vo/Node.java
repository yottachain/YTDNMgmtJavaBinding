package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class Node {
    private int id;
    private String nodeid;
    private String pubkey;
    private String owner;
    private List<String> addrs;

    private int cpu;
    private int memory;
    private int bandwidth;
    private long maxDataSpace;
    private long assignedSpace;
    private long productiveSpace;
    private long usedSpace;
    private int relay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<String> addrs) {
        this.addrs = addrs;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public long getMaxDataSpace() {
        return maxDataSpace;
    }

    public void setMaxDataSpace(long maxDataSpace) {
        this.maxDataSpace = maxDataSpace;
    }

    public long getAssignedSpace() {
        return assignedSpace;
    }

    public void setAssignedSpace(long assignedSpace) {
        this.assignedSpace = assignedSpace;
    }

    public long getProductiveSpace() {
        return productiveSpace;
    }

    public void setProductiveSpace(long productiveSpace) {
        this.productiveSpace = productiveSpace;
    }

    public long getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(long usedSpace) {
        this.usedSpace = usedSpace;
    }

    public int getRelay() {
        return relay;
    }

    public void setRelay(int relay) {
        this.relay = relay;
    }

    public Node() {}

    public Node(int id, String nodeid, String pubkey, List<String> addrs) {
        this.id = id;
        this.nodeid = nodeid;
        this.pubkey = pubkey;
        this.addrs = addrs;
    }

    public Node(int id, String nodeid, String pubkey, String owner, List<String> addrs, int cpu, int memory, int bandwidth, long maxDataSpace, long assignedSpace, long productiveSpace, long usedSpace, int relay) {
        this(id, nodeid, pubkey, addrs);
        this.owner = owner;
        this.cpu = cpu;
        this.memory = memory;
        this.bandwidth = bandwidth;
        this.maxDataSpace = maxDataSpace;
        this.assignedSpace = assignedSpace;
        this.productiveSpace = productiveSpace;
        this.usedSpace = usedSpace;
        this.relay = relay;
    }

}
