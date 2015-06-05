package dto;

import java.util.Objects;

/**
 * Created by svetlana on 23.04.2015.
 */
public class Task {

    private long taskID;
    private long userID;
    private String nameTask;
    private String description;

    public Task() {
    }

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Task other = (Task) otherObject;
        return taskID == other.taskID && userID == other.userID &&
                Objects.equals(nameTask, other.nameTask) &&
                Objects.equals(description, other.description);
    }

    @Override
    public int hashCode() {
        return 7 * new Long(userID).hashCode()
                + new Long(taskID).hashCode()
                + 11 * nameTask.hashCode()
                + 13 * description.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[taskID=" + taskID + " ,userID=" + userID +
                " ,nameTask=" + nameTask + " ,description=" + description + "]";
    }
}
