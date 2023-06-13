package recuperacion.poo.TareaC9_3_Ej3.Clases;

public class Gato extends Animal{
  // atributos
  private boolean esCazador;

  // constructor
  public Gato(String nombre, int edad, String tipo, boolean esCazador){
    super(nombre, edad, tipo);
    this.esCazador=esCazador;
  }

  // métodos
  public boolean getEsCazador(){
    return esCazador;
  }

  public void setEsCazador(boolean esCazador){
    this.esCazador=esCazador;
  }

  public String toString(){
    return "Gato { "+"nombre='"+this.getNombre()+'\''+", edad="+this.getEdad()+", tipo='"+this.getTipo()+'\''+", esCazador="+this.esCazador+" }";
  }
}