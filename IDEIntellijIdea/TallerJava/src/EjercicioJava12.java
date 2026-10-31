import java.util.Scanner;
public class EjercicioJava12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadLetra, numero, cantidadNumero;
        String palabra, numeroTexto;
//        PALABRA
        System.out.println("Ingrese una palabra");
        palabra=scanner.next();
        cantidadLetra =palabra.length()-1;
        System.out.println("La ultima letra de la palabra es: "+palabra.charAt(cantidadLetra));
        for (int i = 0; i < palabra.length(); i++) {
            int caracter = i+1;
            System.out.println("La letra #"+ caracter +" es: "+palabra.charAt(i));
        }
//        NUMERO
        System.out.println("Ingrese un número");
        numero = scanner.nextInt();
        numeroTexto = String.valueOf(Math.abs(numero));
        cantidadNumero = numeroTexto.length()-1;
        System.out.println("La última cifra del número es: "+numeroTexto.charAt(cantidadNumero));
        for (int i = 0; i < numeroTexto.length(); i++) {
            int cifra = i+1;
            System.out.println("La cifra #"+ cifra +" es: "+numeroTexto.charAt(i));
        }
    }
}