public class ejercicio5 {
    public static void main(String[] args) {
        int suma = 0;

        // Imprimir números del 1 al 10 y acumular la suma
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma += i;
        }

        // Mostrar la suma total
        System.out.println("La suma total es: " + suma);
    }
}
