
package com.lgf.portafolio.controlador;


import com.lgf.portafolio.modelo.RedSocial;
import com.lgf.portafolio.repositorio.RedSocialRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Fanin
 */

@RestController
@CrossOrigin("*")
public class RedControlador {
    
    @Autowired
    private RedSocialRepositorio redSocialRepositorio;
    
      @GetMapping("/redes")
        public List<RedSocial> listarRedes() {
	return redSocialRepositorio.findAll();
	}
	
        @DeleteMapping("/redes/eliminar/{id}")
	public void eliminarRed(@PathVariable("id") Integer id) {
		redSocialRepositorio.deleteById(id);
		
	}
      @PostMapping("/redes/guardarred")
      public  RedSocial guardarRed(@RequestBody RedSocial redSocial){
        return redSocialRepositorio.save(redSocial);
      }
       
      @PutMapping("/redes/{id}")
      public ResponseEntity<RedSocial> editarRed(@PathVariable Integer id, @RequestBody RedSocial detallesRed){
        RedSocial red = redSocialRepositorio.findById(id).get();
       
         red.setNombre(detallesRed.getNombre());
         red.setUrl(detallesRed.getUrl());
 
     
         RedSocial redActualizada = redSocialRepositorio.save(red);
         
         return ResponseEntity.ok(redActualizada);
    
    }
    
}
