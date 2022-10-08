package com.example.javadocker.service.impl;

import com.example.javadocker.dto.CreateDepartmentDto;
import com.example.javadocker.model.Department;
import com.example.javadocker.repository.DepartmentRepository;
import com.example.javadocker.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department create(CreateDepartmentDto createDepartmentDto) {
        Department department =  Department.of(createDepartmentDto);
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> listAll() {
        return departmentRepository.findAll();
    }
}
