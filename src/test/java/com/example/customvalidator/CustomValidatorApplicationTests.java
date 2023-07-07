package com.example.customvalidator;

import com.example.customvalidator.validator.MultipleOfFiveValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CustomValidatorApplicationTests {


        @Test
        public void testValidValue() {
            MultipleOfFiveValidator validator = new MultipleOfFiveValidator();
            assertTrue(validator.isValid(10, null));
            assertTrue(validator.isValid(0, null));
            assertTrue(validator.isValid(-15, null));
        }

        @Test
        public void testInvalidValue() {
            MultipleOfFiveValidator validator = new MultipleOfFiveValidator();
            assertFalse(validator.isValid(7, null));
            assertFalse(validator.isValid(18, null));
            assertFalse(validator.isValid(-9, null));
        }

}
