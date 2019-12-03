package com.vlife.backend.services;

import java.util.List;

import com.vlife.backend.models.Usuario;

public interface IUsuarioService {
    public Usuario get(long id);
    public List<Usuario> getAll();
    public void post(Usuario usuario);
    public void put(Usuario usuario,long id);
    public void delete(long id);



}