/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas Fanin 
 */
public interface RolRepositorio extends JpaRepository<Rol, Long> {
    
}
