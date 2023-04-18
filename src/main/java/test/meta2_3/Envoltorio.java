/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Armando
 */
public class Envoltorio {
    ArrayList<Integer> array = new ArrayList<>(10);
    
    public Envoltorio(){
        llenarConAleatorios();
        mostrar();
        mostrarVecesRepetidas();
    }
    
    public void llenarConAleatorios(){
        Random random = new Random();
        for(int i=0; i<10; i++){
            array.add(random.nextInt(12));
        }
    }
    
    public void mostrar(){
        for(int i=0; i<10; i++){
            System.out.print(array.get(i)+", ");
        }
    }
    
    public void mostrarVecesRepetidas(){
        System.out.println("\nNumero de veces repetidas");
        for(int i=0; i<array.size(); i++){
            int cuenta = 0;
            for(int j=0; j<array.size(); j++){
                if(array.get(j) == i)
                    cuenta++;
            }
            System.out.println(i+": "+cuenta);
        }
    }
}
