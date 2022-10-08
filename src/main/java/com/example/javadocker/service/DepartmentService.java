package com.example.javadocker.service;

import com.example.javadocker.dto.CreateDepartmentDto;
import com.example.javadocker.model.Department;

import java.util.List;

public interface DepartmentService {
    Department create(CreateDepartmentDto createDepartmentDto);
    List<Department> listAll();
}
