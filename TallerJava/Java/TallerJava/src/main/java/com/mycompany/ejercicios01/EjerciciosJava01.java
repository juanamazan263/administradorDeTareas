/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios01;

/**
 *
 * @author SENA
 */
import java.util.Scanner;
public class EjerciciosJava01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioTotal, SalarioNeto, retencion, valorHora, cantHoras;
        System.out.println("Dijite la cantidad de horas trabajadas");
        cantHoras=scanner.nextDouble();
        System.out.println("Dijite el valor de las horas");
        valorHora=scanner.nextDouble();
        salarioTotal=valorHora*cantHoras;
        retencion=salarioTotal*0.05;
        SalarioNeto=salarioTotal-retencion;
        System.out.println("El salariototal es:");
        System.out.println(salarioTotal);
        System.out.println("Retencion del 5%");
        System.out.println(retencion);
        System.out.println("Salario neto");
        System.out.println(SalarioNeto);
       
    }
}
