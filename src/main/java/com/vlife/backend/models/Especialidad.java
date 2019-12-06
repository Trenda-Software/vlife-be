package com.vlife.backend.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "V_especialidad")
public class Especialidad implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEspecialidad;
    @NotNull
    private int codigo;
    @NotEmpty
    private String especialidad;
    @NotNull
    private int cantprofesionales;
   
        public long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantProfesionales() {
        return cantprofesionales;
    }

    public void setCantProfesionales(int cantprofesionales) {
        this.cantprofesionales = cantprofesionales;
    }

    public Especialidad(int codigo, String especialidad, int cantprofesionales) {
        super();
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.cantprofesionales = cantprofesionales;
    }

    public Especialidad() {
    }





   
}
