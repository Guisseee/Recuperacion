package recuperacion.arrays.unidimensioneles;
/*Programa que genera 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que los almacene en un array. 
 * @author: Guillermo Jáuregui Lahoz
*/
public class Ejercicio18{
  public static void main(String[] args){
    int indice=0;
    // número de elementos
    int t=10;
    int[] valores=new int[t];

    //Números aleatorios entre 0 y 200
      for(int i=0; i<t; i++){
        valores[i]=(int)(Math.random()*201);
      }

      System.out.println("┌--------┬-----┬-----┬-----┬-----┬-----┬-----┬-----┬-----┬-----┬-----┐");
      System.out.print("| Indice ");
      for(int i=0; i<10; i++){
        System.out.print("|    "+ indice);
        indice++;
      }
      System.out.println("|");
      System.out.println("|--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----|");
      System.out.print("| Valor  ");
      for(int i=0; i<10; i++){
        System.out.print("|   "+ valores[i]);
      }
      System.out.println("|");
      System.out.println("└--------┴-----┴-----┴-----┴-----┴-----┴-----┴-----┴-----┴-----┴-----┘");
    }
}