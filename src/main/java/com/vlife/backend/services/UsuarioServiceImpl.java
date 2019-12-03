package com.vlife.backend.services;

import java.util.List;

import com.vlife.backend.dao.IUsuarioDao;
import com.vlife.backend.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {


    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public Usuario get(long id) {
        return usuarioDao.findById(id).get();
        }

    @Override
    public List<Usuario> getAll() {

        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public void post(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void put(Usuario usuario, long id) {
        usuarioDao.findById(id).ifPresent((x)->{
            usuario.setIdUsuario(id);
            usuarioDao.save(usuario);
        });

    }

    @Override
    public void delete(long id) {
        usuarioDao.deleteById(id);
    }


}