/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

import java.util.Objects;

/**
 *
 * @author 1259a
 */
public class Carta {
    int valor,simbolo;

    public Carta(int simbolo, int valor) {
        this.simbolo = simbolo;
        this.valor = valor;
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())return false;
        Carta carta = (Carta) o;
        return valor == carta.getValor() && simbolo == carta.getSimbolo();
    }
    
    public int HashCode(){
        return Objects.hash(valor, simbolo);
    }

    @Override
    public String toString() {
        return "("+simbolo+","+valor+")";
    }
}
