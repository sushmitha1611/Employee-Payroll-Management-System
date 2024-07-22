package com.adp.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adp.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
