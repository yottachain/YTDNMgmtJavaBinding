package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class Node {
    private int id;
    private String nodeid;
    private String pubkey;
    private String owner;
    private String profitAcc;
    private String poolID;
    private long quota;
    private List<String> addrs;

    private int cpu;
    private int memory;
    private int bandwidth;
    private long maxDataSpace;
    private long assignedSpace;
    private long productiveSpace;
    private long usedSpace;
    private double weight;
    private int valid;
    private int relay;
    private int status;
    private long timestamp;
    private int version;

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

    public String getProfitAcc() {
        return profitAcc;
    }

    public void setProfitAcc(String profitAcc) {
        this.profitAcc = profitAcc;
    }

    public String getPoolID() {
        return poolID;
    }

    public void setPoolID(String poolID) {
        this.poolID = poolID;
    }

    public long getQuota() {
        return quota;
    }

    public void setQuota(long quota) {
        this.quota = quota;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public int getRelay() {
        return relay;
    }

    public void setRelay(int relay) {
        this.relay = relay;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Node() {}

    public Node(int id, String nodeid, String pubkey, List<String> addrs) {
        this.setId(id);
        this.setNodeid(nodeid);
        this.setPubkey(pubkey);
        this.setAddrs(addrs);
    }

    public Node(int id, String nodeid, String pubkey, String owner, String profitAcc, String poolID, long quota, List<String> addrs, int cpu, int memory, int bandwidth, long maxDataSpace, long assignedSpace, long productiveSpace, long usedSpace, double weight, int valid, int relay, int status, long timestamp, int version) {
        this(id, nodeid, pubkey, addrs);
        this.setOwner(owner);
        this.setProfitAcc(profitAcc);
        this.setPoolID(poolID);
        this.setQuota(quota);
        this.setCpu(cpu);
        this.setMemory(memory);
        this.setBandwidth(bandwidth);
        this.setMaxDataSpace(maxDataSpace);
        this.setAssignedSpace(assignedSpace);
        this.setProductiveSpace(productiveSpace);
        this.setUsedSpace(usedSpace);
        this.setWeight(weight);
        this.setValid(valid);
        this.setRelay(relay);
        this.setStatus(status);
        this.setTimestamp(timestamp);
        this.setVersion(version);
    }

}
