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
public class EjerciciosJava07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Indique la temperatura en grados fahrenheit");
        fahrenheit=scanner.nextDouble();
        celsius=(fahrenheit-32)/1.8;
        System.out.println(fahrenheit+" grados fahrenheit equivalen a "+celsius+" grados celsius");
    }
    
}
