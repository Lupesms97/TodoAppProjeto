package org.model;

import java.util.Date;

public class Task {
    private int id;
    private int idDescription;
    private String notes;
    private String name;
    private String description;
    private boolean statusTask;
    private Date deadLine;
    private Date uptadeAt;
    private Date createAt;

    public Task(int id, int idDescription, String notes, String name, String description, boolean statusTask, Date deadLine, Date uptadeAt, Date createAt) {
        this.id = id;
        this.idDescription = idDescription;
        this.notes = notes;
        this.name = name;
        this.description = description;
        this.statusTask = statusTask;
        this.deadLine = deadLine;
        this.uptadeAt = uptadeAt;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDescription() {
        return idDescription;
    }

    public void setIdDescription(int idDescription) {
        this.idDescription = idDescription;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatusTask() {
        return statusTask;
    }

    public void setStatusTask(boolean statusTask) {
        this.statusTask = statusTask;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getUptadeAt() {
        return uptadeAt;
    }

    public void setUptadeAt(Date uptadeAt) {
        this.uptadeAt = uptadeAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", idDescription=" + idDescription +
                ", notes='" + notes + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", statusTask=" + statusTask +
                ", deadLine=" + deadLine +
                ", uptadeAt=" + uptadeAt +
                ", createAt=" + createAt +
                '}';
    }
}
