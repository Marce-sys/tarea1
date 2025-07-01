import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 15;
        int contadorNegativos = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero < 5) {
                contadorNegativos++;
            }
        }
        System.out.println("\nCantidad de números negativos ingresados...........: " + contadorNegativos);
        scanner.close();
    }
}
