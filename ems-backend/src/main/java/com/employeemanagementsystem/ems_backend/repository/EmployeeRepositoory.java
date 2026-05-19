package com.employeemanagementsystem.ems_backend.repository;

import com.employeemanagementsystem.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoory extends JpaRepository<Employee,Long> {
}
