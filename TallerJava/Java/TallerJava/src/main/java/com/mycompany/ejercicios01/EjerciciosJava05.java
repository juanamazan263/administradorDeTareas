/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios01;

/**
 *
 * @author jdieg
 */
import java.util.Scanner;

public class EjerciciosJava05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro;
        System.out.println("Ingrese el lado 1");
        lado1=scanner.nextDouble();
        System.out.println("Ingrese el lado 2");
        lado2=scanner.nextDouble();
        System.out.println("Ingrese el lado 3");
        lado3=scanner.nextDouble();
        perimetro=(lado1+lado2)+lado3;
        System.out.println("El perimetro de su triangulo es: "+perimetro);        
    }
}
