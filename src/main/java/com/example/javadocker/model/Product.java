package com.example.javadocker.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column
    private Timestamp createdAt;

    public Product() {
    }

    public Product(String name, BigDecimal price, Department department) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.department = department;
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
    }

    public Product(String id, String name, BigDecimal price, Department department, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Department getDepartment() {
        return department;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public static Product of(String name, BigDecimal price, Department department) {
        return new Product(name, price, department);
    }
}
