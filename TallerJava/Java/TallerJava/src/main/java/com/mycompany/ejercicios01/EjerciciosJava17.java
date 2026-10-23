/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
import java.util.Scanner;
public class EjerciciosJava17 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largo, ancho, area, perimetro;
        System.out.println("Escriba el largo del rectangulo");
        largo=scanner.nextDouble();
        System.out.println("Escriba el ancho del rectangulo");
        ancho=scanner.nextDouble();
        perimetro=2*(largo+ancho);
        area=largo*ancho;
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
