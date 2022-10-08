package com.example.javadocker.service.impl;

import com.example.javadocker.dto.CreateProductDto;
import com.example.javadocker.model.Product;
import com.example.javadocker.repository.DepartmentRepository;
import com.example.javadocker.repository.ProductRepository;
import com.example.javadocker.service.ProductService;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final DepartmentRepository departmentRepository;

    public ProductServiceImpl(ProductRepository productRepository, DepartmentRepository departmentRepository) {
        this.productRepository = productRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Product create(CreateProductDto createProductDto) {
        var department = departmentRepository.findById(createProductDto.getDepartmentId())
                .orElseThrow(() -> new NoResultException("Department not found!"));
        var product = Product.of(createProductDto.getName(), createProductDto.getPrice(), department);
        return productRepository.save(product);
    }

    @Override
    public List<Product> listAll() {
        return productRepository.findAll();
    }
}
