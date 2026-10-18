/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aax03;

/**
 *
 * @author jdieg
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int[] resultados = {18, 29, 22, 25, 16, 26, 21, 23, 20, 27, 24, 19, 28, 17, 30, 22, 25, 21, 18, 26, 23, 20, 29, 17, 27, 24, 19, 28, 22, 25, 21, 17, 18, 26, 23, 20, 29, 24, 19, 27, 22, 25, 18, 28, 21, 17, 23, 20, 26, 24, 19, 27, 22, 25, 17, 28, 21, 18, 29, 23, 20, 26, 24, 19, 22, 25, 17, 27, 21, 18, 29, 23, 20, 26, 24, 19, 28, 22, 25, 17, 21, 18, 27, 23, 20, 29, 24, 19, 26, 22, 25, 17, 28, 21, 18, 23, 20, 27, 24, 19, 29, 22, 25, 17, 28, 21 };
        int masBajo=resultados[0], masAlto=resultados[0], cantidadCompetidores=resultados.length;
        for (int i = 1; i < resultados.length; i++) {
            if (resultados[i]<masBajo) {
                masBajo=resultados[i];
            }
            if (resultados[i]>masAlto) {
                masAlto=resultados[i];
            }
        }
        int[] reporte = {masBajo, masAlto, cantidadCompetidores};
        System.out.println("Cantidad de competidores: "+reporte[2]);
        System.out.println("Tiempo mas bajo: "+reporte[0]);
        System.out.println("Tiempo mas bajo: "+reporte[1]);
    }
}
