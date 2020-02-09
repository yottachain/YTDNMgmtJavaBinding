package io.yottachain.nodemgmt.core.vo;

public enum ApiName {
    PreRegisterNode,
    ChangeMinerPool,
    ChangeAdminAcc,
    ChangeProfitAcc,
    ChangePoolID,
    ChangeAssignedSpace;
    public static void main(String[] args) {
        System.out.println(ApiName.PreRegisterNode.toString());
    }
}
