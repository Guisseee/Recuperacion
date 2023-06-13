package recuperacion.funciones;

import java.util.Scanner;
import recuperacion.funciones.funcion.funciones;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Dame 2 números y te diré cual es el menor");
    System.out.print("Los números son: ");
    int num1= s.nextInt();
    int num2= s.nextInt();
    System.out.print("El número menor es: "+funciones.minimo(num1, num2));
  }
}