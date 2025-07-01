import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Pedir al usuario que ingrese 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;  // Acumular la suma
        }

        // Mostrar el resultado de la suma total
        System.out.println("La suma total de los números ingresados es: " + suma);

        scanner.close();
    }
}
