package Metodo;

public class Mensagem {
	
//	CRIANDO UMA FUN플O PARA RECEBER A MENSAGEM DE ACORDO COM A HORA QUE FOR PASSADA
	public static void obterMensagem(int hora) {
//		IREMOS ANALISAR A CONDI플O HORA
		switch (hora) {
//		CASO A CONDI플O (HORA) FOR INFORMADA DO NUMERO 0 Hrs AS 11 Hrs. VAI ME MOSTRAR A MENSAGEM ("BOM DIA").
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8: 
		case 9:
		case 10:
		case 11:
			mensagemBomDia();
			break;
//		CASO A CONDI플O (HORA) FOR INFORMADA DO NUMERO 12 Hrs AS 17 Hrs. VAI ME MOSTRAR A MENSAGEM ("BOA TARDE").
		case 12:	
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mensagemBoaTarde();
			break;
//			CASO A CONDI플O (HORA) FOR INFORMADA DO NUMERO 18 Hrs AS 23 Hrs. VAI ME MOSTRAR A MENSAGEM ("BOA NOITE").
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
			mensagemBoaNoite();
			break;
//		CASO N홒 FOR DIGITADOS NENHUM DOS VALORES ACIMA. VAI ME MOSTRA A MENSAGEM ("HORA INVALIDA")
		default:
			System.out.println("Hora invalida!");
			break;
		}
	}
	
//	CRIANDO UMA FUN플O PARA CHAMAR A MENSAGEM BOM DIA.
	public static void mensagemBomDia() {
		
		System.out.println("Bom dia!");
	}
//	CRIANDO UMA FUN플O PARA CHAMAR A MENSAGEM BOA TARDE.
	public static void mensagemBoaTarde() {
		
		System.out.println("Boa tarde!");
	}
//	CRIANDO UMA FUN플O PARA CHAMAR A MENSAGEM BOA NOITE.
	public static void mensagemBoaNoite() {
		
		System.out.println("Boa noite!");
	}
	

}
