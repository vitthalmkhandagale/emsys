package com.employeemanagementsystem.ems_backend.service.impl;

import com.employeemanagementsystem.ems_backend.dto.DepartmentDto;
import com.employeemanagementsystem.ems_backend.entity.Department;
import com.employeemanagementsystem.ems_backend.mapper.DepartmentMapper;
import com.employeemanagementsystem.ems_backend.repository.DepartmentRepository;
import com.employeemanagementsystem.ems_backend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.maptoDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.maptoDepartmentDto(savedDepartment);
    }
}
