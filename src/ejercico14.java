import java.util.Scanner;
public class ejercico14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[6];
        double suma = 0;
        // Ingresar calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }
        // Mostrar calificaciones ingresadas
        System.out.println("\nCalificaciones ingresadas:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }
        // Calcular promedio
        double promedio = suma / calificaciones.length;
        // Mostrar promedio con dos decimales
        System.out.printf("\nPromedio del grupo: %.2f\n", promedio);
        // Determinar si el grupo aprobó o no
        if (promedio >= 7) {
            System.out.println("El grupo en general aprobó.");
        } else {
            System.out.println("El grupo en general no aprobó.");
        }
        scanner.close();
    }
}