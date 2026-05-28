package com.employeemanagementsystem.ems_backend.repository;

import com.employeemanagementsystem.ems_backend.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
