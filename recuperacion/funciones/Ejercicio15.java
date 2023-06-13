package recuperacion.funciones;

import recuperacion.funciones.funcion.funciones;

public class Ejercicio15 {
    public static void main(String[] args) {
      
      int[] tamaño = new int[100];
      
      System.out.println("Suma total: " + funciones.sumaArray(tamaño));
      System.out.println("Media: " + funciones.mediaArray(tamaño));
  }
}