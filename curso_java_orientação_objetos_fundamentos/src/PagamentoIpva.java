import java.util.Scanner;

public class PagamentoIpva {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Final da Placa do seu veiculo ?");
		int finalDaPlaca = teclado.nextInt();
		
		switch(finalDaPlaca) {
		
		 case 1:
			 System.out.println("Vencimento dia 11/01/2018");
			 break;
		 
			 
		 case 2:
			 System.out.println("Vencimento dia 13/02/2018");
			 break;
		 
			 
		 case 3:
			 System.out.println("Vencimento dia 13/12/2018");
			 break;
		 
			 
		 default:
		   System.out.println("VENCIMENTO SEM DATA , ERRO !");	 
		
		}
		
		
		System.out.println("");
		
		teclado.close();
		
	}
}
