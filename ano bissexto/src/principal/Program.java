package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anoInser;
		
		Scanner ano =  new Scanner(System.in);
		
		System.out.println("Entre com algum ano: ");
		anoInser = ano.nextInt();
		
		if((anoInser % 4 == 0 && anoInser % 100 != 0) || anoInser % 400 == 0) {
			System.out.println("O ano é bissexto!");
		 
		} 
		else {
			System.out.println("O ano NÃO é bissexto!");
		}
	
		
		
		
	}

}
