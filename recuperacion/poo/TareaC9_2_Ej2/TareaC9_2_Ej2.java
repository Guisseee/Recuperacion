package recuperacion.poo.TareaC9_2_Ej2;

import recuperacion.poo.TareaC9_2_Ej2.Clases.Gato;

public class TareaC9_2_Ej2{
  public static void main(String[] args){
    Gato[] gatos=new Gato[4];
    gatos[0]=new Gato("marrón", "persa", "hembra", 7, 2.5);
    gatos[1]=new Gato("blanco", "bengalí", "macho", 3, 1.67);
    gatos[2]=new Gato("negro", "korat", "macho", 8, 5);
    gatos[3]=new Gato("gris", "birmano", "hembra", 11, 5.4);

    for(int i=0; i<4; i++){
      System.out.println(gatos[i].toString(i+1));
    }
  }
}