import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el puntaje del participante
        System.out.print("Ingrese el puntaje del participante: ");
        int puntaje = scanner.nextInt();

        // Verificar si gana medalla o queda como finalista
        if (puntaje >= 80) {
            System.out.println("El participante ha ganado medalla.");
        } else {
            System.out.println("El participante queda como finalista.");
        }

        scanner.close();
    }
}

