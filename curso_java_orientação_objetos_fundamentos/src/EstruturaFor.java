import java.util.Scanner;

public class EstruturaFor {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Número Final :"); 
		int numeroFinal = teclado.nextInt();
		
		for (int i = 0; i <= numeroFinal ; i++) {
			
			System.out.println(i);
			
		}
		
		
		teclado.close();
		
	}
	
}
