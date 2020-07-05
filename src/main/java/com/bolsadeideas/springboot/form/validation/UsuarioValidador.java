package com.bolsadeideas.springboot.form.validation;

import com.bolsadeideas.springboot.form.models.domain.Usuario;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UsuarioValidador implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //Usuario usuario = (Usuario) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "requerido.usuario.nombre");

        /* if(!usuario.getIdentificador().matches("[\\d]{2}[.][\\d]{3}[.][\\d]{3}[-][a-zA-Z]{1}")) {
            errors.rejectValue("identificador", "patter.usuario.identificador");
        } */
    }
    
}