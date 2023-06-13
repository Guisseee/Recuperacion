package recuperacion.poo.TareaC9_3_Ej3.Clases;

public class Perro extends Animal{
  // atributos
  private String raza;

  // constructor
  public Perro(String nombre, int edad, String tipo, String raza){
    super(nombre, edad, tipo);
    this.raza=raza;
  }

  // métodos
  public String getRaza(){
    return raza;
  }

  public void setRaza(String raza){
    this.raza=raza;
  }

  public String toString(){
    return "Perro { "+"nombre='"+this.getNombre()+'\''+", edad="+this.getEdad()+", tipo='"+this.getTipo()+'\''+", raza='"+this.raza +'\''+" }";
  }
}