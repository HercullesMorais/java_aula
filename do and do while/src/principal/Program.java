package principal;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

				
				// Mais utilizada quando ja sabemos a quantidade de vezes que precisamos repetir os comando. 
				
				/*sinataxe for 
				 *1º: variavel que inicia o contador ;
				 *2º condição que deve ser aceita;
				 *3º incremento;		 * 
				 */
				
				
			/*for (int contador = 0; contador < 5; contador ++ ) {
		    
		     System.out.println("Valor de contador: " + contador);
		         
			}
			*/
			//For: sabemos a quantidade de vezes que irá repetir. 
				
			System.out.println("For ");	
			for (int i = 0 ; i < 10 ; i++) {
			System.out.println( i);
		  	}
			
			 System.out.println("-----------------------------------------");
			 
			 // While = enquanto (não sabemos a quantidade de vezes que irá repetir 
			 
			System.out.println("While");
			int i = 0;
			while (i < 10 ) {
			
				System.out.println(i);
				i++;
			}
			
			System.out.println("----------------------------------");	
			
			Scanner sc = new Scanner (System.in);
			
			System.out.print(" Deseja continuar? ");
			char opcao = sc.next ().charAt(0);
			int j = 0;
			while(opcao == 's') {
			j++;
			
			System.out.print(" Deseja continuar? ");
			opcao = sc.next ().charAt(0);
			
			}
			
			System.out.print("Entrou no while: " + j);
			System.out.println();
			
			//do while, garante que sera executado o bloco de codigos ao menos 1 vez
			
			int k = 0;
			do {
				
				System.out.print("Deseja continuar? ");
				opcao = sc.next ().charAt(0);
				
			k++;
			
			}
			
			while (Character.toUpperCase(opcao) == 'S');
			System.out.print( "Entrou no do While: " + k );
			
				
			sc.close();
				
			}
			
			
			
				
			
	}


