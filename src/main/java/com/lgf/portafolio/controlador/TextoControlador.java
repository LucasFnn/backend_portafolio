package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Texto;
import com.lgf.portafolio.repositorio.TextoRepositorio;
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
public class TextoControlador {
    
    @Autowired
    private TextoRepositorio textoRepositorio;
    
    
      @GetMapping("/textos")
        public List<Texto> listarTextos() {
	return textoRepositorio.findAll();
	}
	
        @DeleteMapping("/textos/eliminar/{id}")
	public void eliminarTexto(@PathVariable("id") Integer id) {
		textoRepositorio.deleteById(id);
		
	}
      @PostMapping("/textos/guardarproyecto")
      public  Texto guardarTexto(@RequestBody Texto texto){
        return textoRepositorio.save(texto);
      }
       
      @PutMapping("/textos/{id}")
      public ResponseEntity<Texto> editarTexto(@PathVariable Integer id, @RequestBody Texto detallesTexto){
        Texto texto = textoRepositorio.findById(id).get();
       
         texto.setNombre(detallesTexto.getNombre());
         texto.setContenido(detallesTexto.getContenido());
       
         Texto textoActualizado = textoRepositorio.save(texto);
         
         return ResponseEntity.ok(textoActualizado);
    
    }
      
     @GetMapping("/textos/buscar/{id}")
     public Texto obtenerTexto(@PathVariable Integer id){
    Texto texto = textoRepositorio.findById(id).get();
         System.out.println(texto.getContenido());
         
         return texto;
         
     }
     
 
    
}
