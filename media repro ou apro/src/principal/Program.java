package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double nota1 = 12;
		double nota2 = 12;
		double nota3 = 12;
		double nota4 = 12;
		
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println(media);
		
		if (media < 6) {
			System.out.println("Aluno reprovado!");
		}
		else if (media >= 6 && media < 7) {
			System.out.println("Aluno recuperação");
		}
		else if (media >= 7 && media < 10 ) {
			System.out.println("Aluno aprovado!");
		}
		else if (media > 10) {
			System.out.println("Nota inválida, favor verificar!");
		}
		
		
		else {
			System.out.println("Honrado!");
		}
		
		
		
		
		
		

	}

}
