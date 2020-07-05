package com.bolsadeideas.springboot.form.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidador implements ConstraintValidator<IdentificatorRegex, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.matches("[\\d]{2}[.][\\d]{3}[.][\\d]{3}[-][a-zA-Z]{1}")) {
            return true;
        }
        return false;
    }
    
}