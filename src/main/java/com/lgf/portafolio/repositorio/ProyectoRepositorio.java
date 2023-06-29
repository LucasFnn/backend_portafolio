package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin
 */

@Repository
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Integer> {
    
}
