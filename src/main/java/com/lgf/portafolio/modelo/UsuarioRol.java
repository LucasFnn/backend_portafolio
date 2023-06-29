package com.lgf.portafolio.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucas Fanin 
 */
@Entity
public class UsuarioRol implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    
    @ManyToOne
    private Rol rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public UsuarioRol() {
    }

    public UsuarioRol(Long id, Usuario usuario, Rol rol) {
        this.id = id;
        this.usuario = usuario;
        this.rol = rol;
    }
    
    
    
    
}
