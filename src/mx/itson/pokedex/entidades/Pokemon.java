/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokedex.entidades;

import mx.itson.pokedex.enums.Shiny;
import mx.itson.pokedex.enums.TipoPokemon;

/**
 *
 * @author Technologyland
 */
public class Pokemon {

    /**
     * @return the variocolor
     */
    public Shiny getVariocolor() {
        return variocolor;
    }

    /**
     * @param variocolor the variocolor to set
     */
    public void setVariocolor(Shiny variocolor) {
        this.variocolor = variocolor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tipo
     */
    public TipoPokemon getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }
    
    private String nombre;
    private int nivel;
    private TipoPokemon tipo;
    private Shiny variocolor;
        
    public void mostrarInformacion() {
        System.out.println("Pokemon: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Tipo: " + tipo);
    }
    
}
