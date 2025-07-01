//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("OPERACIONES");
        String nombre="MARCELA";
        int edad=29;
        double estatura=1.65;
        Scanner input = new
        Scanner(System.in);
        System.out.print("Ingrese el primer valor numerico: ");
        int valor1 = input.nextInt();
        System.out.print("Ingrese el segundo valor numerico: ");
        int valor2 = input.nextInt();
        System.out.print("ingrese el tercer valor numerico: ");
        int valor3 = input.nextInt();
        System.out.print("ingrese el cuarto valor numerico: ");
        int valor4 = input.nextInt();
        int suma= valor1 + valor2;
        int resta= valor3 - valor4;
        int multiplicacion= valor1 * valor3;
        System.out.println("El resultado de la suma es = " + suma);
        System.out.println("El resultado de la restaes = " + resta);
        System.out.println("El resultado de la multiplicacion = " + multiplicacion);


    }
    }