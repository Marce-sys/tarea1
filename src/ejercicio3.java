import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables para almacenar los precios
        double precio1, precio2, precio3;
        // Pedir al usuario los precios de los 3 productos
        System.out.print("Ingrese el precio del producto 1: ");
        precio1 = scanner.nextDouble();
        System.out.print("Ingrese el precio del producto 2: ");
        precio2 = scanner.nextDouble();
        System.out.print("Ingrese el precio del producto 3: ");
        precio3 = scanner.nextDouble();
        // Calcular el total de la compra
        double total = precio1 + precio2 + precio3;
        // Aplicar descuento del 10% si el total supera 100
        if (total > 100) {
            total = total * 0.90; // descuento del 10%
        }
        // Mostrar el total a pagar
        System.out.printf("El total a pagar es: %.2f\n", total);
        scanner.close();
    }
}
