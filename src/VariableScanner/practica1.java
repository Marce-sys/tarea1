package VariableScanner;
import java.util.Scanner;
public class practica1 {
    public static void main(String[]args){
        Scanner registro= new Scanner(System.in);
    System.out.println("producto");
     String producto= registro.nextLine();

     System.out.println("ingrese el precio");
      Double precio= registro.nextDouble();

//uso del if
        if (precio==0) { System.out.println("ingrese un valor valido");

        }
    }
}