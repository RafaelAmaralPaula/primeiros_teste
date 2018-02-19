import java.util.Scanner;

public class Escopo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nomePai = "";
		
		System.out.println("Idade :");
		int idade = teclado.nextInt();
		
		boolean podeDirigir = idade >= 18;
		
		if(!podeDirigir) {
			
			System.out.println("Nome Pai :");
			nomePai = teclado.next();
			
			
		}
		
		System.out.println("Você pode dirigir ?");
		
		if(podeDirigir) {
			
			System.out.println("Sim , Claro");
		
		}else {
			
			System.out.println("Não , se fizer seu pai " + nomePai + "  vai ser preso !");
			
		}
		
		teclado.close();
		
		
	}
	
}
