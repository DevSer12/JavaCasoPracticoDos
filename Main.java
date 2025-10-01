import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 1. Ingresar notas con un for

    int[] notas = new int[5];

    for (int i = 0; i < notas.length; i++) {

      System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");

      notas[i] = sc.nextInt();

    }

    System.out.println("\nClasificación de notas:");

    //todo: mostrar la situacion de cada alumno:Desaprobado (nota menor a 13), Aprobado (nota entre 13 y 18), Sobresaliente (19 a 20)
    for (int i = 0; i <notas.length ; i++) {
      if (notas[i]<13){
        System.out.println("Alumno "+(i+1)+" : Desaprobado" );
      }else if (notas[i]<19){
        System.out.println("Alumno "+(i+1)+" : Aprobado");
      }else{
        System.out.println("Alumno "+(i+1)+" : Sobresaliente");
      }
    }

    int opcion;

    do {

      System.out.println("\n--- Menú ---");

      System.out.println("1. Ver todas las notas");

      System.out.println("2. Ver promedio");

      System.out.println("3. Ver nota más alta");

      System.out.println("4. Salir");

      System.out.print("Seleccione una opción: ");

      opcion = sc.nextInt();

      switch (opcion) {

        case 1:

          System.out.println("Notas ingresadas:");

          // todo: for de notas
          for (int i = 0; i < notas.length ; i++) {
            System.out.println("Alumno " +(i+1)+": "+notas[i]);
          }

          break;

        case 2:

          double promedio = 0;

          // todo: calcular notas
          for (double nota:notas){
            promedio+=nota/5;
          }
          System.out.println("Promedio de notas: " + promedio);

          break;

        case 3:

          int max = notas[0];

          // todo: obtener la nota maxima
          for (int nota:notas){
            if(nota>max){
              max=nota;
            }
          }
          System.out.println("La nota más alta es: " + max);

          break;

        case 4:

          System.out.println("Saliendo del programa...");

          break;

        default:

          System.out.println("Opción inválida. Intente nuevamente.");

      }

    } while (opcion != 4);

    sc.close();

  }

}