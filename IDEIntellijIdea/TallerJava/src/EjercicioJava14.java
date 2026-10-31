import java.util.Scanner;
public class EjercicioJava14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, horas, minutos, segundos;
        System.out.println("Ingrese una cifra de números enteros");
        valor = scanner.nextInt();
        horas = valor/3600;
        minutos=(valor%3600)/60;
        segundos=(valor%3600)%60;
        System.out.println("El valor ingresado"+horas);
    }
}
