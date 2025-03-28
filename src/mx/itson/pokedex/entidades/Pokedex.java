/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokedex.entidades;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Technologyland
 */
public class Pokedex {
    
    private List<Pokemon> pokemons = new ArrayList<>();
    
    public void agregarPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
        System.out.println(pokemon.getNombre() + "ha sido agregado. ");
    }
    
    public void mostrarPokemon(){
        if (pokemons.isEmpty()){
            System.out.println("No tiene pokémons registrados en su pokédex.");       
        } else{
            for (Pokemon pokemon : pokemons) {
                System.out.println("\n--- Pokedex ---");
                pokemon.mostrarInformacion();
                System.out.println("-------------------");
            }
        } 
    }

    public int pokemonRegistrados(){
        return pokemons.size();
    }
    
}
