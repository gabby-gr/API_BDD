/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIBDD.Controladores;
import com.example.APIBDD.Entidades.Biblioteca;
import com.example.APIBDD.Servicios.ServicioBiblioteca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ggaby
 */

@RestController
@RequestMapping("/biblioteca")
public class ControladoBiblioteca {
    
    @Autowired
    ServicioBiblioteca sBiblio;
    
    @GetMapping("")
    public List<Biblioteca> getLibros () {
        return sBiblio.obtenerLibros();
    }
    
    @PostMapping("")
    public List<Biblioteca> postInsertarLibros (@RequestBody Biblioteca a) {
        if (sBiblio.insertarLibro(a)){
            return sBiblio.obtenerLibros();
                
        }else{
            return null;
        }
    }
    
    @PutMapping("")
    public List<Biblioteca> putActualizar(@RequestBody Biblioteca a){
        if (sBiblio.insertarLibro(a)){
            return sBiblio.obtenerLibros();
                
        }else{
            return null;
        }
    
    }
    
    @DeleteMapping("")
    public List<Biblioteca> deletetEliminarAnimal(@RequestBody Biblioteca a){
        if (sBiblio.eliminarrLibro(a)){
            return sBiblio.obtenerLibros();
                
        }else{
            return null;
        }
    
    }
}
