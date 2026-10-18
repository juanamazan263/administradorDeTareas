/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadproyectojava;

/**
 *
 * @author jdieg
 */
import java.util.Scanner;
public class RegistroPedidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreDestinatario, nombreRemitente, correcto, numeroDestinatario, numeroRemitente, direccion, validar="no", lugar;
        int unidades=0;
        int contador=0;
        System.out.println("Regritre su pedido a continuacion");
        System.out.println("Ingrese los datos del remitente");
        System.out.println("Nombre");
        nombreRemitente=scanner.nextLine();
        System.out.println("Numero de telefono");
        numeroRemitente=scanner.nextLine();
        System.out.println("Ingrese los siguientes datos para la entrega");
        do {
            System.out.println("Nombre del establecimiento");
            lugar=scanner.nextLine();
            System.out.println("Nombre del destinatario");
            nombreDestinatario=scanner.nextLine();
            System.out.println("Numero de telefono");
            numeroDestinatario=scanner.nextLine();
            System.out.println("Direccion de entrega");
            direccion=scanner.nextLine();
            System.out.println("Cuantas unidades va a registrar?");
            unidades=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Los datos ingresados para el pedido son:");
            System.out.println("Estableciomiento: "+lugar);
            System.out.println("Nombre: "+nombreDestinatario);
            System.out.println("Contacto: "+numeroDestinatario);
            System.out.println("Doreccion: "+direccion);
            System.out.println("Cantidad: "+unidades+" unidades");
            System.out.println("Indique ni los datos son correctos[si/no]");
            correcto=scanner.nextLine();
            if (correcto.trim().equalsIgnoreCase("no")){
                contador=contador+1;
                System.out.println("Ingrese nuevamente los datos para la entrega");
                System.out.println(contador);
            } else {
                System.out.println("Su pedido ha sido registrado con exito!");
            }  
        } while (correcto.trim().equalsIgnoreCase(validar) && contador < 2);        
        if (contador == 2) {
            System.out.println("Ha alcanzado el limite de intentos permitidos");
            System.out.println("Vuelva a intentarlo mas tarde");
        }
        scanner.close();
    }
}