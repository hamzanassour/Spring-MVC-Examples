package com.example.customvalidator.dto;

import com.example.customvalidator.validator.MultipleOfFive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    private String name ;

    @MultipleOfFive
    private int age ;

}
