package principal;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] nome = new String[10];
		
		Random randon = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int sorteio = randon.nextInt(10)+1;

		
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Entre com o nome: ");
			nome[i] = sc.nextLine();	
			
		
		}
		
		
		
		System.out.println("O ganhador foi: " + nome[sorteio]);
		
				

		}
		
}
		
	