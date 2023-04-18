/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.meta2_3;

public class Calculadora {
    
    public Calculadora(){
        Numero_Complejo numero1 = new  Numero_Complejo(1,2);
        Numero_Complejo numero2 = new Numero_Complejo(3,4);
        System.out.println(sumar(numero1, numero2));
        System.out.println(restar(numero1, numero2));
        System.out.println(multiplicar(numero1, numero2));
        System.out.println(dividir(numero1, numero2));
    }

    public static Numero_Complejo sumar(Numero_Complejo numero1, Numero_Complejo numero2) {
        double numReal = numero1.getNumreal() + numero2.getNumreal();
        double numImaginario = numero1.getNumimaginario() + numero2.getNumimaginario();
        return new Numero_Complejo(numReal, numImaginario);
    }

    public static Numero_Complejo restar(Numero_Complejo numero1, Numero_Complejo numero2) {
        double numReal = numero1.getNumreal() - numero2.getNumreal();
        double numImaginario = numero1.getNumimaginario() - numero2.getNumimaginario();
        return new Numero_Complejo(numReal, numImaginario);
    }

    public static Numero_Complejo multiplicar(Numero_Complejo numero1, Numero_Complejo numero2) {
        double numReal = (numero1.getNumreal() * numero2.getNumreal()) - (numero1.getNumimaginario() * numero2.getNumimaginario());
        double numImaginario = (numero1.getNumreal() * numero2.getNumimaginario()) + (numero1.getNumimaginario() * numero2.getNumreal());
        return new Numero_Complejo(numReal, numImaginario);
    }

    public static Numero_Complejo dividir(Numero_Complejo numero1, Numero_Complejo numero2) {
        double numReal = (numero1.getNumreal() * numero2.getNumreal()) - (numero1.getNumimaginario() * (-numero2.getNumimaginario()));
        double numImaginario = (numero1.getNumreal() * (-numero2.getNumimaginario())) + (numero1.getNumimaginario() * numero2.getNumreal());
        double denominador = (numero2.getNumreal() * numero2.getNumreal()) - (numero2.getNumimaginario() * (-numero2.getNumimaginario()));
        numReal /= denominador;
        numImaginario /= denominador;
        return new Numero_Complejo(numReal, numImaginario);
    }
}
