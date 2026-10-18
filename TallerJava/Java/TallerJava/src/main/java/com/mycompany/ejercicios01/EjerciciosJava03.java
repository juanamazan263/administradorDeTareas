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

public class EjerciciosJava03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaCorte1, notaCorte2, puntajeFaltante, puntajeAcomulado, notaMinima;
        System.out.println("Escriba la nota del primer corte");
        notaCorte1=scanner.nextDouble();
        System.out.println("Escriba la nota del segundo corte");
        notaCorte2=scanner.nextDouble();
        notaCorte1=notaCorte1*0.20;
        notaCorte2=notaCorte2*0.20;
        puntajeAcomulado=notaCorte1+notaCorte2;
        puntajeFaltante=3.0-puntajeAcomulado;
        notaMinima=puntajeFaltante/0.60;
        System.out.println("Su nota minima debe ser:"+notaMinima);
    }
}
