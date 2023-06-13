package recuperacion.arrays.bidimensionales;
/* Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas.
 * @author: Guillermo Jáuregui Lahoz 
 */
import java.util.Scanner;
public class Ejercicio2{
  public static void main(String[] args) throws InterruptedException{
    Scanner s=new Scanner(System.in);

    int numFilas=4;
    int numColumnas=5;
    int sumaFilas=0;
    int sumaColumnas=0;
    int total=0;
    
    int[][] lugar=new int[numFilas][numColumnas];

    for(int filas=0; filas<numFilas; filas++){
      for(int columnas=0; columnas<numColumnas; columnas++){
        System.out.print("Introduce un número: ");
          lugar[filas][columnas]=s.nextInt();
      }
    }

        for(int filas=0; filas<numFilas; filas++){
          for(int columnas=0; columnas<numColumnas; columnas++){
            sumaFilas= sumaFilas+lugar[filas][columnas];
            System.out.print("|      "+ lugar[filas][columnas]);
          }
          total= total+sumaFilas;
          System.out.println("|Total: "+sumaFilas+" |");
          sumaFilas=0;
          total=0;
        }


        for(int columnas=0; columnas<numColumnas; columnas++){
          sumaColumnas=0;
          for(int filas=0; filas<numFilas; filas++){
            sumaColumnas= sumaColumnas+lugar[columnas][filas];
          }
          System.out.print("|Total:"+ sumaColumnas);
        }

        System.out.print("|     |"+ total);
  }
}