package recuperacion.funciones.funcion;

public class funciones {
  //Función referida al ejercicio 3.
  /*Función que dice cual es el numero menor de dos introducidos por teclado.
  @param n numero entero
  @param m numero entero
  @return m si es mayor que n
  @return n si es mayor que m
  */
  public static int minimo(int n, int m){
    if(n>m){
      return m;
    }
    return n;
  }

  //Funciones referidas al ejercicio 7.
  /*Funcion que calcula el area de un rectangulo.
  @param n numero entero
  @param m numero entero
  @return area= el calculo del area del rectangulo
  */
  public static double areaRectangulo(double n, double m){
    double area= n*m;
    return area;
  }
  /*Función que calcula el perimetro de un rectángulo.
  @param n numero entero 
  @param m numero entero 
  @return perimetro= el calculo del perimetro del rectangulo
  */
  public static double perimetroRectangulo(double n, double m){
    double perimetro= 2*(n+m);
    return perimetro;
  }

  //Función referidas al ejercicio 9.
  /*Función que calcula el maximo de 3 números.
  @param n numero n
  @param m numero entero 
  @param b numero entero
  @return aux= si el aux es mayor al numero b
  @return b= si el numero es mayor a aux
  */
  public static int maximo(int n, int m, int b){
    int aux;
    if (n>m){
      aux= n;
    }else {
      aux= m;
    }
    if(aux>b){
      return aux;
    }else{
      return b;
    }
  }

  //Función referida al ejercicio 11.
  /*Función que da la tabla de multiplicar de un número.
  @param n numero entero
  @return tabla= el elemento string que se ha almacenado en la variable
  */
  public static String tablaMultiplicar(int n){
    int multiplicacion= 0;
    String tabla="";
    for(int i=1; i<11; i++){
      multiplicacion= i*n;
      tabla= tabla+Integer.toString(multiplicacion)+" ";
    }
    return (tabla);
  }

  //Funciones referidas al ejercicio 15.
  /*Función que da la suma total de todos los valores de un array
   * @param int[] tamaño, el array creado en el main
   * @return suma= la suma de los valores del array
   */
  public static int sumaArray (int[] tamaño){
    int suma = 0;
    for (int i=0; i<tamaño.length; i++) {
      suma= suma+tamaño[i];
    }
    return suma;
  }

  /*Función que da la media de todos los valores de un array
   * @param int[] tamaño, el array creado en el main
   * @return media= la media de los valores del array
   */
  public static double mediaArray (int[] tamaño){
    int suma = 0;
    for (int i=0; i<tamaño.length; i++) {
      suma= suma+tamaño[i];
    }
    double media= suma/100;
    return media;
  }

  //Funciones referidas al ejercicio 21.
  /*Función que calcula la circunferencia a partir del radio.
   * @param int n numero entero
   * @return resultado= valor de la circunferencia 
   */
  public static double circunferencia (int n){
    double resultado= 2*3.14*n;
    return resultado;
  }

  /*Función que calcula la circunferencia a partir del radio.
   * @param int n numero entero
   * @return resultado= valor del area
   */
  public static double area(int n){
    double resultado= 3.14*n*n;
    return resultado;
  }

  /*Función que calcula el volumen de una esfera.
   * @param int n numero entero
   * @return resultado= volumen de esfera
   */
  public static double volumen(int n){
    double resultado=4/3*3.14*n*n*n;
    return resultado;
  }
}
