import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, sumaTotal=0, numerosIngresados=0;
        System.out.println("En este programa va a calcular promedio y la suma total de numeros posotivos");
        System.out.println("A continuacion ingrese los numeros");
        numero=scanner.nextInt();
        while (numero >= 0 || numerosIngresados==100){
            sumaTotal=sumaTotal+numero;
            System.out.println("Ingrese otro número");
            numero=scanner.nextInt();
            numerosIngresados ++;
        }
        double promedio=sumaTotal/numerosIngresados;
        System.out.println("La suma total de los numeros es: "+sumaTotal);
        System.out.println("La cantidad de numeros ingresados fueron: "+numerosIngresados);
        System.out.println("El promedio fue de: "+promedio);
    }
}
