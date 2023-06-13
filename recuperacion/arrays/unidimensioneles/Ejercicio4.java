package recuperacion.arrays.unidimensioneles;
/*Programa que crea 3 arrays y les hace que tengan el numero y el numero al cuadrado y al cubo
 * @author: Guillermo Jáuregui Lahoz
 */
public class Ejercicio4{
  public static void main(String[] args){
    int[] numero=new int[20];
    int[] cuadrado=new int[20];
    int[] cubo=new int[20];

    // Números normales
    for(int i=0; i<20; i++){
      numero[i]=(int)(Math.random()*101);
    }

    //Números al cuadrado
    for(int i=0; i<20; i++){
      cuadrado[i]=(int)(Math.pow((numero[i]), 2));
    }

    //Números al cubo
    for(int i=0; i<20; i++){
      cubo[i]=(int)(Math.pow((numero[i]), 3));
    }

    for(int i=0; i<20; i++){
      System.out.println("|"+numero[i]+"|"+cuadrado[i]+"|"+cubo[i]+"|");
    }
  }
}