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
public class EjerciciosJava10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Definicion de variables
        int valorArticulo;
        double iva, subTotal;
        //Entradas
        System.out.println("Indique el valor del articulo");
        valorArticulo=scanner.nextInt();
        //Procesos
        subTotal=valorArticulo/1.19;
        iva=valorArticulo-subTotal;
        //Salidas
        System.out.println("El subtotal del articulo es :"+subTotal);
        System.out.println("El IVA pagado por el articulo es :"+iva);
    }
}
