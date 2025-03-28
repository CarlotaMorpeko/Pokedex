/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokedex.ui;

/**
 *
 * @author Technologyland
 */
public class Main {
    public static void main(String[] args) {
        try{
            
            IniciarPrograma start = new IniciarPrograma();
            start.iniciar();
                    
        }catch (Exception ex){
            System.err.println("Ha susedido un error, intentelo mas tarde");
        }
           
    }
    
}
