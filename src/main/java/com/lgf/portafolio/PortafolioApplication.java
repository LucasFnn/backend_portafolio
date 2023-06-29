package com.lgf.portafolio;

import com.lgf.portafolio.modelo.Rol;
import com.lgf.portafolio.modelo.Usuario;
import com.lgf.portafolio.modelo.UsuarioRol;
import com.lgf.portafolio.servicio.UsuarioServicio;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PortafolioApplication implements CommandLineRunner{
    
        @Autowired 
        private UsuarioServicio usuarioServicio;

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        /*Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Fanin");
        usuario.setUsername("lucasfnn");
        usuario.setPassword("123456");
        usuario.setEmail("lucas_fanin@hotmail.com");
        usuario.setTelefono("351500000");
        usuario.setPerfil("");
        Rol rol = new Rol();
        rol.setId(1L);
        rol.setNombre("ADMIN");
        Set<UsuarioRol> usuariosRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        usuariosRoles.add(usuarioRol);
        Usuario usuarioGuardado = usuarioServicio.guardarUsuario(usuario, usuariosRoles);
        System.out.println(usuarioGuardado.getUsername());
*/
    }
   
    }

