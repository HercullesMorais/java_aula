package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;
		

		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("numero 1 maior");
			} else {
				System.out.println("numero 3 maior");
			}
			
		} else if (num2 > num3) {
			System.out.println("numero 2 maior");
			
		} else {
			System.out.println("numero 3 maior");
		}
		
		
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("numero 1 maior");
		}
		else if(num2 > num3 && num2 > num1) {
			System.out.println("numero 2 maior");
		}
		else {
			System.out.println("Numero 3 maior");
		}
		
		
		
	}

}
