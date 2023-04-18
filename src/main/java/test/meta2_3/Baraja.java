/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author 1259a
 */
public class Baraja {
    HashSet<Carta> cartas = new HashSet<Carta>();
    
    public Baraja(){
        crearCartas();
        regresarCartaAleatoria();
    }
    
    public void crearCartas(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=13; j++){
                cartas.add(new Carta(i,j));
            }
        }
    }
    
    public void regresarCartaAleatoria(){
        Carta c = cartas.iterator().next();
        cartas.remove(c);
        System.out.println(c.toString());
    }
}
