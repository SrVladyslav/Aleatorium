package aleatorium;

import java.util.Scanner;

public class Programa {
	//variables de clase
	
	
	
	public static boolean salidaIndice = false;
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a ALEATORIUM");
		System.out.println("=======================");
		
		/**BUCLE PRINCIPAL DEL PROGRAMA**/
		while(salidaIndice == false) {
			
			  Scanner tecla = new Scanner(System.in);
			  
			  System.out.println("Indica que tipo de valor aleatorio quieres obtener: ");
			  System.out.println("a.Entero");
			  System.out.println("b.Double");
			  System.out.println("c.Palabra");
			  System.out.println("e.Salir");
			  //tecla.nextLine();
			  String tipo = tecla.nextLine().trim();
			  tipo = tipo.trim();
			  switch(tipo) {
			    //opcion a
			    case "a":      OpcionEntero.opcAEntero();break;
			    case "Entero": OpcionEntero.opcAEntero();break;
			    case "entero": OpcionEntero.opcAEntero();break;
			    //opcion b
			    case "b":      OpcionDouble.opcADouble(); ;break;
			    case "Double": OpcionDouble.opcADouble();break;
			    case "double": OpcionDouble.opcADouble();break;
			    //opcion c
			    case "c":       OpcionPalabra.OpcPalabra();break;
			    case "Palabra": OpcionPalabra.OpcPalabra();break;
			    case "palabra": OpcionPalabra.OpcPalabra();break;
			    
			    //salida
			    case "Exit":    salidaIndice = true;break;
			    case "exit":    salidaIndice = true;break;
			    case "e":       salidaIndice = true;break;
			    case "salir":   salidaIndice = true;break;
			    case "cerrar":  salidaIndice = true;break;
			    
			    
			    default: System.out.println("");
			  }
		   
			
			
			
		}
		System.out.println("Fin del programa");
		
	}

}
