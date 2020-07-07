package com.bolsadeideas.springboot.form.services;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.form.models.domain.Pais;

import org.springframework.stereotype.Service;

@Service
public class PaisServiceIml implements PaisService {

    private List<Pais> lista;

    public PaisServiceIml() {
        this.lista = Arrays.asList(
            new Pais(1, "ES","España"),
            new Pais(2, "MX","México"),
            new Pais(3, "CL","Chile"),
            new Pais(4, "AR","Argentina"),
            new Pais(5, "PE","Perú"),
            new Pais(6, "CO","Colombia"),
            new Pais(7, "VE","Venezuela"));
    }

    @Override
    public List<Pais> listar() {
        return lista;
    }

    @Override
    public Pais obtenerPorId(Integer id) {
        for(Pais pais: lista) {
            if(id == pais.getId()) {
                return pais;
            }
        }
        return null;
    }

}