package aleatorium;

import java.awt.Color;
import java.util.*;

public class OpcionEntero {
	private static Scanner tecla = new Scanner(System.in);
	
	
	  /**@return indice de la opcion entero**/
	  public static void opcAEntero() {	  
	      boolean salida = false;
	      
		  while(salida == false) {System.out.println("Elegiste la opcion a");
			 System.out.println("Elige la operacion que quieres hacer:");
			 System.out.println("a.un numero aleatorio entero ");
			 System.out.println("b.cantidad de numeros aletorios elegidos");
			 System.out.print("                      ");
			 System.out.println(">>>>atras<<<<");
			 
			 //calculos 
			 String opcion = tecla.nextLine().trim();
			 switch (opcion) {
			//opciones
			 case "a": Operaciones.opcA();System.gc();break;
			 case "b": Operaciones.opcB();System.gc();break;
			 
			//salida	 
			 case "atras": salida = true;break;
			 case "salir": salida = true;break;
			 case "volver": salida = true;break;
			 case "e": salida = true;break;
			 case "exit": salida=true;break;
			 
			 default: System.out.println("Error de ejecucion");
			 }
		  }
	  }
	  
	  
}
