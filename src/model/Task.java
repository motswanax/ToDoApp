package model;

import java.sql.Timestamp;

/**
 * @author baike
 */
public class Task {
    private int userId;
    private Timestamp datecreated;
    private String description;
    private String task;

    public Timestamp getDatecreated() {
        return datecreated;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTask() {
        return task;
    }

    public Task() {
    }

    public Task(Timestamp datecreated, String description, String task) {
        this.datecreated = datecreated;
        this.description = description;
        this.task = task;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
