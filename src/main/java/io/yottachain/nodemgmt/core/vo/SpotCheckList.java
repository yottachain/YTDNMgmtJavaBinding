package io.yottachain.nodemgmt.core.vo;

import java.util.List;

public class SpotCheckList {

    private String taskID;
    private List<SpotCheckTask> taskList;
    private int progress;
    private long timestamp;
    private long duration;

    public SpotCheckList() {}

    public SpotCheckList(String taskID, List<SpotCheckTask> taskList, int progress, long timestamp, long duration) {
        this.setTaskID(taskID);
        this.setTaskList(taskList);
        this.setProgress(progress);
        this.setTimestamp(timestamp);
        this.setDuration(duration);
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

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
