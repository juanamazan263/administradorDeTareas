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
public class EjerciciosJava09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTarifa, valorPagado, descuento, porcentaje;
        System.out.println("Indique el valor de la tarifa");
        valorTarifa=scanner.nextDouble();
        System.out.println("Indique el valor pagado");
        valorPagado=scanner.nextDouble();
        descuento=valorTarifa-valorPagado;
        porcentaje=(descuento/valorTarifa)*100;
        System.out.println("El descuento aplicado a su compra fue de: "+porcentaje+"%");      
    }
}
