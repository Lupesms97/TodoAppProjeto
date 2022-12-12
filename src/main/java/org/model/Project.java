package org.model;

import java.util.Date;

public class Project {
    private int id;
    private String name;
    private String description;
    private Date uptadeAt;
    private Date createAt;


    public Project(int id, String name, String description, Date uptadeAt, Date createAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.uptadeAt = uptadeAt;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", uptadeAt=" + uptadeAt +
                ", createAt=" + createAt +
                '}';
    }
}
