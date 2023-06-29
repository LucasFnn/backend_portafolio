package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Usuario;
import com.lgf.portafolio.repositorio.UsuarioRepositorio;
import com.lgf.portafolio.servicio.UsuarioServicio;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Fanin
 */

@RestController
@CrossOrigin("*")
public class PerfilControlador {
    
    private UsuarioRepositorio usuarioRepositorio;
    private UsuarioServicio usuarioServicio;
    
    /*
    @GetMapping("/editarperfil")
    public List<Usuario> verUsuarios(){
        return  usuarioRepositorio.findAll();  
        
    }*/
    
     @GetMapping("/perfil")
    public Usuario obtenerUsuario(){
        return usuarioServicio.obtenerUsuario("lucasfnn");
    }
    
}
