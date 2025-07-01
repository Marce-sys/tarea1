import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVisitas = 0;
        int dias = 30;
        // Pedir al usuario las visitas de cada día
        for (int i = 1; i <= dias; i++) {
            System.out.print("Ingrese el número de visitas del día " + i + ": ");
            int visitasDia = scanner.nextInt();
            totalVisitas += visitasDia;
        }
        // Calcular el promedio diario
        double promedio = (double) totalVisitas / dias;
        // Mostrar resultados
        System.out.println("\nTotal de visitas del mes: " + totalVisitas);
        System.out.printf("Promedio diario de visitas: %.2f\n", promedio);
        scanner.close();
    }
}
