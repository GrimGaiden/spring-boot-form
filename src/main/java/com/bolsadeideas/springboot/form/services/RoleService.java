package com.bolsadeideas.springboot.form.services;

import java.util.List;

import com.bolsadeideas.springboot.form.models.domain.Role;

public interface RoleService {
    
    List<Role> listar();
    Role obtenerPorId(Integer id);
}