package recuperacion.poo.TareaC9_3_Ej3.Clases;

public abstract class Animal{
  // atributos
  private String nombre;
  private int edad;
  private String tipo;

  // constructor
  public Animal(String nombre, int edad, String tipo){
    this.nombre=nombre;
    this.edad=edad;
    this.tipo=tipo;
  }

  // métodos
  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public int getEdad(){
    return edad;
  }

  public void setEdad(int edad){
    this.edad=edad;
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo=tipo;
  }

  public String toString(){
    return "Animal [nombre="+nombre+", tipo="+tipo+", edad="+edad+"]";
  }
}