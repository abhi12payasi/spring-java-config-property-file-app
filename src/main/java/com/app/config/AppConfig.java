package com.app.config;


import com.app.bean.Department;
import com.app.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Configuration
@PropertySource("app.properties")
public class AppConfig {
    @Autowired
    private Environment environment;

    @Bean
    public Department dept(){
        Department department= new Department();
        department.setName(environment.getProperty("deptName"));
        try {
            department.setCreatedOn(new SimpleDateFormat("dd-mm-yyyy").parse(environment.getProperty("deptCreatedOn")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return department;
    }
    @Bean
    public Employee employee(){
        Employee emp = new Employee();
        emp.setName(environment.getProperty("empName"));
        emp.setAge(environment.getProperty("empAge",Integer.class));
        emp.setSalary(environment.getProperty("empSalary",Double.class));
        emp.setTaskList(environment.getProperty("empTasks", ArrayList.class));
        emp.setDepartment(dept());
        return emp;
    }
}
