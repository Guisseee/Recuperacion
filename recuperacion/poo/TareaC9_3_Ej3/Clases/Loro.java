package recuperacion.poo.TareaC9_3_Ej3.Clases;

public class Loro extends Animal{
  // atributos
  private String especie;

  // constructor
  public Loro(String nombre, int edad, String tipo, String especie){
    super(nombre, edad, tipo);
    this.especie=especie;
  }

  // métodos
  public String getEspecie(){
    return especie;
  }

  public void setEspecie(String especie){
    this.especie=especie;
  }

  public String toString(){
    return "Loro { "+"nombre='"+this.getNombre()+'\''+", edad="+this.getEdad()+", tipo='"+this.getTipo()+'\''+", especie='"+this.especie+'\''+" }";
  }
}
