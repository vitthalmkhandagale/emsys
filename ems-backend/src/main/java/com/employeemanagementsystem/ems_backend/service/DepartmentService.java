package com.employeemanagementsystem.ems_backend.service;

import com.employeemanagementsystem.ems_backend.dto.DepartmentDto;

public interface DepartmentService
{
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long departmentId);
}
