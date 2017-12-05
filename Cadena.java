import java.util.*;
/**
 * Clase cadena, ejercicio que nos sirve para analizar a través de una serie de métodos una cadena 
 * que le introduzcamos
 * @author Jorge Martínez Yébenes
 * @version 1.0
 */
public class Cadena {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Introduzca una palabra%n");
		String palabra = in.nextLine();
		in.close();
		System.out.printf("¿La palabra %s empieza por vocal o acaba? %b%n",palabra,comprobarComienzoYFinPorVocal (palabra));
		System.out.printf("¿La palabra %s contiene alguna de las constantes mencionadas? %b%n",palabra, comprobarConstantes(palabra));
		System.out.printf("La palabra %s contiene: %d vocales %n",palabra, contarVocalesPalabra(palabra));
		System.out.printf("¿La palabra %s empieza o no por vocal? %b%n",palabra,comprobarEmpiezaONoPorVocal (palabra) );
	}
	
	/**
	 * @param palabra Cadena que le hemos introducido anteriormente a través de la clase Scanner
	 * @return Devuelve un boolean indicando si la palabra empieza o acaba por vocal
	 */
	public static boolean comprobarComienzoYFinPorVocal(String palabra) {
		boolean resultado = false;
		if (palabra.startsWith("a")||
			palabra.startsWith("e")||
			palabra.startsWith("i")||
			palabra.startsWith("o")||
			palabra.startsWith("u")||
			palabra.endsWith("a")||
			palabra.endsWith("e")||
			palabra.endsWith("i")||
			palabra.endsWith("o")||
			palabra.endsWith("u"))
			resultado = true;
			
		return resultado;		
	}
	/**
	 * @param palabra Cadena que le hemos introducido anteriormente a través de la clase Scanner
	 * @return Devuelve un int indicando el número de vocales que tiene la cadena
	 */
	public static int contarVocalesPalabra (String palabra) {
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i)== 'a'||
				palabra.charAt(i)== 'e'||
				palabra.charAt(i)== 'i'||
				palabra.charAt(i)== 'o'||
				palabra.charAt(i)== 'u') 
				contador ++;
		}
		return contador;
	}
	/**
	 * @param palabra Cadena que le hemos introducido anteriormente a través de la clase Scanner
	 * @return Devuelve un boolean indicando si la cadena posee una serie de connstantes (n,m y p)
	 */
	public static boolean comprobarConstantes (String palabra) {
		boolean resultado = false;
		if (palabra.contains("n")||
			palabra.contains("m")||
			palabra.contains("p"))
			resultado = true;
		return resultado;
	}
	/**
	 * @param palabra Cadena que le hemos introducido anteriormente a través de la clase Scanner
	 * @return Devuelve un boolean indicando si la cadena empieza o no por vocal
	 */
	public static boolean comprobarEmpiezaONoPorVocal (String palabra) {
		boolean resultado = false;
		if (palabra.startsWith("a")||
			palabra.startsWith("e")||
			palabra.startsWith("i")||
			palabra.startsWith("o")||
			palabra.startsWith("u"))
			resultado = true;
		return resultado;
	}
}

