package recuperacion.poo.TareaC9_1_Ej5.Clases;

public class Pizza{
  // atributos
  private String tipo;
  private String tamano;
  private String estado;
  private static int totalPedidas=0;
  private static int totalServidas=0;

  // constructor
  public Pizza(String tipo, String tamano){
    this.tipo=tipo;
    this.tamano=tamano;
    this.estado="pedida.";
    this.totalPedidas++;
  }

  // métodos
  public String getTipo(){
    return tipo;
  }

  public String getTamano(){
    return tamano;
  }

  public String getEstado(){
    return estado;
  }

  public static int getTotalPedidas(){
    return totalPedidas;
  }

  public static int getTotalServidas(){
    return totalServidas;
  }

  public void sirve(){
    if(this.estado.equals("pedida.")){
      this.estado="servida.";
      this.totalServidas++;
    }
  }

  public String toString() {
    return "Pizza "+this.tipo+" "+this.tamano+", "+this.estado;
  }
}