package com.stemlink.skillmentor.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class SubjectDTO {

    @NotNull(message = "Cannot be null")
    private String subjectName;

    @Size(max = 100, message = "Description must not exceed 100 characters")
    private String description;

}
