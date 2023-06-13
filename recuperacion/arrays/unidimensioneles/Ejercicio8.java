package recuperacion.arrays.unidimensioneles;
/*Programa pide la temperatura media que hahechoencadames de un determinado año y que muestre a continuación un diagrama de barras
 * @author: Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String[] mes={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    int numeroBarras=12;
    int[] temperatura=new int[numeroBarras];
    char barras='_';

    //Temperatura de los numeroBarras
    for(int i=0; i<numeroBarras; i++){
      System.out.print("Introduce la temperatura del mes de "+mes[i]+": ");
        temperatura[i]=s.nextInt();
    }

    // Escritura de las barras.
    for(int i=0; i<numeroBarras; i++){
      System.out.println(mes[i]+" grados: "+temperatura[i]+"º");
      for(int j=0; j<temperatura[i]; j++){
        System.out.print(barras);
        System.out.println(" ");
      }
    }
  }
}
