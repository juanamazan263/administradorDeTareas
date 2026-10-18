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
public class EjerciciosJava13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centimetros, pulgadas;
        System.out.println("Escriba el valor en centimetros");
        centimetros=scanner.nextDouble();
        pulgadas=centimetros/2.54;
        System.out.println("Eso equivale a: "+pulgadas);
    }
}
