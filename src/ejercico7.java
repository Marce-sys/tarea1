import java.util.Scanner;
public class ejercico7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario la cantidad de productos
        System.out.print("¿Cuántos productos compró? ");
        int cantidadProductos = scanner.nextInt();
        double total = 0;
        // Pedir el precio de cada producto y acumular el total
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = scanner.nextDouble();
            total += precio;
        }
        // Aplicar descuento del 15% si el total supera 150
        if (total > 150) {
            total = total * 0.85; // 15% de descuento
        }
        // Preguntar si paga con tarjeta
        scanner.nextLine(); // Consumir salto de línea
        System.out.print("¿Paga con tarjeta? (sí/no): ");
        String pagaConTarjeta = scanner.nextLine().trim().toLowerCase();
        // Si paga con tarjeta, sumar comisión del 2%
        if (pagaConTarjeta.equals("sí")) {
            total = total * 1.02; // 2% de comisión
        }
        // Mostrar el monto final con dos decimales
        System.out.printf("El monto final a pagar es: $%.2f\n", total);
        scanner.close();
    }
}
