package com.company.mvc;

public class Controller {
    private final EmployeeService employeeService;
    private final WedView wedView;

    public Controller(EmployeeService employeeService, WedView wedView) {
        this.employeeService = employeeService;
        this.wedView = wedView;
    }

    public void execute(long id){
        Employee employee = employeeService.getEmployeeRepository().findById(id);
        wedView.showEmployee(employee);
    }
}
