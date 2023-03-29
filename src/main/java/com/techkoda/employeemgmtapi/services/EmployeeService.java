package com.techkoda.employeemgmtapi.services;

import com.techkoda.employeemgmtapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
