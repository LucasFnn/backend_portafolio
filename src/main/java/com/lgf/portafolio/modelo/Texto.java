package com.lgf.portafolio.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Lucas Fanin
 */

@Entity
@Table(name = "textos")
public class Texto implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
    private String nombre;
    
    private String contenido;
    
    @OneToOne
    private Usuario usuario;

    public Texto() {
    }

    public Texto(Integer id) {
        this.id = id;
    }

    public Texto(Integer id, String nombre, String contenido, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
