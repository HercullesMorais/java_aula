package principal;

public class Program {
	
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2(double n) {
		System.out.println("O n�mero informado foi: " + n);
	}
	
	static String mensagem3() {
		
		return "Aqui � minha fun��o n�mero 3";
	}
	
	static String mensagem4(int x) {
		return "N�mero informado: " + x;
	}
	
	static double soma(double x, double a) {
		x = a + x;
		 
		return  x;
		
	}
	
	/* N�O � BOM USAR!!!
	static int exemplo(double y) {
		return (int)y;
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(10));
		//System.out.println(exemplo(16.6)); N�O � BOM USAR!!!
		
		System.out.println(soma(40,30));
		
		
		
	}
	


}
