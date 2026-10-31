import java.util.Scanner;
public class EjercicioJava08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int millas, metros;
        System.out.println("Este programa convierte millas nauticas a metros");
        System.out.println("Ingrese la cantidad de millas");
        millas=scanner.nextInt();
        metros=1852*millas;
        System.out.println(millas+" millas nauticas aquivalen a: "+metros+"m");
    }
}
