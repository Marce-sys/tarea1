import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSensores = 50;
        int fueraDeRango = 0;
        for (int i = 1; i <= totalSensores; i++) {
            System.out.print("Ingrese la lectura del sensor " + i + ": ");
            double lectura = scanner.nextDouble();
            // Validar si la lectura está fuera de rango
            if (lectura < 0 || lectura > 100) {
                fueraDeRango++;
            }
        }
        System.out.println("\nCantidad de sensores fuera de rango: " + fueraDeRango);
        scanner.close();
    }
}
