package Metodo;

public class Emprestimo {
	
//	CRIANDO UMA FUN��O GET DUAS PARCELAS PARA ELA ME RETORNAR O VALOR PASSADO ABAIXO.
	public static int getDuasParcelas() {
		
		return 2;
	}
	
	public static int getTresParcelas() {
		
		return 3;
	}
//	CRIANDO UMA FUN��O GET TAXAS PARA DUAS PARCELAS PARA ELA ME RETORNAR O VALOR PASSADO ABAIXO.
	public static double getTaxasDuasParcelas() {
		
		return 0.3;
	}
	
	public static double getTaxasTresParcelas() {
		
		return 0.45;
		
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if (parcelas == 2) {
			
			double valorFinal = valor + (valor * getTaxasDuasParcelas());
			
			System.out.println("O valor do emprestimo para 2 parcelas � R$" + valorFinal);
		}
		
		else if (parcelas == 3) {
			
			double valorFinal = valor + (valor * getTaxasTresParcelas());
			
			System.out.println("O valor do emprestimo para 3 parcelas � R$" + valorFinal);	
		}
		
		else {
			System.out.println("Quantidade de parcelas n�o aceita!");
		}
		
	}

}
