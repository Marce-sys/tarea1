import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usuario y contraseña correctos (puedes cambiar estos valores)
        String usuarioCorrecto = "MARCELA";
        String contraseñaCorrecta = "ARLEQUIN";
        // Solicitar usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();
        // Solicitar contraseña
        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = scanner.nextLine();
        // Verificar credenciales
        if (usuarioIngresado.equals(usuarioCorrecto) && contraseñaIngresada.equals(contraseñaCorrecta)) {
            System.out.println("¡Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("La información ingresada no es CORRECTA.");
        }
        scanner.close();
    }
}
