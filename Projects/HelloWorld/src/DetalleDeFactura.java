import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura");
        String invoice = scanner.nextLine();

        System.out.println("Ingresa el precio uno");
        Double priceOne = scanner.nextDouble();

        System.out.println("Ingresa el precio dos");
        Double priceTwo = scanner.nextDouble();

        Double total = priceOne + priceTwo;

        Float tax = total.floatValue() * 0.19f;

        System.out.println("El total es: ".concat(String.valueOf(total + tax)));
    }
}
