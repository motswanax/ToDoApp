package model;

/**
 * @author baike
 */
public class Task {
    private long datecreated;
    private String description;
    private String task;

    public Task() {
    }

    public Task(long datecreated, String description, String task) {
        this.datecreated = datecreated;
        this.description = description;
        this.task = task;
    }

    public void setDatecreated(long datecreated) {
        this.datecreated = datecreated;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
