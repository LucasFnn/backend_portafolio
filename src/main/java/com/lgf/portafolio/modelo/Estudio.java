package com.lgf.portafolio.modelo;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "estudios")
public class Estudio implements Serializable {
    
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
        private String establecimiento;
        
        private Date fecha_inicio;
        
        private Date fecha_fin;
        
        private String titulo;
        
        
        @OneToOne
        private Usuario usuario;

    public Estudio() {
    }

    public Estudio(Integer id) {
        this.id = id;
    }

    public Estudio(Integer id, String establecimiento, Date fecha_inicio, Date fecha_fin, String titulo, Usuario usuario) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.titulo = titulo;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        
          }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
        
    
}
