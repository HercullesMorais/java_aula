package principal;

public class program {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * variaveis s�o espa�os alocados na memoria que salvar uma informa��o (um dado)
		 * 
		 * o tipo int armazena n�meros inteiros
		 * Int s�o n�meros: 1, 2, 3, 4, 10, 40..
		 * Double que s�o n�meros com casas decimais
		 * exemplo: 10.50, 25.99 ...
		 * exemplos char: c, d, a, 1, 2...
		 * String � uma clase do java utilizada para armazenar cadeias de caracteres(frases por exemplos)
		 * sua inicializa��o � feita com aspas duplas
		 * exemplos de Sting: nomes, locais...
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "Herculles Morais";
		char sexo = 'M';
		
		int number1 = 320;
		int number2 = 330;
		int resultado = number1 + number2;

	
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
	
		
		precoDaCamisa = 40.99;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(precoDaCamisa);
		System.out.print(sexo);
		
		System.out.println();
		System.out.println();
		
		System.out.print(nome + " " + sexo + " " + precoDaCamisa);
		System.out.println();
		
		System.out.println(nome + " comprou uma camisa como o valor de: " + precoDaCamisa );
		
		nome = "Kamylla Morais";
		precoDaCamisa = 300;
		System.out.println();
		
		System.out.println("A cliente " + nome + " comprou nossa camisa no valor de: " + precoDaCamisa);
		System.out.println();
		
		System.out.println("Esse � o resultado: " + resultado);
		System.out.println("Esse � o resultado: " + (number1 + number2));
		
		System.out.println();System.out.println();System.out.println();
		
	
		
		String meunome = "Herculles Viana";
		int idade = 22;
		double saldo = 0.05;
		
		System.out.println(meunome + " tem " + idade + " anos e possui somente " + saldo + " na conta :/." );

	
	}

}
