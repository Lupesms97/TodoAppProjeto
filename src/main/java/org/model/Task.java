package org.model;

import java.util.Date;

public class Task {
    private int id;
    private int idProject;
    private String notes;
    private String name;
    private String description;
    private boolean statusTask;
    private Date deadLine;
    private Date updateAt;
    private Date createAt;

    public Task(int id, int idDescription, String notes, String name, String description, boolean statusTask, Date deadLine, Date updateAt, Date createAt) {
        this.id = id;
        this.idProject = idDescription;
        this.notes = notes;
        this.name = name;
        this.description = description;
        this.statusTask = statusTask;
        this.deadLine = deadLine;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }

    public Task(){
        this.createAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date uptadeAt) {
        this.updateAt = uptadeAt;
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
                ", idDescription=" + idProject +
                ", notes='" + notes + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", statusTask=" + statusTask +
                ", deadLine=" + deadLine +
                ", uptadeAt=" + updateAt +
                ", createAt=" + createAt +
                '}';
    }
}
