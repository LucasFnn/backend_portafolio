package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Estudio;
import com.lgf.portafolio.repositorio.EstudioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
public class EstudioControlador {
    
    @Autowired
    private EstudioRepositorio estudioRepositorio;
    
    
     @GetMapping("/estudios")
        public List<Estudio> listarEstudios() {
	return estudioRepositorio.findAll();
	}
	
        @DeleteMapping("/estudios/eliminar/{id}")
	public void eliminarEstudio(@PathVariable("id") Integer id) {
		estudioRepositorio.deleteById(id);
		
	}
      @PostMapping("/estudios/guardarestudio")
      public  Estudio guardarEstudio(@RequestBody Estudio estudio){
        return estudioRepositorio.save(estudio);
      }
       
      @PutMapping("/estudios/{id}")
      public ResponseEntity<Estudio> editarEstudio(@PathVariable Integer id, @RequestBody Estudio detallesEstudio){
        Estudio estudio = estudioRepositorio.findById(id).get();
       
         estudio.setEstablecimiento(detallesEstudio.getEstablecimiento());
         estudio.setFecha_inicio(detallesEstudio.getFecha_inicio());
         estudio.setFecha_fin(detallesEstudio.getFecha_fin());
         estudio.setTitulo(detallesEstudio.getTitulo());
 
     
         Estudio estudioActualizado = estudioRepositorio.save(estudio);
         
         return ResponseEntity.ok(estudioActualizado);
    
    }
}

		