package com.lgf.portafolio.repositorio;

import com.lgf.portafolio.modelo.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Fanin
 */

@Repository
public interface RedSocialRepositorio extends JpaRepository<RedSocial, Integer>{

    @Override
    public void deleteById(Integer id);
    
    
}
