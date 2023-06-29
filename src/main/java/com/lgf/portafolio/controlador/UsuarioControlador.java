
package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Rol;
import com.lgf.portafolio.modelo.Texto;
import com.lgf.portafolio.modelo.Usuario;
import com.lgf.portafolio.modelo.UsuarioRol;
import com.lgf.portafolio.repositorio.UsuarioRepositorio;
import com.lgf.portafolio.servicio.UsuarioServicio;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *@author Lucas Fanin 
 */
@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioService;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{

        Set<UsuarioRol> usuarioRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario,usuarioRoles);
    }


    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }

    
    @GetMapping("/listar")
    public List<Usuario> obtenerListaUsuarios(){
    return usuarioRepositorio.findAll();
    }

     /*@PutMapping("/usuarios/{id}")
      public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario detallesUsuario){
        Usuario usuario = usuarioRepositorio.findByUsername("lucasfnn");
       
         usuario.setNombre(detallesUsuario.getNombre());
         usuario.setApellido(detallesUsuario.getApellido());
        usuario.setEmail(detallesUsuario.getEmail());
         usuario.setTelefono(detallesUsuario.getTelefono());
       
        
         Usuario usuarioActualizado = usuarioRepositorio.save(usuario);
         
         return ResponseEntity.ok(usuarioActualizado);
    
    }*/
}

    
    
