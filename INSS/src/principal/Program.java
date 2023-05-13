package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner liquido = new Scanner (System.in);
		
		double salarioBruto ;
		
		System.out.print("Qual o salário bruto? ");
		salarioBruto = liquido.nextDouble();
		
		double inss = salarioBruto*0.05;
		double ir = salarioBruto*0.11;
		double resultado = (salarioBruto - inss - ir);
		
		System.out.print("O seu salário é de: " + resultado);
				
		
		
		liquido.close();
		
	}

}
