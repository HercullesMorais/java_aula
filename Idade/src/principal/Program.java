package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner idade = new Scanner (System.in);
		
		Double dataNascimento;
		Double dataAtual;
		
		System.out.print("Qual ano do seu nascimento? ");
		dataNascimento = idade.nextDouble();
		
		System.out.print("Qual ano atual? ");
		dataAtual = idade.nextDouble();
		
		double resultado = dataAtual - dataNascimento;
		
		System.out.print("Sua idade é: " + resultado);
		
		idade.close();
	}

}
