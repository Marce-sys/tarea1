import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        // Solicitar si presenta cédula
        System.out.print("¿Presenta cédula? (sí/no): ");
        String cedula = scanner.nextLine().trim().toLowerCase();
        // Verificar condiciones para votar
        if (edad >= 16 && cedula.equals("sí")) {
            System.out.println("Puede votar.");
        } else {
            if (edad < 16) {
                System.out.println("No puede votar porque no tiene la edad mínima requerida.");
            }
            if (!cedula.equals("no")) {
                System.out.println("puede votar");
            }
        }
        scanner.close();
    }
}
