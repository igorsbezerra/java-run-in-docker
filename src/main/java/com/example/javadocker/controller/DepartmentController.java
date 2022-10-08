package com.example.javadocker.controller;

import com.example.javadocker.dto.CreateDepartmentDto;
import com.example.javadocker.model.Department;
import com.example.javadocker.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> create(@RequestBody CreateDepartmentDto createDepartmentDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.create(createDepartmentDto));
    }

    @GetMapping
    public ResponseEntity<List<Department>> listAll() {
        return ResponseEntity.ok(departmentService.listAll());
    }
}
