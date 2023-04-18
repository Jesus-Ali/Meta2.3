/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.Random;

/**
 *
 * @author Armando
 */
public class Dado {
    Random random = new Random();
    int caras, ladoActual;
    
    public Dado(int n){
        if(n == 6 || n == 12)
            caras = n;
        else
            System.out.println("Solo se puede 6 o 12 caras");
    }

    public int getLadoActual() {
        return ladoActual;
    }
    
    public int lanzarDado(){
        ladoActual = random.nextInt(caras)+1;
        return ladoActual;
    }
}
