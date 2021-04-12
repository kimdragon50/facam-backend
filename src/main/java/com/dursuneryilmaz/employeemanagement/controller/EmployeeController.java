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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin()
public class EmployeeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IEmployeeService employeeService;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAll() {

        logger.debug("employ_list");

        return employeeService.getAll();


    }

    //add employee
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {

        logger.trace("employ_add");
        logger.debug("employ_add");
        logger.info("employ_add");
        logger.warn("employ_add");
        logger.error("employ_add");

        return employeeService.add(employee);
    }

    //get employee by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {

        logger.debug("employ_getid");

        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);
    }

    //update employee
    @PutMapping("/employees")
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {

        logger.debug("employ_update");

        Employee employeeUpdated = employeeService.update(employee);
        return ResponseEntity.ok(employeeUpdated);
    }

    //delete employee
    @PostMapping("/employees/delete")
    public ResponseEntity<String> delete(@RequestBody Employee employee) {

        logger.debug("employ_delet ");

        employeeService.delete(employee);
        return ResponseEntity.ok("Employee deleted.");
    }
    // deleteById
    @DeleteMapping("employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteById(@PathVariable Long id){

        logger.debug("employ_delet_byid");

        employeeService.deleteById(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return  ResponseEntity.ok(response);
    }
}
