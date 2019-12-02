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
@Table(name = "usuarios")
public class Usuario implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    @NotNull
    private int codigo;
    @NotEmpty
    private String usuarios;

    @NotEmpty
    private String clave;
    @NotEmpty
    private  String coordenadas;
    @NotEmpty
    private  String nombre;
    @NotEmpty
    private  String apellido;
    //private  VARBINARY foto; 
    @NotEmpty
    private  String mail;
    @NotEmpty
    private  String celular;
    @NotEmpty
    private  String direccion;
    @NotEmpty
    private  String ciudad;

    //private  int idProvincias;
    //private  int idPais;
    //private  int idSolicitud;

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCoordenadas() {
        return this.coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public Usuario(int codigo, String usuarios, String clave, String coordenadas, String nombre, String apellido, String mail, String celular, String direccion, String ciudad) {
        this.codigo = codigo;
        this.usuarios = usuarios;
        this.clave = clave;
        this.coordenadas = coordenadas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Usuario() {
    }





}
