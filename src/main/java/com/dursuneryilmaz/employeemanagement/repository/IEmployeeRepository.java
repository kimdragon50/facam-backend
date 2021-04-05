package com.dursuneryilmaz.employeemanagement.repository;

import com.dursuneryilmaz.employeemanagement.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
