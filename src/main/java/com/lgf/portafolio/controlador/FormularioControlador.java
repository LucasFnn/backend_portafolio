package com.lgf.portafolio.controlador;

import com.lgf.portafolio.modelo.Formulario;
import com.lgf.portafolio.repositorio.FormularioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Fanin
 */

@RestController
@CrossOrigin("*")
public class FormularioControlador {
    
    
    @Autowired
    private FormularioRepositorio formularioRepositorio;
    
    
         @GetMapping("/formularios")
        public List<Formulario> listarForms() {
	return formularioRepositorio.findAll();
	}
	
        @DeleteMapping("/formularios/eliminar/{id}")
	public void eliminarFormulario(@PathVariable("id") Integer id) {
		formularioRepositorio.deleteById(id);
		
	}
      @PostMapping("/formularios/guardarformulario")
      public  Formulario guardarFormulario(@RequestBody Formulario formulario){
        return formularioRepositorio.save(formulario);
      }
    
    
}
