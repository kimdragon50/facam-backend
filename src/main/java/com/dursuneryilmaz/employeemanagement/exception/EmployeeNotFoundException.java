package com.dursuneryilmaz.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmployeeNotFoundException(String mesaage) {
        super(mesaage);
    }
}
