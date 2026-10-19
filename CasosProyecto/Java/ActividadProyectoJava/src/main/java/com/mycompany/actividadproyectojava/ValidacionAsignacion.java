/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadproyectojava;

/**
 *
 * @author jdieg
 */
import java.util.Scanner;
public class ValidacionAsignacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joseMartinezPqt=38, juanAmazanPqt=40, juanEspinozaPqt=40, sergioSalgadoPqt=25;
        int contador=0, codigo, conductor;
        String joseMartinezStt, juanAmazanStt, juanEspinozaStt, sergioSalgadoStt, salir="no";
        do {
            System.out.println("conductores disponibles");
            //Conductor#1
            System.out.println("1. Jose Martinez");
            System.out.println("Paquetes asignados: "+joseMartinezPqt);
            if (joseMartinezPqt>=40) {
                joseMartinezStt="NoDisponible";
            } else {
                joseMartinezStt="Disponible";
            }
            System.out.println("Estado: "+joseMartinezStt);
            System.out.println("=========================");
            //Conductor#2
            System.out.println("2. Juan Amazan");
            System.out.println("Paquetes asignados: "+juanAmazanPqt);
            if (juanAmazanPqt>=40) {
                juanAmazanStt="NoDisponible";
            } else {
                juanAmazanStt="Disponible";
            }
            System.out.println("Estado: "+juanAmazanStt);
            System.out.println("=========================");
            //Conductor#3
            System.out.println("3. Juan Espinoza");
            System.out.println("Paquetes asignados: "+juanEspinozaPqt);
            if (juanEspinozaPqt>=40) {
                juanEspinozaStt="NoDisponible";
            } else {
                juanEspinozaStt="Disponible";
            }
            System.out.println("Estado: "+juanEspinozaStt);
            System.out.println("=========================");
            //Conductor#4
            System.out.println("4. Sergio Salgado");
            System.out.println("Paquetes asignados: "+sergioSalgadoPqt);
            if (sergioSalgadoPqt>=40) {
                sergioSalgadoStt="NoDisponible";
            } else {
                sergioSalgadoStt="Disponible";
            }
            System.out.println("Estado: "+sergioSalgadoStt);
            System.out.println("=========================");
            //Eleccion de conductor
            System.out.println("Seleccione al conductor para asignar el pedido");
            System.out.println(">>>Limite de paquetes:(40)<<<");
            conductor=scanner.nextInt();
            //Inicia el comando segun
            switch (conductor) {
                case 1 -> {
                    System.out.println("Conductor Jose Martinez");
                    if (joseMartinezStt.equals("NoDisponible")) {
                        contador+=1;
                        System.out.println("Conductor no disponible");
                    } else {
                        System.out.println("Estado"+joseMartinezStt);
                        joseMartinezPqt+=1;
                        System.out.println("Dijite el codigo del pedido");
                        codigo=scanner.nextInt();
                        System.out.println("El pedido fue asignado con exito");
                    }
                }
                case 2 -> {
                    System.out.println("Conductor Juan Amazan");
                    if (juanAmazanStt.equals("NoDisponible")) {
                        contador+=1;
                        System.out.println("Conductor no disponible");
                    } else {
                        System.out.println("Estado"+juanAmazanStt);
                        juanAmazanPqt+=1;
                        System.out.println("Dijite el codigo del pedido");
                        codigo=scanner.nextInt();
                        System.out.println("El pedido fue asignado con exito");
                    }
                }
                case 3 -> {
                    System.out.println("Conductor Juan Espinoza");
                    if (juanEspinozaStt.equals("NoDisponible")) {
                        contador+=1;
                        System.out.println("Conductor no disponible");
                    } else {
                        System.out.println("Estado"+juanEspinozaStt);
                        juanEspinozaPqt+=1;
                        System.out.println("Dijite el codigo del pedido");
                        codigo=scanner.nextInt();
                        System.out.println("El pedido fue asignado con exito");
                    }
                }
                case 4 -> {
                    System.out.println("Conductor Sergio Salgado");
                    if (sergioSalgadoStt.equals("NoDisponible")) {
                        contador+=1;
                        System.out.println("Conductor no disponible");
                    } else {
                        System.out.println("Estado"+sergioSalgadoStt);
                        sergioSalgadoPqt+=1;
                        System.out.println("Dijite el codigo del pedido");
                        codigo=scanner.nextInt();
                        System.out.println("El pedido fue asignado con exito");
                    }
                }
                default -> {
                    contador+=1;
                    System.out.println("La opcion no es valida");
                    System.out.println("Vuelva a untentar");
                }
            }
            if (contador<2) {
                System.out.println("Desea asignar otro pedido (Si/No)");
                salir=scanner.nextLine();
                scanner.nextLine();
            }
        } while (!salir.trim().equalsIgnoreCase("no") && contador<2);
        if (contador==2) {
            System.out.println("Ha superado el limite de intentos");
        }
    }
}
