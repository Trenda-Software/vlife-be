package com.vlife.backend.services;

import java.util.List;

import com.vlife.backend.dao.IEspecialidadDao;
import com.vlife.backend.models.Especialidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService {


    @Autowired
    private IEspecialidadDao especialidadDao;

    @Override
    public Especialidad get(long id) {
        return especialidadDao.findById(id).get();
        }

    @Override
    public List<Especialidad> getAll() {

        return (List<Especialidad>) especialidadDao.findAll();
    }

    @Override
    public void post(Especialidad especialidad) {
        especialidadDao.save(especialidad);
    }

    @Override
    public void put(Especialidad especialidad, long id) {
        especialidadDao.findById(id).ifPresent((x)->{
            especialidad.setIdEspecialidad(id);
            especialidadDao.save(especialidad);
        });

    }

    @Override
    public void delete(long id) {
        especialidadDao.deleteById(id);
    }


}