package com.vlife.backend.controllers;

import java.util.List;

import com.vlife.backend.models.Usuario;
import com.vlife.backend.services.IUsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/Usuario")
    public List<Usuario> getAllUsuario(){
        return usuarioService.getAll();
    }

    @GetMapping("/Usuario/{id}")
    public Usuario getOne(@PathVariable(value = "id") long id){
        return usuarioService.get(id);
    }

    @PostMapping("/Usuario")
    public void add(Usuario usuario){
        usuarioService.post(usuario);
    }

    @PutMapping("/Usuario")
    public void update(Usuario usuario,long id){
        usuarioService.put(usuario, id);
    }
}