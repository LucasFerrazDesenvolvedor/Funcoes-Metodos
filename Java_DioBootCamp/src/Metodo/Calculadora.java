package Metodo;

public class Calculadora {
	
//	CRIANDO UMA FUN��O PARA SOMAR DOIS NUMEROS.
	public static void soma(double numero1, double numero2) {
//		CRIANDO UMA VARIAVEL PARA RECEBER O RESULTADO DA SOMA ENTRE OS DOIS NUMEROS.
		double resultado = numero1 + numero2;
//		MOSTRAR NA TELA O TEXTO E O RESULTADO ENTRE OS NUMEROS SOMADOS.
		System.out.println("A soma entre " + numero1 + " e " + numero2 + " � = " + resultado );
	}
	
//	CRIANDO UMA FUN��O PARA SUBTRAIR DOIS NUMEROS.
	public static void subtracao(double numero1, double numero2) {
//		
		double resultado = numero1 - numero2;
		
		System.out.println("A subtra��o entre " + numero1 + " e " + numero2 + " � = " + resultado);
	}
	
//	CRIANDO UMA FUN��O PARA MULTIPLICAR DOIS NUMEROS.
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		
		System.out.println("A multiplica��o entre " + numero1 + " e " + numero2 + " � = " + resultado);
	}
	
//	CRIANDO UMA FUN��O PARA DIVIDIR DOIS NUMEROS.
	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		
		System.out.println("A divis�o entre " + numero1 + " e " + numero2 + " � = " + resultado);
	}

}
