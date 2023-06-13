package recuperacion.numerosAleatorios;
/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números
 * @author: Guillermo Jáuregui Lahoz
*/
public class Ejercicio5{
  public static void main(String[] args){
      System.out.print("Números enteros aleatorios entre 100 y 199: ");
      
      //Variables
      int num;
      int max=100;
      int min=199;
      int total=0;

    //Bucle de los números aleatorios.
      for(int i=1; i<=50; i++){
        num=(int)(Math.random()*100)+100;
        System.out.print(num+" ");
        //Comprobación del máximo
          if(num>max){
            max=num;
          }
        //Comprobación del mínimo
          if(num<min){
            min=num;
          }
        //Suma de todos los numeros
          total+=num;
      }
      System.out.println("El número máximo es el "+max);
      System.out.println("El número mínimo es el "+min);
      System.out.println("La suma de todos los números es: "+total);
  }
}