package revisao;
import java.util.Scanner;

/*
Criar a classe OrdemServico
Adicionar atributos (cliente, descrição, valorHora, horas)
Criar um construtor
Implementar calcularTotal()
Implementar exibirResumo()

Pense na ordem como algo do mundo real.
Ela possui dados (atributos) e comportamentos (métodos).
O cálculo do total ainda deve existir — mas agora deve estar dentro da própria classe.
*/

public class OrdemServico {

    String nomeC;
    String prob;
    double valorHora;
    double qtdeHora;

    //MÉTODO CONSTRUTOR 
    public OrdemServico(String nomeC, String prob, double valorHora, double qtdeHora) {
        this.nomeC = nomeC;
        this.prob = prob;
        this.valorHora = valorHora;
        this.qtdeHora = qtdeHora;
    }

    //MÉTODO calcularTotal() - DENTRO da classe OrdemServico
    public double calcularTotal() {
        return valorHora * qtdeHora;
    }

    //MÉTODO exibirResumo()
    public void exibirResumo() {
        double valorTotal = calcularTotal();

        System.out.println("\n--- RESUMO DO SERVIÇO ---");
        System.out.println("\nDigite seu nome: " + nomeC);
        System.out.println("Problema identificado: " + prob);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Horas trabalhadas: " + qtdeHora);
        System.out.println("Total a pagar: R$ " + valorTotal);
    }
    
    public class Main {
    	public static void main(String[] args) {
    		Scanner teclado = new Scanner(System.in);
    		
    		System.out.print("--- REGISTRO DE SERVIÇO ---\n");
    		System.out.print("Digite seu nome: ");
    		String nomeC = teclado.nextLine();
    		System.out.print("Informe o problema identificado: ");
    		String prob = teclado.nextLine();
    		System.out.print("Informe o valor da hora de serviço: ");
    		double valorHora = teclado.nextDouble();
    		System.out.print("Informe a quantidade de hora(s) necessária(s): ");
    		double qtdeHora = teclado.nextDouble();
    		
    		OrdemServico OrSer = new //nova instância da classe
    				OrdemServico(nomeC, prob, valorHora, qtdeHora);
    		OrSer.exibirResumo(); //OBJETO criado A PARTIR da classe OrdemServico
    		
    		teclado.close();
    	}
    }
}
