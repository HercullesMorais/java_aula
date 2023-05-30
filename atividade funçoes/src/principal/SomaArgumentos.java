package principal;

import java.util.Scanner;

public class SomaArgumentos {

	
	static double soma() {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Entre com segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println("Entre com terceiro número: ");
		num3 = sc.nextDouble();
		
		result = num1 + num2 + num3;
	
	return result;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(soma());
		
		
		
		
		
		
		
	}

}
