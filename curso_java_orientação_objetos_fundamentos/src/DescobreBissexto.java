import java.util.Scanner;

public class DescobreBissexto {

	public static void main(String[] args) {

		// Regras 
		
		/*

    	* 1 - São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, ...
    	* 2 - São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
    	* 3 - Não são bissextos todos os demais anos.
		 
		 */
		
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ano :");
		int ano = teclado.nextInt();

		if (ano % 400 == 0) {

			System.out.println("O ano \"" + ano + "\" eh um ano bissexto");

		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) {

				System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
			} else {
				System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
			}

		} else {

			System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
		}

		teclado.close();

	}

}
