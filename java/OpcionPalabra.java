package aleatorium;

import java.util.Scanner;

public class OpcionPalabra {
	public static void OpcPalabra() {
	  boolean salida = false;
	  while(salida == false) {
	  System.out.println("Elegiste la opcion C");
	  System.out.println("Elige la operacion que quieres hacer:");
	  System.out.println("a.un nombre aleatorio de los propuestos");
	  System.out.println("b.cantidad de nombres aleatorios elegidos");
	  System.out.println("e: para volver atras, fin para finalizar ");
	
      //calculos 
	  Scanner tecla = new Scanner(System.in);
	  String opcion = tecla.nextLine().trim();
      switch (opcion) {
	  //opcion a
	  case "a": Operaciones.opcANombre();System.out.flush();break;
	  case "b": Operaciones.opcANombres();System.out.flush();break;
	  
	  //salida	 
	  case "atras":salida = true;break;
	  case "exit":salida = true;break;
	  case "e":salida = true;break;
	  case "volver":salida = true;break;
	  case "salir":salida = true;break;
	  case "E":salida = true;break;
	  case "fin": salida = true;Programa.salidaIndice  = true;break;
	  
	  default://lo dejo por si a caso,aunque no hace falta;
      }
	 }
	}
}
