 package principal;

import java.util.Scanner;

public class Program {
	
	
		
		
	
	
	static double soma() {
		
		double dolar = 5.04;
		double euro = 5.40;
		double valor = 0;
		double x = 0;
		String a = "";
		String b = "";
		
		String[] moedasDOL = {"Dolar", "dolar", "Dólar", "dólar", "dol"};
		
		String[] moedasEUR = {"euro","Eur","Euro","eure","Euro",};
		
		String[] moedasREA = {"real","Real","Rea","Reais","reais",};
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Você deseja converter: ");
		a = sc.next();
		System.out.println("Para qual moeda");
		b = sc.next();		
		
		System.out.println("Com o valor a ser convertido: ");
		valor = sc.nextDouble();
		
	
		
		for(int i = 0; i <5; i++) {
			
		}
		
		switch (a) {
		case "dolar":
			for(int i = 0; i <5; i++) {
				if(b.equals(moedasREA[i])) {
					x = dolar * valor;
				}
				else if(b.equals(moedasEUR[i])) {
					x = (dolar / euro) * valor;
				}
			}
			
			
			break;
			
			
		case "real":
			for(int i = 0; i <5; i++) {
				
				if(b.equals(moedasDOL[i])) {
					x = valor / dolar;
				}
				else if(b.equals(moedasEUR[i])) {
					x = valor / euro;
				}
			}
			
			
			
			break;
			
		case "euro":
			for(int i = 0; i <5; i++) {
				if(b.equals(moedasREA[i])) {
					x = valor * euro;
				}
				else if(b.equals(moedasDOL[i])) {
					x = (euro/dolar) * valor;
				}
				
			}
			
			
			
			break;
			
		
	


		default:
			System.out.println("Não corresponde a nenhuma moeda! Entre com uma moeda válida!");
			break;
		}
		
		
			
			
			
			
			
		
		
		
		
		
		
		
	
		sc.close();
		return x;
		
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println(soma());

	}

}
