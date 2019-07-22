package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class SpotCheckList {

    private String taskID;
    private List<SpotCheckTask> taskList;
    private long timestamp;

    public SpotCheckList() {}

    public SpotCheckList(String taskID, List<SpotCheckTask> taskList, long timestamp) {
        this.setTaskID(taskID);
        this.setTaskList(taskList);
        this.setTimestamp(timestamp);
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public List<SpotCheckTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<SpotCheckTask> taskList) {
        this.taskList = taskList;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
