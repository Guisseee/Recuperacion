package recuperacion.poo.TareaC9_2_Ej2.Clases;

public class Gato{
  // atributos
  private String color, raza, sexo;
  private int edad;
  private double peso;

  // constructor
  public Gato(String c, String r, String s, int e, double p){
    this.color=c.toLowerCase();
    this.raza=r.toLowerCase();
    this.sexo=s.toLowerCase();
    this.edad=e;
    this.peso=p;
  }

  // métodos
  public String getSexo(){
    return this.sexo;
  }

  public String toString(int numeroGato){
    String info="Gato "+numeroGato+" -> "+this.color+" - "+this.raza+" - "+this.sexo+" - "+this.edad+" - "+this.peso;
    return info;
  }

  public String maulla(){
    String miau="Miau";
    return miau;
  }

  public String ronronea(){
    String mrrr="Mrrr";
    return mrrr;
  }

  public void comer(String comida){
    comida=comida.toLowerCase();
    if(comida.equals("pescado")){
      System.out.print("Hmmm, gracias.");
    }else{
      System.out.print("Lo siento, solo como pescado.");
    }
  }

  public void peleaCon(Gato contrincante){
    if(this.sexo.equals("hembra")){
      System.out.print("No me gusta pelear.");
    }else{
      if(contrincante.getSexo().equals("hembra")){
        System.out.print("No peleo contra gatitas.");
      }else{
        System.out.print("Ven aquí que te vas a enterar.");
      }
    }
  }
}