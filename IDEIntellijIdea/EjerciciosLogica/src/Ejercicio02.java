import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("En este programa se van a convertir grados celsius a fahrenheit");
        System.out.println("Ingrese el valor en CELSIUS");
        celsius=scanner.nextDouble();
        fahrenheit=(celsius*1.8)+32;
        System.out.println("La conversion de "+celsius+" grados celsius");
        System.out.println("equivalen a "+fahrenheit+" grados fahrenheit");
    }
}
