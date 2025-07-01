package Ejercicios_logica_tarea1_Umaginga;
import java.util.Scanner;
public class ejercicio01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calificación inicial
        int calificacion = 14;
        // Pedimos al usuario el porcentaje de asistencia
        System.out.print("Ingrese el porcentaje de asistencia (0-100): ");
        double asistencia = scanner.nextDouble();
        // Verificamos si la asistencia supera el 80%
        if (asistencia > 80) {
            calificacion += 2; // Sumamos 2 puntos
        }
        // Mostramos la calificación final
        System.out.println("Calificación final: " + calificacion);
        // Verificamos si aprueba o no
        if (calificacion >= 16) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }

        scanner.close();
    }
}


