package com.example.javadocker.service;

import com.example.javadocker.dto.CreateProductDto;
import com.example.javadocker.model.Product;

import java.util.List;

public interface ProductService {
    Product create(CreateProductDto createProductDto);
    List<Product> listAll();
}
