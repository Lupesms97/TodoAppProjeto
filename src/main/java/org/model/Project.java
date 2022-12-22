package org.model;

import java.util.Date;

public class Project {
    private int id;
    private String name;
    private String description;
    private Date updateAt;
    private Date createAt;


    public Project(int id, String name, String description, Date updateAt, Date createAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }

    public Project() {
        this.createAt = new Date();
        this.updateAt = new Date();

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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
