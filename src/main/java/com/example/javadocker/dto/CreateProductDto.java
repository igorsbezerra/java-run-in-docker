package com.example.javadocker.dto;

import java.math.BigDecimal;

public class CreateProductDto {
    private String name;
    private BigDecimal price;
    private String departmentId;

    public CreateProductDto() {
    }

    public CreateProductDto(String name, BigDecimal price, String departmentId) {
        this.name = name;
        this.price = price;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "CreateProductDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
