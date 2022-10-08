package com.example.javadocker.dto;

public class CreateDepartmentDto {
    private String description;

    public CreateDepartmentDto() {
    }

    public CreateDepartmentDto(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
