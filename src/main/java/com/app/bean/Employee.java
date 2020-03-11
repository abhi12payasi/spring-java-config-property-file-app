package com.app.bean;

import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private List<String> taskList;
    private Department department;

    public Employee() {
    }

    public Employee(String name, Integer age, Double salary, List<String> taskList, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.taskList = taskList;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", taskList=" + taskList +
                ", department=" + department +
                '}';
    }
}
