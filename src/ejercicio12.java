public class ejercicio12 {
    public static void main(String[] args) {
        int contadorPares = 0;
        System.out.println("Números pares del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  // Verifica si el número es par
                System.out.print(i + " ");
                contadorPares++;
            }
        }

        System.out.println("\nCantidad total de números pares encontrados: " + contadorPares);
    }
}


