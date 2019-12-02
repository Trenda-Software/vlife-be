package com.vlife.backend.dao;
import com.vlife.backend.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    
}
