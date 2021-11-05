package com.company.mvc;

public class WedView {
    public void showEmployee(Employee employee){
        System.out.println(employee.getFirstName() + " " + employee.getLastName());
    }
}
