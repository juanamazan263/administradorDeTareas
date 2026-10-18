/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aax03;

/**
 *
 * @author jdieg
 */
//import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        double[] listaNotas = { 4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0, 2.7, 3.5, 4.0, 2.1, 1.9, 4.6, 3.8, 2.9, 0.5, 1.2, 3.3, 4.9, 2.4, 3.1, 1.0, 4.2, 3.6, 2.8, 0.7, 1.6, 2.0, 3.7, 4.4, 1.3, 0.8, 2.6, 3.9, 4.7, 1.1, 2.2, 3.4, 4.5, 0.6, 1.7, 2.5, 3.2, 4.3, 1.9, 0.4, 2.8, 3.6, 4.0, 1.4, 0.9, 2.1, 3.8, 4.6, 1.6, 0.3, 2.9 };
        double promedio, suma=0, masBajo=listaNotas[0], masAlto=listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            suma+=listaNotas[i];
        }
        for (int i = 1; i < listaNotas.length; i++) {
            if (listaNotas[i]<masBajo) {
                masBajo=listaNotas[i];
            }
            if (listaNotas[i]>masAlto) {
                masAlto=listaNotas[i];
            }    
        }
        promedio=suma/listaNotas.length;
        double[] resultadoNotas = {promedio, masAlto, masBajo};
        System.out.println("La nota mas baja de la clase es: "+resultadoNotas[2]);
        System.out.println("La nota mas alta de la clase es: "+resultadoNotas[1]);
        System.out.println("la nota promedio de la clase es: "+resultadoNotas[0]);
    }
}
