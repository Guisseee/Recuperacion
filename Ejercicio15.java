package recuperacion.numerosAleatorios;
/*Programa que realiza un generador de melodía 
 * @author: Guillermo Jáuregui Lahoz
*/
public class Ejercicio15{
  public static void main(String[] args){
    //Variables
      final String[] notas={"do", "re", "mi", "fa", "sol", "la", "si"};
      int notasMelodia=((int)(Math.random()*7)+1)*4;
      String melodia="";

    //Genereacion de las notas.
      for(int i=1; i<=notasMelodia; i++){
        melodia+=notas[(int)(Math.random()*7)]+" ";
        //Poner la barrita
          if(i%4==0&&i!=notasMelodia){
            melodia+=" | ";
          }
      }
    //Poner la ultima nota como la primera
      melodia+=" "+melodia.substring(0, 2);

      System.out.println(melodia+" ||");
  }
}