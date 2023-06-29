package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin 
 */

@Repository
public interface HabilidadRepositorio   extends JpaRepository<Habilidad, Integer> {
    
}
