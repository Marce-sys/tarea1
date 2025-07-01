import java.util.Scanner;
public class RegistroEmpleados {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //solicitar nombre completo
        System.out.print("ingresa el nombre completo");
        String nombrecompleto = scanner.nextLine();

        // Solicitar sueldo mensual
        System.out.print("ingrese el sueldo mensual:");
        double sueldomensual = scanner.nextDouble();

        //solicitar el numero de cargas familiares
        System.out.print("ingrese el numero de cargas familiares:");
        int cargasfamiliares = scanner.nextInt();
        scanner.nextLine(); //limpiar el buffer

        //solicitar departamento
        System.out.print("ingrese el departamento en el que trabaja:");
        String departamento = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("\n--- Registro de Empleado ---");
        System.out.println("Nombre completo: " + nombrecompleto);
        System.out.println("Sueldo mensual: " + sueldomensual);
        System.out.println("Número de cargas familiares: " + cargasfamiliares);
        System.out.println("Departamento: " + departamento);

        scanner.close();

    }


}
