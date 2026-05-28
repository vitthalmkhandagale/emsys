package com.employeemanagementsystem.ems_backend.mapper;

import com.employeemanagementsystem.ems_backend.dto.DepartmentDto;
import com.employeemanagementsystem.ems_backend.entity.Department;

public class DepartmentMapper {

    //convert department entity into departmentDto
    public static DepartmentDto maptoDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    //convert departmentDto into department entity
    public static Department maptoDepartment(DepartmentDto departmentDto) {

        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
