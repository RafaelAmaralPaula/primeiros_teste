
public class CalculadoraProfessor {
	
	public static void main(String[] args) {
		
		boolean calculoDetalhado =  true;
		
		float pi = 3.14F;
		
		float raio = 5.3F;
		
		float area = raio * raio * pi;
		
		
		System.out.println("Resultado : " + area);
		
		int areaSemCasasDecimais = (int) area ;
		
		System.out.println("---------------------------------------");
	
		System.out.println("Resultado : " + areaSemCasasDecimais);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
	
	}
	
}
