package com.example.javadocker.model;

import com.example.javadocker.dto.CreateDepartmentDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private String id;

    @Column
    private String description;

    @Column
    private Timestamp createdAt;

    public Department() {
    }

    public Department(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
    }

    public Department(String id, String description, Timestamp createdAt) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public static Department of(CreateDepartmentDto createDepartmentDto) {
        return new Department(createDepartmentDto.getDescription());
    }
}
