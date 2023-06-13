package recuperacion.poo.TareaC9_3_Ej3.Clases;

public class Canario extends Animal{
  // atributos
  private String color;

  // constructor
  public Canario(String nombre, int edad, String tipo, String color){
    super(nombre, edad, tipo);
    this.color=color;
  }

  // métodos
  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color=color;
  }

  public String toString(){
    return "Canario { "+"nombre='"+this.getNombre()+'\''+", edad="+this.getEdad()+", tipo='"+this.getTipo()+'\''+", color='"+this.color+'\''+" }";
  }
}