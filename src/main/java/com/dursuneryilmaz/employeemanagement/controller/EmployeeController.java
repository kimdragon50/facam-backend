package com.dursuneryilmaz.employeemanagement.controller;

import com.dursuneryilmaz.employeemanagement.domain.Employee;
import com.dursuneryilmaz.employeemanagement.exception.EmployeeNotFoundException;
import com.dursuneryilmaz.employeemanagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin()
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    //add employee
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    //get employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);
    }

    //update employee
    @PutMapping("/employees")
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {
        Employee employeeUpdated = employeeService.update(employee);
        return ResponseEntity.ok(employeeUpdated);
    }

    //delete employee
    @PostMapping("/employees/delete")
    public ResponseEntity<String> delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
        return ResponseEntity.ok("Employee deleted.");
    }
    // deleteById
    @DeleteMapping("employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return  ResponseEntity.ok(response);
    }
}
