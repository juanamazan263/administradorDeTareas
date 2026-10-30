import java.util.Scanner;
public class EjercicioJava06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Para pasar de grados celsius a fahrenheit");
        System.out.println("Ingrese el valor en celsius");
        gradosC=scanner.nextDouble();
        gradosF=(gradosC*1.8)+32;
        System.out.println("El resultado es:"+gradosF+" grados fahrenheit");
    }
}
