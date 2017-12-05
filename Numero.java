public class Numero {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args [0]);
		if(numero < 1000 && numero > 4) {
			
		}
		else {
			System.out.printf("El número %d introducido no es váĺido %n",numero);
			return;
			}
		
		if (numero % 2 ==0)
			System.out.printf("El número %d es par %n",numero);
		else
			System.out.printf("El número %d es impar %n",numero);
		
		
		if (numero % 3 == 0 && numero % 5 == 0)
			System.out.printf("El número %d es múltiplo de tres y cinco a la vez %n",numero);
		else
			System.out.printf("El número %d no es mútliplo de tres y cinco a la vez %n",numero);
		
		String digitos = numero + "";
		int digitosTotales = digitos.length();
		System.out.printf("El numero tiene %d cifras %n",digitosTotales);
	}
}
