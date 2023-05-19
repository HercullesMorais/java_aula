package principal;

import java.util.Random;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random sorteio =  new Random();
		
		int dado1;
		int dado2;
		int dado3;
		
		int bonus1 = 0;
		int bonus2 = 0;
		int bonus3 = 0;
		
		dado1 = sorteio.nextInt(6) + 1;
		System.out.print(dado1 + " ");
		
		dado2 = sorteio.nextInt(6) + 1;
		System.out.print(dado2 + " ");

		dado3 = sorteio.nextInt(6) + 1;
		System.out.println(dado3 + " ");
		
		
		if(dado1 == dado2 && dado1 == dado3) {
			bonus1 = 6;
			System.out.println("Você é muito surtudo, ganhou 6  pontos!");
		} 
		else if(dado1 == dado2 || dado2 == dado3) {
			bonus2 = 2;
			System.out.println("Você ganhou 2 pontos!");
		}
		else if(dado1 == dado3) {
			bonus3 = 2;
			System.out.println("Você ganho 2 pontos!");
		}
		
			
		int totalBonus = bonus1 + bonus2 + bonus3;
			
		int totalDados = dado1 + dado2 + dado3;
		
		int totalPontos = totalBonus + totalDados;
		
		System.out.println("Seu total de pontos foi: " + totalPontos);
		
		if((totalBonus + totalDados) < 15) {
			System.out.println("Game Over! :/");
		}
		else if((totalBonus + totalDados) >= 15) {
			System.out.println("Parabéns você ganhou! :) ");
		}
		
		
		
		
		
		
	



	}

}
