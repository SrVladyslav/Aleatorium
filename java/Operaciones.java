package aleatorium;

import java.util.*;

public class Operaciones {
       private static Scanner tecla = new Scanner(System.in);
	  /**@param limite1 limite2
	    * @return numero aleatorio integer entre los limites**/
	   public static void opcA() {
		 boolean salida = false;
		  while(salida == false) {
		   System.out.println("Introduce los limtes entre los que quieres obtener el numero aleatorio separado por comas: ");
		   String entrada = tecla.nextLine();
		   int coma = entrada.indexOf(",");
		     if(coma != -1) {
		      String limites[] = entrada.split(",");
		      int lim1 = Integer.parseInt(limites[0]);
		      int lim2 = Integer.parseInt(limites[1]);
		      System.out.println("El numero aleatorio es: " + Operaciones.randomInt(lim1, lim2)); 
		      System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
		      salida = true;
		     }
		   }
		  System.gc();
		  //TODO completar
	   }
	   /**@param limite1 limite2 
	    * @return numero aleatorio double entre los limites**/
	   
	   public static void opcADouble() {
		   System.out.println("Introduce los limtes entre los que quieres obtener el numero aleatorio separado por comas: ");
		   String limites[] = tecla.nextLine().split(",");
		   double lim1 = Double.parseDouble(limites[0]);
		   double lim2 = Double.parseDouble(limites[1]);
		   
		   System.out.println("El numero aleatorio es: " + Operaciones.randomDouble(lim1, lim2));
		   System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
	       
	   }
	   /**@param limite1 limite2 
	    * @return numeros aleatorios enteros entre los limites**/
	   
	   public static void opcB() {
		   System.out.println("Introduce los limtes entre los que quieres obtener el numero aleatorio separado por comas: ");
		   int lim1 = 0, lim2 = 0;
		   String limites[] = tecla.nextLine().split(",");
		   lim1 = Integer.parseInt(limites[0]); //EN LA SEGUNDA PASADA ME DA ERROR, PORQUE?
		   lim2 = Integer.parseInt(limites[1]);
		   System.out.println("Introduce la cantidad de numeros que quieres obtener: ");
		   int cantidad = tecla.nextInt(); 
		   System.out.println(Operaciones.RDToString(lim1, lim2, cantidad));
		   System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
	   }
	   /**@param limite1 limite2 
	    * @return numeros aleatorios double entre los limites**/
	   public static void opcBDouble() {
		   System.out.println("Introduce los limtes entre los que quieres obtener el numero aleatorio separado por comas: ");
		   double lim1 = 0.0, lim2 = 0.0; 
		   String limites[] = tecla.nextLine().split(",");
		   lim1 = Double.parseDouble(limites[0]);
		   lim2 = Double.parseDouble(limites[1]);
		   System.out.println("Introduce la cantidad de numeros que quieres obtener: ");
		   int cantidad = tecla.nextInt(); 
		   System.out.println(Operaciones.RDToString(lim1, lim2, cantidad));
		   System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
	   }
	   /**@param cantidad de nombres entre los que quiero elegir 
	    * @return nombre aleatorio de los introducidos**/
	   public static void opcANombre() {
		   int cantidadNombres = 0;
		   System.out.println("Elegiste la opcion a, por favor, introduce los nombres a elegir separandolos por comas: ");
		   String lista = tecla.nextLine();
		   String[] todosNombres = lista.split(",");
		   cantidadNombres = todosNombres.length - 1;
		   String[] nombres = new String[cantidadNombres];
		   
	       for(int i = 0; i < cantidadNombres ; i++) {
			   nombres[i] = todosNombres[i].trim(); //inserto los nombres en la base de datos
		   }
	       //SI PUSE TRIM PORQUE NO ME QUITA LOS ESPACIO EN BLANCO??
	       int nomElegido = (int)(0 + Math.random() * (cantidadNombres + 1));
	       System.out.println("El nombre elegido es: " + nombres[nomElegido]);  
	       System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
	   }
	   /**@param cantidad de nombres entre los que quiero elegir + cantidad a mostrar
	    * @return cantidad elegida de nombres de los introducidos**/
	   public static void opcANombres() {
		   int cantidadNombres = 0;
		   System.out.println("Elegiste la opcion a, por favor, introduce los nombres a elegir separandolos por comas: ");
		   String lista = tecla.next().trim();
		   String[] todosNombres = lista.split(",");
		   cantidadNombres = todosNombres.length;
		   String[] nombres = new String[cantidadNombres];
		   
	       for(int i = 0; i < cantidadNombres ; i++) {
			   nombres[i] = todosNombres[i].trim(); //inserto los nombres en la base de datos
		   }
	       for(int i = 0; i < nombres.length; i++) {System.out.println(nombres[i]);}
	       System.out.print("Inserta la cantidad de nombres a elegir: ");
	       //String h = tecla.nextLine();
	       //System.out.println(h);
	       int cantidad = tecla.nextInt();
	       String resultado = "";
	       int vecesEntradas = 0;
	       boolean entrada = false;
	       int[] memoria = new int[cantidad]; //cantidad - 1
	       int[] nomElegido = new int[1];
	       
	       for(int i = 0; i < cantidad; i++) {  
	    	  if(Operaciones.comparacion(memoria, nomElegido[0], i, i) == false || nomElegido.length == 0) {  
	            nomElegido[0] = (int)(0 + Math.random() * (cantidadNombres + 1)); 
	            memoria[i] = nomElegido[0]; //PORQUE ESTA MAL Y ME DA ERROR DE EJECUCION AQUI =?= SI PARECE ESTAR BIEN
	             //TODO a completar /**TODO**/
	            //nombresRepetidos[vecesEntradas] = nomElegido;no sirve en teoria
	            
	             if(cantidad == 1) {resultado = nombres[nomElegido[0]] + ".";}
	               else {
	        	     resultado = resultado + nombres[nomElegido[0]] + ",";//CONTIENE UN ERROR 
	             }
	    	  }else {
	    		  nomElegido[0] = (int)(0 + Math.random() * (cantidadNombres + 1));
	    		  memoria[i] = nomElegido[0];
	    	  }
	    	  if(Operaciones.comparacion(memoria, nomElegido[0], i, i) == true && i > 0){
	    		  i--;
	    	  }
	    	 }
	     
	       System.out.println("El nombre elegido es: " + resultado);  
	       System.out.print("Pulsa cualquier tecla para volver al menu");tecla.next();
	   }
	   
