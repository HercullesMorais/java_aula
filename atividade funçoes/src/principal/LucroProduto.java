package principal;

import java.util.Scanner;

public class LucroProduto {

	static double lucro() {
		
		double valorDoProduto = 0;
		double lucroProduto = 0;
		double lucroDesejado;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Entre com o valor do produto: ");
		valorDoProduto = sc.nextDouble();
		
		System.out.print("Entre com o lucro desejado (%): ");
		lucroDesejado =  sc.nextDouble();
		
		double percentual = lucroDesejado / 100;
		
		double lucro = valorDoProduto * percentual;
		
		lucroProduto = valorDoProduto +  lucro;
		
		System.out.println("Valor final: R$ " + lucroProduto + " Valor do lucro: R$ " + lucro);
		
		return lucro;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lucro();
		
		
		
	}

}
