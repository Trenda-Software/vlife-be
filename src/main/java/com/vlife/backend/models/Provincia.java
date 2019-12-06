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
@Table(name = "Provincias")
public class Provincia implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdProvincias;
    @NotNull
    private int codigo;
    @NotNull
    private int IdPais; //aca mapear la relacion
    @NotEmpty
    private String nombre;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdPais() {
        return IdPais;
    }

    public void setIdPais(int pais) {
        this.IdPais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia(int codigo, int idpais, String nombre) {
        super();
        this.codigo = codigo;
        this.IdPais = idpais;
        this.nombre = nombre;
    }

    public Provincia() {
    }





   
}
