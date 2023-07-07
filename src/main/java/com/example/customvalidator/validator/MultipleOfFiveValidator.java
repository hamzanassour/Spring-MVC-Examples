package com.example.customvalidator.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class MultipleOfFiveValidator implements ConstraintValidator<MultipleOfFive , Integer>{
    @Override
    public void initialize(MultipleOfFive constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer %5 == 0;
    }
}
