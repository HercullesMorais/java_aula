package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operacao;
		int num = 0;
		float contator = 0;
	
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Entre com alguma opera��o: ");
			operacao = sc.next ().charAt(0);
			
			System.out.println("Entre com algum n�mero: ");
			num = sc.nextInt();
				
			switch (operacao) {
			case '*':
				for(int contador = 1; contador <= 10; contador++) {
					int tabu = num * contador;
					
					System.out.println(contador + " x " + num + " = " + tabu);
				};		
				
				break;
				
			case '+':
			
				for(int contador = 1; contador <= 10; contador++) {
					int tabu = contador + num;
					
					System.out.println(contador + " + " + num + " = " + tabu);	
				}
				break;
				
			case '-':
				for(int contador = num + 1; contador <= num + 10; contador++) {
					int tabu = contador - num;
					
					System.out.println(contador + " - " + num + " = " + tabu);
				}		
				break;

			case '/':
				for(contator = num; contator <= num * 10; contator += num) {
					float divi = contator / num;
					
					System.out.println((contator + " / " + num + " = " + divi));
				}
				break;

			default:
				System.out.println("N�o corresponde!");
				break;
			}
			
		sc.close();
			
	}

}
