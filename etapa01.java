package projProg; /** código feito na escola **/
import java.util.Scanner;

public class Etapa01 {

	public static void main(String[] args) {
		/**
		Ler nome do cliente
		Ler descrição do problema
		Ler valor da hora de serviço
		Ler quantidade de horas trabalhadas
		Calcular o valor total
		Exibir um resumo organizado
		**/
		Scanner teclado = new Scanner(System.in);
		
		String nomeC;
		String prob;
		double valorHora;
		double valorTotal;
		int qtdeHora;
		
		System.out.print("-- REGISTRO DE MANUTENÇÃO TÉCNICA --\nInforme seu nome: ");
		nomeC = teclado.nextLine();
		System.out.print("Olá, "+nomeC+"! Informe o problema identificado: ");
		prob = teclado.nextLine();
		System.out.print("Certo. Digite o valor da hora de serviço: R$ ");
		valorHora = teclado.nextFloat();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		qtdeHora = teclado.nextInt();
		
		System.out.print("\n-- RESUMO DO SERVIÇO --\n"+nomeC+", você foi atendido(a) pelo(a) "+nomeT+", que resolveu o seguinte problema: "+prob+".\nA hora de serviço de "+nomeT+" custa R$ "+valorHora+".\n");
		valorTotal = valorHora*qtdeHora;
		System.out.print("Como ele(a) levou "+qtdeHora+" hora(s) para resolver a solicitação, o valor total do serviço é de R$ "+valorTotal+".");
		}

}

