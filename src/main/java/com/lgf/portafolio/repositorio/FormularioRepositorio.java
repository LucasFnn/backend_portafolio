package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin
 */

@Repository
public interface FormularioRepositorio extends JpaRepository<Formulario, Integer> {
    
}
