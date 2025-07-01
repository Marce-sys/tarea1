import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[10];
        int contadorMayores = 0;
        int edadMaxima = Integer.MIN_VALUE;
        int edadMinima = Integer.MAX_VALUE;
        // Ingresar edades
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            // Contar mayores de edad
            if (edades[i] >= 18) {
                contadorMayores++;
            }
            // Actualizar edad máxima
            if (edades[i] > edadMaxima) {
                edadMaxima = edades[i];
            }
            // Actualizar edad mínima
            if (edades[i] < edadMinima) {
                edadMinima = edades[i];
            }
        }
        // Mostrar listado de edades
        System.out.println("\nListado de edades ingresadas:");
        for (int edad : edades) {
            System.out.println(edad);
        }
        // Mostrar resultados
        System.out.println("\nCantidad de personas mayores de edad (18+): " + contadorMayores);
        System.out.println("Edad más alta: " + edadMaxima);
        System.out.println("Edad más baja: " + edadMinima);
        scanner.close();
    }
}
