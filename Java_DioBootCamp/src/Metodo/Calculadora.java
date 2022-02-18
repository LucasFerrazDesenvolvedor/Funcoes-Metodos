package Metodo;

public class Calculadora {
	
//	CRIANDO UMA FUNÇÃO PARA SOMAR DOIS NUMEROS.
	public static void soma(double numero1, double numero2) {
//		CRIANDO UMA VARIAVEL PARA RECEBER O RESULTADO DA SOMA ENTRE OS DOIS NUMEROS.
		double resultado = numero1 + numero2;
//		MOSTRAR NA TELA O TEXTO E O RESULTADO ENTRE OS NUMEROS SOMADOS.
		System.out.println("A soma entre " + numero1 + " e " + numero2 + " é = " + resultado );
	}
	
//	CRIANDO UMA FUNÇÃO PARA SUBTRAIR DOIS NUMEROS.
	public static void subtracao(double numero1, double numero2) {
//		
		double resultado = numero1 - numero2;
		
		System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é = " + resultado);
	}
	
//	CRIANDO UMA FUNÇÃO PARA MULTIPLICAR DOIS NUMEROS.
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		
		System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " é = " + resultado);
	}
	
//	CRIANDO UMA FUNÇÃO PARA DIVIDIR DOIS NUMEROS.
	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		
		System.out.println("A divisão entre " + numero1 + " e " + numero2 + " é = " + resultado);
	}

}
