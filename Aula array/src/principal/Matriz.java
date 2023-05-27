package principal;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]numeros = new int[3][3];
		
		int contador = 1;
		int cont = 1;
		
		for(int x = 0; x < numeros.length; x++) {
			
			for(int y = 0; y < numeros.length; y++) {
				
				numeros[x][y] = contador;
				
					System.out.print(numeros[x][y] +  "\t");
				
					contador++;
				
			}
						
			System.out.println();
					
			}
			
			
		for(int a = 0; a < numeros.length; a++) {
			for(int b = 0; b < numeros.length; b++) {
				if(numeros[a].equals(numeros[b])) {
					System.out.println(numeros[a][b]);
				}
				else {
					System.out.print("\t");
				}
				
			} 
			 System.out.println();
				
			}	
		
	}

}