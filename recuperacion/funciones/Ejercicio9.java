package recuperacion.funciones;

import recuperacion.funciones.funcion.funciones;
import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  System.out.print("Dame 3 números y te diré el mayor de todos.");
  System.out.print("Tus tres números son: ");
  int num1= s.nextInt();
  int num2= s.nextInt();
  int num3= s.nextInt();
  System.out.print("El numero mayor es: "+funciones.maximo(num1, num2, num3));
  }
}