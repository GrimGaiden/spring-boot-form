package com.bolsadeideas.springboot.form.controllers;

/* import java.util.HashMap;
import java.util.Map; */

import javax.validation.Valid;

import com.bolsadeideas.springboot.form.models.domain.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model) {

        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String porcesar(@Valid Usuario usuario, BindingResult result, Model model) {

        model.addAttribute("titulo", "Resultado form");

        if(result.hasErrors()) {
/*             Map<String, String> errores = new HashMap<>();
            result.getFieldErrors().forEach(err ->{
                errores.put(err.getField(), "El campo ".concat(err.getField().concat(err.getDefaultMessage())));
            });
            model.addAttribute("error", errores); */
            return "form";
        }

        model.addAttribute("usuario", usuario);
        return "resultado";
    }
}