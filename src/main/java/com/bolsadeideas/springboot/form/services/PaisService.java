package com.bolsadeideas.springboot.form.services;

import java.util.List;

import com.bolsadeideas.springboot.form.models.domain.Pais;

public interface PaisService {
    
    List<Pais> listar();
    Pais obtenerPorId(Integer id);
}