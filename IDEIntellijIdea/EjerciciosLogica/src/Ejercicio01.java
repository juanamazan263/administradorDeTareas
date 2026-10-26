import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        VARIABLES
        double lado1, lado2, lado3, base, altura, area, perimetro;
//        SALIDAS
        System.out.println("En este programa se van a calcular el area y el perimetro de un triangulo ");
        System.out.println("Para calcular el perimetro usted debera ingresar la medida de sus 3 lados");
//        ENTRADAS
        System.out.println("Ingrese el lado 1");
        lado1=scanner.nextDouble();
        System.out.println("Ingrese el lado 2");
        lado2=scanner.nextDouble();
        System.out.println("Ingrese el lado 3");
        lado3=scanner.nextDouble();
//        PROCESOS
        perimetro=lado1+lado2+lado3;
//        SALIDAS
        System.out.println("El perimetro de su triangulo es: "+perimetro);
        System.out.println("Para calcular el Area debera indicar la base y la altura del triangulo");
//        ENTRADAS
        System.out.println("Indique la base");
        base=scanner.nextDouble();
        System.out.println("Ahora indique la altura");
        altura=scanner.nextDouble();
//        PROCESOS
        area=(base*altura)/2;
//        SALIDAS
        System.out.println("El area de su triangulo es: "+area);
    }
}