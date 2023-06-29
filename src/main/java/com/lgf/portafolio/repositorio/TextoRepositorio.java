package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Texto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Lucas Fanin
 */

@Repository
public interface TextoRepositorio  extends JpaRepository<Texto, Integer>{
    
    
    
}
