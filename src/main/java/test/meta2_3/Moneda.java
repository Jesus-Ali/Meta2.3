/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.Random;

/**
 *
 * @author 1259a
 */
public class Moneda {
    boolean aguila;
    
    public void lanzarMoneda(){
        Random random = new Random();
        aguila = random.nextBoolean();
    }

    @Override
    public String toString() {
        if(aguila)
            return "Aguila";
        else
            return "Sol";
    }
}
