package retos;
/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

public class Reto0 {

	// https://www.java.com/es/
	
	/*
	 * otra manera de comentario en varias líneas
	 */
	
	String variable ;
  final int constante  = 3;
	Boolean boleano = true;
	Boolean boleano2 = false;
	int entero =5;
	Double decimal =3.45;
	String cadena = "mi cadena de texto";
	
	
	
	
	public static void main(String[] args) {
		
		String saludo = "Hola";
		String lenguaje = " Java";
		
	System.out.println(saludo + " desde" +lenguaje);
	}

}
