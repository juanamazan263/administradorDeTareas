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
public class EjerciciosJava15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorUnitario, cantidad, valorTotal;
        System.out.println("Indique el valor unitario del articulo");
        valorUnitario=scanner.nextInt();
        System.out.println("Indique la cantidad de articulos");
        cantidad=scanner.nextInt();
        valorTotal=valorUnitario*cantidad;
        System.out.println("El valor total a pagar es de :"+valorTotal);
    }
}
