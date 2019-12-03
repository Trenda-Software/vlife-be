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
    private String usuario;

    @NotEmpty
    private String clave;
    @NotEmpty
    private  String coordenadas;
    @NotEmpty
    private  String nombre;
    @NotEmpty
    private  String apellido;
    //@NotEmpty
    //private  VarbinaryTypeDescriptor foto;
    @NotEmpty
    private  String mail;
    @NotEmpty
    private  String celular;
    @NotEmpty
    private  String direccion;
    @NotEmpty
    private  String ciudad;
   // @NotEmpty
    //private  int idProvincias;
    //@NotEmpty
    //private  int idPais;
    //@NotEmpty
    //private  int idSolicitud;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public Usuario(int codigo, String usuario, String clave, String coordenadas, String nombre, String apellido, String mail, String celular, String direccion, String ciudad) {
        super();
        this.codigo = codigo;
        this.usuario = usuario;
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
