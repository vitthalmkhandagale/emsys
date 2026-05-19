package com.employeemanagementsystem.ems_backend.service;

import com.employeemanagementsystem.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long EmployeeId);
}
