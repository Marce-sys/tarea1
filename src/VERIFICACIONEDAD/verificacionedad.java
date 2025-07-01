import java.util.Scanner;

public class verificacionedad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        // Verificar si es mayor de edad
        if (edad >= 18) {
            System.out.println(nombre + ", usted es mayor de edad.");
        } else {
            System.out.println(nombre + ", usted es menor de edad.");
        }
        scanner.close();
    }
}