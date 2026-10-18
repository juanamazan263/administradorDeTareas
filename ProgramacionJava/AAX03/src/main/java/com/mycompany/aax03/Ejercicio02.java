/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aax03;

/**
 *
 * @author jdieg
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int[] compra1 = { 2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400, 7500, 2200, 8900, 1200, 5600, 9800, 4300, 1500, 6700, 2100, 13400, 3200, 4800, 9200, 16000, 700, 2600, 8100, 5400, 3900, 11000, 600, 1700, 14500, 8800, 2300, 5100, 9400, 12000, 2900, 3600, 2000, 7800, 4100, 6500, 10200, 500, 1400, 8700, 15600, 3300, 2700, 9600, 1800, 4200, 6900, 11800, 2400, 5300, 9100, 1000, 3400, 7600, 1300, 8400, 14700, 2800, 4600, 9900, 6100, 17000, 900, 1900, 5700, 8200, 2500, 13500, 4400, 6800, 10500, 3100, 3800, 7200, 1600, 8600, 12500, 2100, 4900, 9300, 5900, 11500 };
        int suma=0, masBajo=compra1[0], masAlto=compra1[0];
        for (int i = 0; i < compra1.length; i++) {
            suma+=compra1[i];
        }
        for (int i = 1; i < compra1.length; i++) {
            if (compra1[i]<masBajo) {
                masBajo=compra1[i];
            }
            if (compra1[i]>masAlto) {
                masAlto=compra1[i];
            }    
        }
        int[] reporte = {masBajo, masAlto, suma};
        System.out.println("Valor total de la compra: $"+reporte[2]);
        System.out.println("Valor del producto mas barato: $"+reporte[0]);
        System.out.println("Valor del producto mas caro: $"+reporte[1]);
    }
}
