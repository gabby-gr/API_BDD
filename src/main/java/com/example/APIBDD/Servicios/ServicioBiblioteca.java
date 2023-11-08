/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIBDD.Servicios;
import com.example.APIBDD.Entidades.Biblioteca;
import com.example.APIBDD.Repositorios.RepositorioBiblioteca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ggaby
 */
@Service
public class ServicioBiblioteca {

    @Autowired
    RepositorioBiblioteca rBiblio;
       
    public List<Biblioteca> obtenerLibros () {
       return rBiblio.findAll();
    }
    
    public boolean insertarLibro (Biblioteca a){
        
        boolean respuesta = false;
        try{
            rBiblio.save(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }
    
    public boolean actualizarLibro (Biblioteca a){
        
        boolean respuesta = false;
        try{
            rBiblio.save(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }
    
    public boolean eliminarrLibro (Biblioteca a){
        
        boolean respuesta = false;
        try{
            rBiblio.delete(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }

    
}
