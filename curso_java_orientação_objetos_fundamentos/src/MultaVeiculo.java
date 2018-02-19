import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Tipo do veiculo (passeio, caminhao)");
		String tipoVeiculo = teclado.nextLine();

		System.out.println("");

		System.out.println("Qual velocidade máxima permitida ? ");
		int velocidadeMaximaPermitida = teclado.nextInt();

		System.out.println("");

		System.out.println("Qual  velocidade do veículo ? ");
		int velocidadeDoVeiculo = teclado.nextInt();

		System.out.println("");

		if ((tipoVeiculo.equals("passeio") && velocidadeDoVeiculo > velocidadeMaximaPermitida * 1.1)
				|| (tipoVeiculo.equals("caminha") && velocidadeDoVeiculo > velocidadeMaximaPermitida * 1.05)) {

			System.out.println("MULTADO !");

		}

		teclado.close();

	}

}
