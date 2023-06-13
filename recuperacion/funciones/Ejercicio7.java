package recuperacion.funciones;

import java.util.Scanner;
import recuperacion.funciones.funcion.funciones;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Dame el ancho del rectangulo: ");
    double ancho= s.nextDouble();
    System.out.print("Dame el alto del rectangulo: ");
    double alto= s.nextDouble();
    System.out.println("El área del rectangulo es: "+funciones.areaRectangulo(ancho, alto));
    System.out.print("El perímetro del rectangulo es: "+funciones.perimetroRectangulo(ancho, alto));
  }
}