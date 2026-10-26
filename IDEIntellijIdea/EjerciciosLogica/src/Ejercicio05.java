import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, resultado, cantidadPares = 0;
        System.out.println("Ingrese un número");
        numero = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            resultado=numero*i;
            System.out.println(numero+"x"+i+"="+resultado);
            if (resultado % 2 == 0) {
                cantidadPares ++;
            }
        }
        System.out.println("De los resultados de cada multoplicacion solo "+cantidadPares+" son pares");
    }
}
