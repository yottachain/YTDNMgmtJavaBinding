package io.yottachain.nodemgmt.core.vo;

public class SpotCheckTask {
    private int id;
    private String nodeID;
    private String addr;
    private String vni;

    public SpotCheckTask(){}

    public SpotCheckTask(int id, String nodeID, String addr, String vni) {
        this.setId(id);
        this.setNodeID(nodeID);
        this.setAddr(addr);
        this.setVni(vni);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getVni() {
        return vni;
    }

    public void setVni(String vni) {
        this.vni = vni;
    }
}
