package com.employeemanagementsystem.ems_backend.service;

import com.employeemanagementsystem.ems_backend.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService
{
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long departmentId);

    List<DepartmentDto> getAllDepartments();

    DepartmentDto updateDepartment(Long departmentId, DepartmentDto departmentDto);

    void deleteDepartmentById(Long departmentId);
}
