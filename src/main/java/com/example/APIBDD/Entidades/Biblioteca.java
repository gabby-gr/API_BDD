/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIBDD.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

/**
 *
 * @author ggaby
 */

@Entity
@Table (name= "libros")
public class Biblioteca {
    @Id
    private int id;
    @Column (length =50)
    private String NombreLibro;
    private String Autor;
    private int pag;
    private String Editorial;
    private String Idioma;

    public Biblioteca(int id, String NombreLibro, String Autor, int pag, String Editorial, String Idioma) {
        this.id = id;
        this.NombreLibro = NombreLibro;
        this.Autor = Autor;
        this.pag = pag;
        this.Editorial = Editorial;
        this.Idioma = Idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    
    
    
    
}
