import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero positivo o negativo");
        numero=scanner.nextInt();
        if (numero != 0){
            if (numero % 2 == 0){
                System.out.println("El número ingresado es par");
            }else {
                System.out.println("el número ingresado es impar");
            }
        }
        if (numero > 0){
            System.out.println("El número ingresado es positivo");
        }
        if (numero < 0){
            System.out.println("El número ingresado es negativo");
        }
        if (numero == 0){
            System.out.println("El número ingresado es 0");
        }
    }
}
