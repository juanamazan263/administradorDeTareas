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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorArticulo;
        double iva, subTotal;
        System.out.println("Indique el valor del articulo");
        valorArticulo=scanner.nextInt();
        subTotal=valorArticulo/1.19;
        iva=valorArticulo-subTotal;
        System.out.println("El subtotal del articulo es :"+subTotal);
        System.out.println("El IVA pagado por el articulo es :"+iva);
    }
}
