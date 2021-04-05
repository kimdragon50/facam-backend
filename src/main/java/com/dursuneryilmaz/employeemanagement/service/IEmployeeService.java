package com.dursuneryilmaz.employeemanagement.service;

import com.dursuneryilmaz.employeemanagement.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee add(Employee employee);

    List<Employee> getAll();

    Employee update(Employee employee);

    void delete(Employee employee);

    Employee findById(Long id);

    void deleteById(Long id);
}
