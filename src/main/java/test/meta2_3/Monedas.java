/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.HashMap;

/**
 *
 * @author 1259a
 */
public class Monedas {
    HashMap<Integer, Moneda> monedas = new HashMap<>();
    
    public Monedas(){
        crearMonedas();
        lanzarMonedas();
        mostrarMonedas();
    }
    
    public void crearMonedas(){
        for(int i=0; i<5; i++){
            monedas.put(i, new Moneda());
        }
    }
    
    public void lanzarMonedas(){
        for(int i=0; i<5; i++){
            monedas.get(i).lanzarMoneda();
        }
    }
    
    public void mostrarMonedas(){
        for(int i=0; i<5; i++){
            System.out.println(monedas.get(i).toString());;
        }
    }
}
