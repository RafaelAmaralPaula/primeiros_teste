import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um divisor :");
		int divisor = teclado.nextInt();

		for (int i = 100; i <= 200; i++) {

			if (i % divisor == 0) {
				break;
			}
			System.out.println("Encontrei divisor : " + i);

		}

		System.out.println("Fim !");

		teclado.close();

	}

}
