import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Número Inicial :");
		int numeroInicial = teclado.nextInt();

		System.out.println("");

		System.out.println("Número Final :");
		int numeroFinal = teclado.nextInt();

		int numeroAtual = numeroInicial;

		while (numeroAtual <= numeroFinal) {

			System.out.println(numeroAtual);
			numeroAtual++;

		}

		teclado.close();

	}

}
