import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        boolean tieneNotaBaja = false;
        double[] notas = new double[4];
        // Leer las 4 notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota del examen " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            // Acumular suma para promedio
            suma += notas[i];
            // Verificar si alguna nota es menor a 4
            if (notas[i] < 4) {
                tieneNotaBaja = true;
            }
        }
        // Calcular promedio
        double promedio = suma / 4;
        // Mostrar promedio con dos decimales
        System.out.printf("Promedio: %.2f\n", promedio);
        // Verificar si aprueba o reprueba
        if (promedio >= 7 && !tieneNotaBaja) {
            System.out.println("El estudiante ha aprobado el curso.");
        } else {
            System.out.println("El estudiante ha reprobado el curso.");
        }
        scanner.close();
    }
}
