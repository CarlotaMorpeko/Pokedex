/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokedex.ui;

import java.util.Scanner;
import mx.itson.pokedex.entidades.Entrenador;
import mx.itson.pokedex.entidades.Pokedex;
import mx.itson.pokedex.entidades.Pokemon;
import mx.itson.pokedex.enums.TipoPokemon;

/**
 *
 * @author Technologyland
 */
public class IniciarPrograma {
   
    public Scanner scanner = new Scanner(System.in);
    public Pokedex pokedex = new Pokedex();
    public Pokedex entrenador = new Pokedex();
    public Entrenador trainer = new Entrenador();
    public void iniciar() {
        
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEntrenador();
                    break;
                case 2:
                    agregarPokemon();
                    break;
                case 3:
                    trainer.mostrarEntrenador();
                    break;
                case 4:
                    pokedex.mostrarPokemon();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("\n--- Menu Pokedex ---");
        System.out.println("1. Registrar entrenador");
        System.out.println("2. Agregar un Pokemon");
        System.out.println("3. Mostrar entrenador");
        System.out.println("4. Ver todos los Pokemon");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
    }

    public void agregarPokemon() {
        System.out.print("Ingrese el nombre del Pokemon: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el nivel del Pokemon: ");
        int nivel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese solo el primero tipo del Pokemon (Electrico, Fuego, Agua, Planta, volador): ");
        String tipoElem = scanner.nextLine().toUpperCase();

        TipoPokemon tipo = TipoPokemon.valueOf(tipoElem);

        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(nombre);
        pokemon.setNivel(nivel);
        pokemon.setTipo(tipo);

        pokedex.agregarPokemon(pokemon);
    }
    public void registrarEntrenador(){
        System.out.print("Ingrese tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese tu edad: ");
        int edad = scanner.nextInt();

        trainer.setNombre(nombre);
        trainer.setEdad(edad);
        trainer.setPokedex(pokedex);
    }
}