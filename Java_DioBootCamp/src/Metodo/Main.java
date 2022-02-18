package Metodo;

public class Main {

	public static void main(String[] args) {
		
//		CALCULADORA
		
		System.out.println("Exercicio Calculadora");
//		CHAMANDO A CLASSE "CALCULADORA" E ADICIONANDO A FUN플O DE SOMA, SUBTRA플O, DIVIS홒 E MULTIPLICA플O
		Calculadora.soma(10, 5);
		Calculadora.subtracao(20, 5);
		Calculadora.divisao(45, 3);
		Calculadora.multiplicacao(5, 3);
		
//		MENSAGEM

		System.out.println("Exercicio Mensagem");
//		CHAMANDO A CLASSE "MENSAGEM" E ADICONADO A FUN플O DE OBTER A MENSAGEM DE ACORDO COM A CONDI플O HORA QUE FOI PASSADA.
		Mensagem.obterMensagem(0);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(19);
		Mensagem.obterMensagem(76);

//		EMPRESTIMO
		
		System.out.println("Exercicio Emprestimo");
//		CHAMANDO A CLASSE "EMPRESTIMO" E ADICIONADO A FUN플O DE CALCULAR PARA OBTER O RESULTADO DE QUANTO IREI PARA DE ACORDO COM O A TAXA DAS PARCELAS.
		Emprestimo.calcular(200, 2);
		Emprestimo.calcular(100, 3);
		Emprestimo.calcular(20, 1);
	}

}
