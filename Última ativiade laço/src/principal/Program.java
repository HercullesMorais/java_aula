package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operacao;
		int num = 0;
		float contator = 0;
	
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Entre com alguma operação: ");
			operacao = sc.next ().charAt(0);
			
			System.out.println("Entre com algum número: ");
			num = sc.nextInt();
				
			switch (operacao) {
			case '*':
				for(int contador = 1; contador <= 10; contador++) {
					int tabu = num * contador;			
					System.out.println(tabu);
				};		
				
				break;
				
			case '+':
			
				for(int contador = 1; contador <= 10; contador++) {
					int tabu = num + contador;
					System.out.println(tabu);	
				}
				break;
				
			case '-':
				for(int contador = 1; contador <= 10; contador++) {
					int tabu = num - contador;
					System.out.println(tabu);
				}		
				break;

			case '/':
				for(contator = 1; contator <= 10; contator++) {
					float divi = num / contator;
					System.out.println(divi);
				}
				break;

			default:
				System.out.println("Não corresponde a um dia da semana.");
				break;
			}
			
		sc.close();
			
	}

}
