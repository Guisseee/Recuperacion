package recuperacion.poo.TareaC9_1_Ej11.Clases;

public class TarjetaRegalo{
  // atributos
  private double saldo;
  private String digitos;

  // constructor
  public TarjetaRegalo(double s){
    this.saldo=s;
    this.digitos="";
    for(int i=0; i<5; i++){
      this.digitos+=(int)(Math.random()*10);
    }
  }

  // métodos
  public String getDigitos(){
    return digitos;
  }

  public void gasta(double g){
    if(g>this.saldo){
      System.out.println("No tienes suficiente saldo para gastar "+String.format("%.2f", g)+" euros");
    }else{
      this.saldo-=g;
    }
  }

  public double getSaldo(){
    return saldo;
  }

  public String toString(){
    return "Tarjeta nº "+getDigitos()+" - Saldo "+String.format("%.2f", getSaldo())+" euros";// el "String.format()" me permite mostrar el saldo con 2 decimales
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t){
    double nuevoSaldo=this.saldo+t.getSaldo();
    this.saldo=0;
    t.saldo=0;
    return new TarjetaRegalo(nuevoSaldo);
  }
}