import java.util.Scanner;
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Switch
		/*
		 * switch(condicion){
		 * case valor:
		 * codigo
		 * codigo
		 * codigo
		 * Break;
		 * case valor2;
		 * codigo
		 * codigo
		 * codigo
		 * break; //siempre se le pone el break
		 * default: // el Default es para cuando no se cumple ningun caso
		 * codigo
		 * codigo
		 * break;
		 * }
		 */

	
	
	int dia = 7;
	String mensaje = "" ;
	
	switch (dia) {
	case 1: 
	mensaje = "lunes";
	break;
	case 2: 
	mensaje = "martes";
	break;
	case 3: 
	mensaje = "miercoles";
	break;
	case 4:
	mensaje = "jueves";
	break;
	case 5:
	mensaje = "viernes";
	break;
	case 6:
	mensaje = "sabado";
	break;
	case 7:
	mensaje = "domingo";
	break;
	default:
	mensaje = "Dian Invalido";

	}

					
	 System.out.println(mensaje);
	 
	 /*
	  * crear una calculadora que pueda sumar restar ultiplicar y dividir 2 numeros.
	  * la calculadora debe de pedir los dos numeros y posterior a eso preguntar que operación realizar, el menu es el siguiente;
	  * 1. suma
	  * 2. resta
	  * 3. multiplicacion
	  * 4. divisón
	  * 
	  * al final debe mostrar los resultados de la operacion
	  * nota: se debe usar el switch
	  */
	 /*
	 System.out.println("Hola, este es el menu de opreaciones: "
	 		+ "1.- suma "
	 		+ "2.- resta "
	 		+ "3.- multiplicacion "
	 		+ "4.- divisón ");
	 System.out.println("por fabor ingresa 2 numeros y elije con un numero la operacion a realizar");
	 double a = 0;
	 double b = 0;
	 int operacion = 0;
	 double calcular = 0 ;
	 
	 System.out.println("metele el primer numero");
	 Scanner Entradaa = new Scanner (System.in);
	 a = Entradaa.nextDouble ();
	 System.out.println("metele el segundo numero");
	 Scanner Entradab = new Scanner (System.in);
	 b = Entradab.nextDouble ();
	 System.out.println("elije una operacion");
	 Scanner Entradaoperacion = new Scanner (System.in);
	 operacion = Entradaoperacion.nextInt ();
	 
	 
	 switch (operacion) {
		case 1: 
			calcular = a + b;
		break;
		case 2: 
			calcular = a - b;
		break;
		case 3: 
			calcular = a * b;
		break;
		case 4:
			calcular = a / b;
		break;
		default:
			mensaje = "error intenta otra vez, ya lo rompiste";				 
	}
	 
	 System.out.println("el resultado es " + calcular);
	*/

	 double a1 = 0;
	 double b2 = 0;
	 double c3 = 0;
	 
	 

	 System.out.println("metele el primer angulo");
	 Scanner Entradaa1 = new Scanner (System.in);
	 a1 = Entradaa1.nextDouble ();
	 System.out.println("metele el segundo angulo");
	
	 b2 = Entradaa1.nextDouble ();
	 System.out.println("metele el tercer angulo");
	 Scanner Entradac3 = new Scanner (System.in);
	 c3 = Entradac3.nextDouble ();
	 
	 double angulo = a1 + b2 + c3 ;
	 String mensaje2 = triangulo(angulo);
	 System.out.println(mensaje2);
	 System.out.println(angulo);
	}
	
	 public static String triangulo (double angulo) {
			
			if (angulo == 180) {
				return " si es un triangulo";				
			}
			else {
				return "tu triangulo es falso";				
			}	
	 }
	 
}

