package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
				
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		nome = sc.nextLine();
			
		int[] notas = new int[4];
		
		for(int contador = 0; contador < notas.length; contador++) {
			System.out.println("Entre com suas notas do bimestre: ");
			notas[contador] = sc.nextInt();
			
		}
		
		double soma = 0;
		for(double n : notas) {
			soma += n;
		}
		
		System.out.println("Olá, " + nome + " Sua média foi: " + soma/notas.length);
		
		sc.close();
							
	}

}
