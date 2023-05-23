package principal;

import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 1;
		
		/*for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Insira sua altura: ");
			altura = sc.nextDouble();
			somaAltura = somaAltura + altura;
			// somaAltura += altura;
			
		}*/
		
		while(contador <= 5) {
			System.out.println("Insira sua altura: ");
			altura = sc.nextDouble();
			somaAltura += altura;
			contador++;
		}
		
		System.out.println("A média das alturas é: " + somaAltura  / 5);
		
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
