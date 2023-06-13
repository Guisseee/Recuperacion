package recuperacion.poo.TareaC9_1_Ej5;

import recuperacion.poo.TareaC9_1_Ej5.Clases.Pizza;

public class TareaC9_1_Ej5 {
  public static void main(String[] args){
    Pizza pizza1=new Pizza("margarita", "mediana");
    Pizza pizza2=new Pizza("funghi", "familiar");
    pizza2.sirve();
    Pizza pizza3=new Pizza("cuatro quesos", "mediana");

    System.out.println(pizza1);
    System.out.println(pizza2);
    System.out.println("¡La pizza "+pizza2.getTipo()+" "+pizza2.getTamano()+" ha sido servida!");
    System.out.println(pizza3);

    pizza2.sirve();

    System.out.println("\nPedidas: "+Pizza.getTotalPedidas());
    System.out.print("Servidas: "+Pizza.getTotalServidas());
  }
}