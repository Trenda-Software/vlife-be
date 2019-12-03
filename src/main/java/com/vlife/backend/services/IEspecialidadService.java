package com.vlife.backend.services;

import java.util.List;

import com.vlife.backend.models.Especialidad;

public interface IEspecialidadService {
    public Especialidad get(long id);
    public List<Especialidad> getAll();
    public void post(Especialidad especialidad);
    public void put(Especialidad especialidad,long id);
    public void delete(long id);



}