	   /**@param array , numero , i, cantidad
	    * @return boolean true o false para el if**/
	   public static boolean comparacion(int[] array,int num,int i,int cant) {
		   int cantidad = cant;
		   boolean resultado = true;
		   for( int a =0; a< cantidad; a++) {
			   if(array[a] == num){resultado = false;}
		   }
		   return resultado;
	   }
	   
	   
	   
	   //OPERACIONES DE LOS CALCULOS DE LOS VALORES PEDIDOS
	   /**@param limite1 limite2 en enteros
		 * @return valor entero de un numero aleatorio**/
	   public static int randomInt(int limite1, int limite2) {
			int solucion = (int)(limite1 + (Math.random() * (limite2 - limite1 +1)));
		    return solucion;
	  }
	  /**@param limite1 limite2 en enteros
	    * @return valor double de un numero aleatorio**/
	   public static double randomDouble(double limite1, double limite2) {
		    return (limite1 + (Math.random() * (limite2 - limite1 +1)));
	   }
	   /**@param limite1 limite2 cantidadDeNumerosAleatorios
		 * @return numeros aleatorios entre limites**/
	   public static String RDToString(double lim1, double lim2, int repetir) {
			double[] baseDatos = new double[repetir];                                           //creo la base de datos de los numeros aleatorios
			for(int i = 0; i < repetir; i++) {
				double resultado = (double)(lim1 + Math.random() * (lim2 - lim1 + 1));          //saco los numeros alatorios 
				baseDatos[i] = resultado;
			}
			//devuelvo el resultado o los resultados
			String resultadoFinal = "";
			String solMay1 = "Los resultados son: ( ";
			String solMen1 = "El resultado es: ( ";
			if (repetir == 1) {resultadoFinal += solMen1;}
			if(repetir > 1) { resultadoFinal += solMay1;}
			for(int i = 0; i < repetir ; i++) {
				if(i == (repetir - 1)) {
					resultadoFinal += baseDatos[i] + " ).";
				}
				else {resultadoFinal += baseDatos[i] + " ),( ";}
			}
			return resultadoFinal;
		}
}
