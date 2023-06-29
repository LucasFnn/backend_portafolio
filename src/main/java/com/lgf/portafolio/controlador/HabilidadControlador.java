package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Habilidad;
import com.lgf.portafolio.repositorio.HabilidadRepositorio;
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
public class HabilidadControlador {
    
    @Autowired
    private HabilidadRepositorio habilidadRepositorio;
    
       
    @GetMapping("/habilidades")
        public List<Habilidad> listarHabilidades() {
	return habilidadRepositorio.findAll();
	}
		
    @DeleteMapping("/habilidades/eliminar/{id}")
    public void eliminarHabilidad(@PathVariable("id") Integer id) {
        habilidadRepositorio.deleteById(id);

    }

    @PostMapping("/habilidades/guardarhabilidad")
    public Habilidad guardarHabilidad(@RequestBody Habilidad habilidad) {
        return habilidadRepositorio.save(habilidad);
    }

    @PutMapping("/habilidades/{id}")
    public ResponseEntity<Habilidad> editarHabilidad(@PathVariable Integer id, @RequestBody Habilidad detallesHabilidad){
        Habilidad habilidad = habilidadRepositorio.findById(id).get();
       
         habilidad.setNombre(detallesHabilidad.getNombre());
         habilidad.setNivel(detallesHabilidad.getNivel());
         habilidad.setDescripcion(detallesHabilidad.getDescripcion());
     
         Habilidad habilidadActualizada = habilidadRepositorio.save(habilidad);
         
         return ResponseEntity.ok(habilidadActualizada);
    
    }
    
    

    
}
