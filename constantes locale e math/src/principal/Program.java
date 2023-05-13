package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.1415;
		
		//realiza a potencia
		System.out.println(Math.pow(2 , 3));
		
		//passagem de 2 numeros como parametro
		// retorna o maior deles
		System.out.println(Math.max(2 , 20));
		
		// � o inverso do max, pega o minimo
		System.out.println(Math.min(2 , 20));

		// retorna a raiz quadrada
		System.out.println(Math.sqrt(16));
		

		// arredonda o n�mero (mais ou menos)
		System.out.println(Math.round(16.4599));
		

		// podemos realizar calculos com valores retornados pelo calculo math
		System.out.println(2 + Math.sqrt(16));
		
		
		Scanner leia = new Scanner(System.in);
		Locale ponto = new Locale("en", "us");
		
		System.out.println("Entre com valor do dolar: ");
		
		double dolar = leia.useLocale(ponto).nextDouble();
		System.out.println("Valor do dolar atual: " + dolar);
		
		String nome = "Morais";
		char sexo = 'm';
		int idade = 22;
		double altura = 1.6444343;
		
		System.out.printf("O meu nome � %s, sou do sexo %c, tenho %d anos, minha altura �: %f", nome, sexo, idade, altura);
		 
		/*
		 * operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente de
		 * == igual a
		 * */
		
		/*
		 * operadores l�gicos
		 * && = e
		 * || = ou 
		 * ! =  nega��o
		 * */
		
		leia.close();
		
	}

}
