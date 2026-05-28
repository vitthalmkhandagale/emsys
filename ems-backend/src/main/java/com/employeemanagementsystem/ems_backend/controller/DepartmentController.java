package com.employeemanagementsystem.ems_backend.controller;

import com.employeemanagementsystem.ems_backend.dto.DepartmentDto;
import com.employeemanagementsystem.ems_backend.entity.Department;
import com.employeemanagementsystem.ems_backend.mapper.DepartmentMapper;
import com.employeemanagementsystem.ems_backend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping()
    public ResponseEntity<DepartmentDto> createDepartments(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto department = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById(
            @PathVariable("id") Long departmentId) {

        DepartmentDto departmentDto = departmentService.getDepartmentById(departmentId);

        return ResponseEntity.ok(departmentDto);
    }


}
