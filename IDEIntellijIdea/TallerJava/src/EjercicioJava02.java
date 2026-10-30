import java.util.Scanner;
public class EjercicioJava02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salario, horas;
        double valorHora;
        System.out.printf("Ingrese el salario total pagado");
        salario=scanner.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horas=scanner.nextInt();
        valorHora=salario/horas;
        System.out.println("El valor de cada hora trabajada es: "+valorHora);
    }
}