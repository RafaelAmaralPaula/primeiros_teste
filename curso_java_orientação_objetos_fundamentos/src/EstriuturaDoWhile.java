import java.util.Scanner;

public class EstriuturaDoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor = 0;
		int soma = 0;

		System.out.println("");

		do {

			System.out.println("Digite 0 para sair ou qualquer numero para somar");
			valor = teclado.nextInt();

			soma += valor;
			System.out.println("Soma : " + soma);

		} while (valor != 0);

	}
}
