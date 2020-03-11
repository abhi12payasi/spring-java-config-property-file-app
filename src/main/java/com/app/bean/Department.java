package com.app.bean;

import java.util.Date;

public class Department {
    private String name;
    private Date createdOn;

    public Department() {
    }

    public Department(String name, Date createdOn) {
        this.name = name;
        this.createdOn = createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
