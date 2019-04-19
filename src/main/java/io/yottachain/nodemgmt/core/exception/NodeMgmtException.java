package io.yottachain.nodemgmt.core.exception;

public class NodeMgmtException extends Exception {
    public NodeMgmtException(String msg) {
        super(msg);
    }

    public NodeMgmtException(String errmsg, Throwable t) {
        super(errmsg, t);
    }
}
