import java.util.Scanner;
public class EjercicioJava10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorArticulo;
        double iva, subTotal;
        System.out.println("Indique el valor del articulo");
        valorArticulo=scanner.nextInt();
        subTotal=valorArticulo/1.19;
        iva=valorArticulo-subTotal;
        System.out.println("El subtotal del articulo es :"+subTotal);
        System.out.println("El IVA pagado por el articulo es :"+iva);
    }
}
