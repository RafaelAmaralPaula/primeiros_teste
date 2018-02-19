package com.lovelacetecnologia.orientacaoobjetos.main;

public class Main {
	
	 public static void main(String[] args) {
		
		 Carro meuCarro = new Carro();
		 
		 meuCarro.fabricante = "Fiat";
		 meuCarro.cor = "Prata";
		 meuCarro.modelo =  "Palio";
		 meuCarro.anoFabricacao = 2011;
		 
		 System.out.println("MODELO : "  + meuCarro.modelo);
		 System.out.println("ANO : " + meuCarro.anoFabricacao);
		 System.out.println("COR : " + meuCarro.cor);
		 System.out.println("FABRICANTE : " + meuCarro.fabricante);

		 Carro seuCarro = new Carro();
		 
		 seuCarro.fabricante = "Honda";
		 seuCarro.modelo = "Civic";
		 seuCarro.cor = "Preto";
		 seuCarro.anoFabricacao =  2009;
		 
		 System.out.println("");
		 System.out.println("");
		 
		
		 System.out.println("MODELO : "  + seuCarro.modelo);
		 System.out.println("ANO : " + seuCarro.anoFabricacao);
		 System.out.println("COR : " + seuCarro.cor);
		 System.out.println("FABRICANTE : " + seuCarro.fabricante);
		 
		 
		 
	}

	
}