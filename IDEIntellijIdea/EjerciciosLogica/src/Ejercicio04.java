import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, suma1, suma2, resultadoSuma, resta1, resta2, resultadoResta, multiplicacion1, multiplicacion2, resultadoMultiplicacion;
        int division1, division2, resultadoDivision;
        System.out.println("Usted deberá elegir una de las sigueintes opciones:");
        System.out.println("#1. SUMA");
        System.out.println("#2. RESTA");
        System.out.println("#3. MULTIPLICACION");
        System.out.println("#4. DIVISION");
        opcion=scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Usted eligió >SUMA<");
                System.out.println("Ingrese el primer número");
                suma1=scanner.nextInt();
                System.out.println("Ingrese el segundo número");
                suma2=scanner.nextInt();
                resultadoSuma=suma1+suma2;
                System.out.println("La suma de los dos números ingresados es: "+resultadoSuma);
                break;
            case 2:
                System.out.println("Usted eligió >RESTA<");
                System.out.println("Ingrese el primer número");
                resta1=scanner.nextInt();
                System.out.println("Ingrese el segundo número");
                resta2=scanner.nextInt();
                resultadoResta=resta1-resta2;
                System.out.println("La resta de los dos números ingresados es: "+resultadoResta);
                break;
            case 3:
                System.out.println("Usted eligió >MULTIPLICACION<");
                System.out.println("Ingrese el primer número");
                multiplicacion1=scanner.nextInt();
                System.out.println("Ingrese el segundo número");
                multiplicacion2=scanner.nextInt();
                resultadoMultiplicacion=multiplicacion1*multiplicacion2;
                System.out.println("El resultado de la multiplicasion es: "+resultadoMultiplicacion);
                break;
            case 4:
                System.out.println("Usted eligió >DIVISION<");
                System.out.println("Ingrese el primer número");
                division1=scanner.nextInt();
                System.out.println("Ingrese el segundo número");
                division2=scanner.nextInt();
                if (division1 == 0 || division2 == 0){
                    System.out.println("Cuidado! no puedes dividir por 0");
                }else {
                    resultadoDivision=division1/division2;
                    System.out.println("El resultado de la division es: "+resultadoDivision);
                }
                break;
            default:
                System.out.println("La opción no es valida");
        }
    }
}
