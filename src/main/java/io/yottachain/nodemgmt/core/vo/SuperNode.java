package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class SuperNode {
    private int id;
    private String nodeid;
    private String pubkey;
    private String privkey;
    private List<String> addrs;

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

    public String getPrivkey() {
        return privkey;
    }

    public void setPrivkey(String privkey) {
        this.privkey = privkey;
    }

    public List<String> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<String> addrs) {
        this.addrs = addrs;
    }

    public SuperNode() {}

    public SuperNode(int id, String nodeid, String pubkey, String privkey, List<String> addrs) {
        this.id = id;
        this.nodeid = nodeid;
        this.pubkey = pubkey;
        this.privkey = privkey;
        this.addrs = addrs;
    }

}
