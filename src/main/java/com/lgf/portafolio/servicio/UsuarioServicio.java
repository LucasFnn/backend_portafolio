package com.lgf.portafolio.servicio;

import com.lgf.portafolio.modelo.Usuario;
import com.lgf.portafolio.modelo.UsuarioRol;
import java.util.Set;

/**
 *
 * @author Lucas Fanin 
 */
public interface UsuarioServicio {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles)throws Exception;
    
     public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
