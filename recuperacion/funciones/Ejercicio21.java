package recuperacion.funciones;

import java.util.Scanner;
import recuperacion.funciones.funcion.funciones;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Bienvenido al menú elija lo que quiere realizar");
    System.out.println("1. Circunferencia");
    System.out.println("2. Área");
    System.out.println("3. Volumen");
    System.out.println("4. Todo");
    System.out.print("Tu opción es: ");
    int opciones= s.nextInt();

    switch (opciones){
      case 1: 
        System.out.println("Introduzca el radio: ");
        int radio= s.nextInt();
        System.out.println("El valor de la circunferencia es: "+funciones.circunferencia(radio));
        break;
      
      case 2: 
        System.out.print("Introduce el radio: ");
        int radio2=s.nextInt();
        System.out.print("El valor del área es: "+funciones.area(radio2));
        break;

      case 3: 
      System.out.print("Introduce el radio: ");
        int radio3=s.nextInt();
        System.out.print("El valor del volumen es: "+funciones.volumen(radio3));
        break;
      
      case 4:
        System.out.print("Introduce el radio: ");
        int radio4=s.nextInt();
        System.out.println("El valor de la circunferencia es: "+funciones.circunferencia(radio4));
        System.out.println("El valor del área es: "+funciones.area(radio4));
        System.out.print("El valor del volumen es: "+funciones.volumen(radio4));
        break;
    }
  }
}
