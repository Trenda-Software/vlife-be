package com.vlife.backend.controllers;

import java.util.List;

import com.vlife.backend.models.Especialidad;
import com.vlife.backend.services.IEspecialidadService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class EspecialidadController {
    @Autowired
    IEspecialidadService especialidadService;

    @GetMapping("/especialidades")
    public List<Especialidad> getAllUsuario(){
        return especialidadService.getAll();
    }

    @GetMapping("/especialidades/{id}")
    public Especialidad getOne(@PathVariable(value = "id") long id){
        return especialidadService.get(id);
    }

    @PostMapping("/especialidades")
    public void add(Especialidad especialidad){
        especialidadService.post(especialidad);
    }

    @PutMapping("/especialidades/{id}")
    public void update(Especialidad especialidad,@PathVariable(value = "id") long id){
        especialidadService.put(especialidad, id);
    }
    @DeleteMapping("/especialidades/{id}")
	public void update(@PathVariable(value = "id") long id) {
		especialidadService.delete(id);
	}
}
