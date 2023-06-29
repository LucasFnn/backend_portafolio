package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin 
 */

@Repository
public interface UsuarioRepositorio  extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUsername(String username);

      
    
}
