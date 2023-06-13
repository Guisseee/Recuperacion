package recuperacion.numerosAleatorios;

import java.util.Scanner;
public class Ejercicio20{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Indica la capacidad máxima de la cuba en litros: ");
    int capacidad=s.nextInt();

    int cantidadAgua=(int)(Math.random()*(capacidad+1));
    int espacioVacio=capacidad-cantidadAgua;

    //Espacio vacio de la tapa del cubo.
    for(int i=0; i<espacioVacio; i++){
      System.out.println("*    *");
    }

    //ESpacios con agua aleatorios.
    for(int i=0; i<cantidadAgua; i++){
      System.out.println("*====*");
    }

    //Suelo del cubo
    System.out.println("******");
    System.out.print("El cubo tiene una capacidad de "+capacidad+" litros y contiene "+cantidadAgua+" litros de agua.");
  }
}