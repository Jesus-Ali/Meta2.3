/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

/**
 *
 * Esta clase modela un numero complejo.
 */
public class Numero_Complejo {
    private double numReal;
    private double numImaginario;
    
    public Numero_Complejo(){}
    
    public Numero_Complejo(double numReal,double numImaginario){
        this.numReal = numReal;
        this.numImaginario = numImaginario;
    }

    public double getNumreal() {
        return numReal;
    }

    public void setNumreal(double numReal) {
        this.numReal = numReal;
    }

    public double getNumimaginario() {
        return numImaginario;
    }

    public void setNumimaginario(double numImaginario) {
        this.numImaginario = numImaginario;
    }
    
    /**
     * 
     * Este metodo regresa el numero complejo en una cadena 
     */
    @Override
    public String toString(){
        return String.format("%.3f + %.3fi", numReal, numImaginario);
    }
}
