import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite seu Nome: ");
		String nome = teclado.nextLine();

		System.out.print("Peso: ");
		int peso = teclado.nextInt();

		System.out.print("Altura :");
		double altura = teclado.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("IMC de " + nome + " : " + imc);

		if (imc < 18.5) {

			System.out.println("Abaixo do Peso Ideal !");

		} else if (imc < 25) {

			System.out.println("Peso Ideal !");

		} else if (imc < 30) {

			System.out.println("Acima do peso");

		} else if (imc < 40) {

			System.out.println("Obesidade grave grau  n1º , 2º!");

		} else {

			System.out.println("Obesidade grau 3º");
			System.out.println("");
			
		}


		
		teclado.close();

	}

}
