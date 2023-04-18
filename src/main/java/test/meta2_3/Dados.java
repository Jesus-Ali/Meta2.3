/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.HashMap;

/**
 *
 * @author Armando
 */
public class Dados {
    HashMap<Integer, Dado> dados = new HashMap<>();
    
    public Dados(){
        crearDados();
        lanzarDados();
        mostrarDados();
    }
    
    public void crearDados(){
        for(int i=0; i<5; i++){
            dados.put(i, new Dado(6));
        }
    }
    
    public void lanzarDados(){
        for(int i=0; i<5; i++){
            dados.get(i).lanzarDado();
        }
    }
    
    public void mostrarDados(){
        for(int i=0; i<5; i++){
            System.out.println(dados.get(i).getLadoActual());
        }
    }
}
