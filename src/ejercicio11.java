import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese el número para la tabla
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        // Ciclo for para imprimir la tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
