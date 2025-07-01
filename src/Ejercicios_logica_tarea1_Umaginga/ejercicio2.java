package Ejercicios_logica_tarea1_Umaginga;
public class ejercicio2{
    public static void main(String[] args) {
        int sueldoBase = 400;
        int horasExtra = 5;
        int pagoPorHoraExtra = 10;

        // Calcular el pago total por horas extras
        int pagoHorasExtras = horasExtra * pagoPorHoraExtra;

        // Calcular el sueldo total
        int sueldoTotal = sueldoBase + pagoHorasExtras;

        // Mostrar el resultado
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Horas extra trabajadas: " + horasExtra);
        System.out.println("Pago por horas extra: " + pagoHorasExtras);
        System.out.println("Sueldo total a recibir: " + sueldoTotal);
    }
}

