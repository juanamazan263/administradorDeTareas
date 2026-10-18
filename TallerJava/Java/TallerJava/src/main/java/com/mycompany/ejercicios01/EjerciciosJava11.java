/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios01;

/**
 *
 * @author SENA
 */
import java.util.Scanner;
public class EjerciciosJava11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resta, suma, multiplicacion, division, modulo;
        System.out.println("Escriba el primer numero");
        num1=scanner.nextDouble();
        System.out.println("Escriba el segundo numero");
        num2=scanner.nextDouble();
        suma=num1+num2;
        if (num1>num2) {
            resta=num1-num2;
        } else {
            resta=num2-num1;
        }
        multiplicacion=num1*num2;
        if (num1>num2) {
            division=num1/num2;
        } else {
            division=num2/num1;
        }
        if (num1>num2) {
            modulo=num1 % num2;
        } else {
            modulo=num2 % num1;
        }
        System.out.println("La suma de los dos numeros es: "+suma);
        System.out.println("La resta de los dos numeros es: "+resta);
        System.out.println("La multiplicacion de los do numeros es: "+multiplicacion);
        System.out.println("La division de los dos numeros es: "+division);
        System.out.println("El resto de la division de los dos numeros es: "+modulo);
    }
    
    
    
}
