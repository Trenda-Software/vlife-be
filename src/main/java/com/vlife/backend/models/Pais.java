package com.vlife.backend.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Pais")
public class Pais implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdPais;
    @NotNull
    private int codigo;
    @NotEmpty
    private String nombre;

    @OneToMany(mappedBy = "Provincias")
    List<Usuario> usuarioList;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais(int codigo, String nombre) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Pais() {
    }





   
}
