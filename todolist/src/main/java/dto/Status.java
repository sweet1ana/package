package dto;

import java.util.Objects;

/**
 * Created by svetlana on 23.04.2015.
 */
public class Status {

    private long statusID;
    private long taskID;
    private String workStatus;

    public Status() {
    }

    public long getStatusID() {
        return statusID;
    }

    public void setStatusID(long statusID) {
        this.statusID = statusID;
    }

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Status other = (Status) otherObject;
        return statusID == other.statusID && taskID == other.taskID &&
                Objects.equals(workStatus, other.workStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusID, taskID, workStatus);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[statusID=" + statusID + " ,taskID=" + taskID +
                " ,workStatus=" + workStatus + "]";
    }
}
