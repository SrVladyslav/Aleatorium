package aleatorium;
import java.util.*;

public class OpcionDouble {
         private static Scanner tecla = new Scanner(System.in);
		
		
		  /**@return indice de la opcion entero**/
		  public static void opcADouble() {	  
		      boolean salida = false;
		      
			  while(salida == false) {
			     System.out.println("Elegiste la opcion b");
				 System.out.println("Elige la operacion que quieres hacer:");
				 System.out.println("a.un numero double aleatorio");
				 System.out.println("b.cantidad de numeros aleatorios elegidos");
				 System.out.print("                      ");
				 System.out.println(">>>>atras<<<<");
				 
				 //calculos 
				 Scanner tecla = new Scanner(System.in);
				 String opcion = tecla.nextLine().trim();
				 switch (opcion) {
				 //opcion a
				 case "a": Operaciones.opcADouble();System.gc();break;
				 case "b": Operaciones.opcBDouble();System.gc();break;
				 
				//salida	 
				 case "atras": salida = true;break;
				 case "salir": salida = true;break;
				 case "volver": salida = true;break;
				 case "e": salida = true;break;
				 
				 default: System.out.println("Error de ejecucion");
				 }
			  }
		  }
}
