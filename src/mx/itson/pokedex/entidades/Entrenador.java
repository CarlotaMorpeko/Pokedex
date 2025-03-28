/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokedex.entidades;

/**
 *
 * @author Technologyland
 */
public class Entrenador {

    /**
     * @return the pokedex
     */
    public Pokedex getPokedex() {
        return pokedex;
    }

    /**
     * @param pokedex the pokedex to set
     */
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    private String nombre;
    private int edad;
    private Pokedex pokedex;
    
   public void mostrarEntrenador(){
        System.out.println("Entrenador: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Pokémon registrados: " + pokedex.pokemonRegistrados());
    }
   
}