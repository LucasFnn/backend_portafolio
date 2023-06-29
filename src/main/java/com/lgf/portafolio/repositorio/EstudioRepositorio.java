package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin
 */
@Repository
public interface EstudioRepositorio extends JpaRepository<Estudio, Integer>  {
   
 
  }

