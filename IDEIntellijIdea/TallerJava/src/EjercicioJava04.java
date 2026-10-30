import java.util.Scanner;
public class EjercicioJava04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;
        System.out.println("En este programa se va a calcular el area de un triangulo");
        System.out.println("Ingrese la base del tringulo");
        base=scanner.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura= scanner.nextDouble();
        area=(base*altura)/2;
        System.out.println("Area de su triangulo es: "+area);
    }
}

