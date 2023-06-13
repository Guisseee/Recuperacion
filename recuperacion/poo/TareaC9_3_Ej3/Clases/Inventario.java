package recuperacion.poo.TareaC9_3_Ej3.Clases;

public class Inventario{
  // atributos
  private Animal[] animales;

  // constructor
  public Inventario(){
    this.animales=new Animal[0];
  }

  // métodos
  public void mostrarListaAnimales(){
    for(Animal animal:animales){
      System.out.println(animal.getTipo()+" - "+animal.getNombre());
    }
  }

  public void mostrarDatosAnimal(String nombre){
    for(Animal animal:animales){
      if(animal.getNombre().equals(nombre)){
        System.out.println(animal.toString());
        return;
      }
    }
    System.out.println("El animal con nombre "+nombre+" no existe en el inventario.");
  }

  public void mostrarTodosDatosAnimales(){
    for(Animal animal:animales){
      System.out.println(animal.toString());
    }
  }

  public void insertarAnimal(Animal animal){
    Animal[] nuevosAnimales=new Animal[animales.length+1];
    for (int i=0; i<animales.length; i++){
      nuevosAnimales[i]=animales[i];
    }
    nuevosAnimales[animales.length]=animal;
    animales=nuevosAnimales;
  }

  public void eliminarAnimal(String nombre){
    int indiceEliminar=-1;
    for(int i=0; i<animales.length; i++){
      if(animales[i].getNombre().equals(nombre)){
        indiceEliminar=i;
        break;
      }
    }
    if(indiceEliminar != -1){
      Animal[] nuevosAnimales=new Animal[animales.length-1];
      int j=0;
      for(int i=0; i<animales.length; i++){
        if(i!=indiceEliminar){
          nuevosAnimales[j]=animales[i];
          j++;
        }
      }
      animales=nuevosAnimales;
    }else{
      System.out.println("El animal con nombre "+nombre+" no existe en el inventario.");
    }
  }

  public void vaciarInventario(){
    animales=new Animal[0];
  }
}