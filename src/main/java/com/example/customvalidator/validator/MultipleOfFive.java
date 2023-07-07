package com.example.customvalidator.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MultipleOfFiveValidator.class )
public @interface MultipleOfFive {
    String message() default "The number provided is not a multiple of 5. Please try again.";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
