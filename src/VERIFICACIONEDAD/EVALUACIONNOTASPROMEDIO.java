import java.util.Scanner;

public class EVALUACIONNOTASPROMEDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota promedio (0 a 10): ");
        double nota = scanner.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no está en el rango válido (0 a 10).");
        } else {
            if (nota >= 7) {
                System.out.println("El estudiante aprobó con nota: " + nota);
            } else {
                System.out.println("El estudiante reprobó con nota: " + nota);
            }
        }

        scanner.close();
    }
}
