package recuperacion.poo.TareaC9_3_Ej3;

import java.util.Scanner;

import recuperacion.poo.TareaC9_3_Ej3.Clases.Animal;
import recuperacion.poo.TareaC9_3_Ej3.Clases.Canario;
import recuperacion.poo.TareaC9_3_Ej3.Clases.Gato;
import recuperacion.poo.TareaC9_3_Ej3.Clases.Inventario;
import recuperacion.poo.TareaC9_3_Ej3.Clases.Loro;
import recuperacion.poo.TareaC9_3_Ej3.Clases.Perro;

public class TareaC9_3_Ej3 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    Inventario inventario=new Inventario();



    int opcion=0;

    do{
      System.out.println("\n=== MENÚ ===");
      System.out.println("1. Mostrar lista de animales");
      System.out.println("2. Mostrar datos de un animal concreto");
      System.out.println("3. Mostrar datos de todos los animales");
      System.out.println("4. Insertar animal");
      System.out.println("5. Eliminar animal");
      System.out.println("6. Vaciar inventario");
      System.out.println("7. Salir");
      System.out.print("Introduce una opción: ");
      opcion=Integer.parseInt(s.next());

      switch(opcion){
        case 1:
          inventario.mostrarListaAnimales();
        break;

        case 2:
          System.out.print("Introduce el nombre del animal: ");
          s.nextLine();
          String nombre = s.nextLine();
          inventario.mostrarDatosAnimal(nombre);
        break;

        case 3:
          inventario.mostrarTodosDatosAnimales();
        break;

        case 4:
          System.out.print("Introduce el nombre del animal: ");
          s.nextLine();
          String nombreAnimal=s.nextLine();
          System.out.print("Introduce la edad del animal: ");
          int edadAnimal=Integer.parseInt(s.next());
          System.out.print("Introduce el tipo de animal (perro/gato/loro/canario): ");
          s.nextLine();
          String tipoAnimal=s.nextLine();

            switch(tipoAnimal.toLowerCase()){
              case "perro":
                System.out.print("Introduce la raza del perro: ");
                String razaPerro=s.nextLine();
                Perro perro=new Perro(nombreAnimal, edadAnimal, tipoAnimal, razaPerro);
                inventario.insertarAnimal(perro);
                break;

              case "gato":
                System.out.print("El gato es cazador? (S/N): ");
                String respuesta=s.nextLine();
                boolean esCazador=respuesta.equalsIgnoreCase("s")?true:false;
                Gato gato=new Gato(nombreAnimal, edadAnimal, tipoAnimal, esCazador);
                inventario.insertarAnimal(gato);
              break;

              case "loro":
                System.out.print("Introduce la especie del loro: ");
                String especieLoro=s.nextLine();
                Loro loro=new Loro(nombreAnimal, edadAnimal, tipoAnimal, especieLoro);
                inventario.insertarAnimal(loro);
              break;

              case "canario":
                System.out.print("Introduce el color del canario: ");
                String colorCanario=s.nextLine();
                Canario canario=new Canario(nombreAnimal, edadAnimal, tipoAnimal, colorCanario);
                inventario.insertarAnimal(canario);
              break;

              default:
                System.out.println("Tipo de animal no válido. Introduce \"perro\", \"gato\", \"loro\" o \"canario\".");
              break;
            }
            break;

        case 5:
          System.out.print("Introduce el nombre del animal a eliminar: ");
          s.nextLine();
          String nombreEliminar=s.nextLine();
          inventario.eliminarAnimal(nombreEliminar);
        break;

        case 6:
          inventario.vaciarInventario();
        break;

        case 7:
          System.out.println("Saliendo del programa...");
        break;

        default:
          System.out.println("Opción no válida. Introduce una opción del 1 al 7.");
        break;
      }
    }while(opcion!=7);
  }
}