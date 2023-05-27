package principal;

import java.util.Random;

public class AtividadeNumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random randon = new Random();
		
		
		int[] numeros = new int[50];
		int par;
		
		for(int contador = 0; contador < numeros.length; contador++) {
			numeros[contador] = randon.nextInt(500);
			
			par = numeros[contador];
			
			
			
			if ((par % 2) == 0) {
				 
				  System.out.println("Posição: " + contador + " | Número: " + par);;
		  			}
		}
		
		
	}

}
