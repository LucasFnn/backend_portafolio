package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Proyecto;
import com.lgf.portafolio.repositorio.ProyectoRepositorio;
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
public class ProyectoControlador {
    
    @Autowired
    private ProyectoRepositorio proyectoRepositorio;
    
    
      @GetMapping("/proyectos")
        public List<Proyecto> listarProyecto() {
	return proyectoRepositorio.findAll();
	}
	
        @DeleteMapping("/proyectos/eliminar/{id}")
	public void eliminarProyecto(@PathVariable("id") Integer id) {
		proyectoRepositorio.deleteById(id);
		
	}
      @PostMapping("/proyectos/guardarproyecto")
      public  Proyecto guardarProyecto(@RequestBody Proyecto proyecto){
        return proyectoRepositorio.save(proyecto);
      }
       
      @PutMapping("/proyectos/{id}")
      public ResponseEntity<Proyecto> editarProyecto(@PathVariable Integer id, @RequestBody Proyecto detallesProyecto){
        Proyecto proyecto = proyectoRepositorio.findById(id).get();
       
         proyecto.setNombre(detallesProyecto.getNombre());
         proyecto.setUrl(detallesProyecto.getUrl());
         proyecto.setDescripcion(detallesProyecto.getDescripcion());
 
     
         Proyecto proyectoActualizado = proyectoRepositorio.save(proyecto);
         
         return ResponseEntity.ok(proyectoActualizado);
    
    }
    
}
