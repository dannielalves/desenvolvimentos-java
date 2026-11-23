package curso_programacao;
//testetv986534
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		double primeiro_numero;

		double segundo_numero;

		String operacao;


		boolean operacaoValida = true;

		// Quero que você construa uma calculadora que execute as quatro operações matemáticas.

		Scanner sc = new Scanner(System.in);

		boolean condicao=true;

		String resposta;

		while(condicao) {
				
				operacaoValida = true;	
				double resultado = 0;
				
				System.out.printf("%n¬¬¬¬¬¬¬¬¬CALCULADORA¬¬¬¬¬¬¬¬¬¬%n");

				System.out.print("Primeiro número: ");

				primeiro_numero = sc.nextDouble();

				System.out.print("Segundo número: ");

				segundo_numero = sc.nextDouble();

				System.out.printf("Escolha a operação:%n+ Adição%n- Subtração%n* Multiplicação%n/ Divisão%n");

				System.out.print("Operação: ");

				operacao = sc.next();

				switch (operacao) {

			    case "+":

			        resultado = primeiro_numero + segundo_numero;

			        break;

			    case "-":

			        // Código da subtração

			    	resultado = primeiro_numero - segundo_numero;

			        break;

			    case "*":

			        // Código da multiplicação

			    	resultado = primeiro_numero * segundo_numero;

			        break;

			    case "/":

			        // Código da divisão

		            if (segundo_numero != 0) {

		                resultado = primeiro_numero / segundo_numero;

		            } else {

		                System.out.println("Erro: divisão por zero!");

		                operacaoValida = false;

		            }	    	

			        break;	        

			    default:

			        // Operação inválida

			    	System.out.println("Operação inválida!");

			    	operacaoValida = false;

			}

				if (operacaoValida) {

				System.out.printf("%nResultado: %.2f", resultado);

				}

				System.out.printf("%nDeseja realizar outra operação? (S/N)%n");

				resposta = sc.next();

				if(resposta.equalsIgnoreCase("s")) { //if(resposta.equals("s") || resposta.equals("S")) {
					condicao = true;

				} else {

					condicao = false;

				System.out.println("Programa encerrado");

				}

				

			}

		sc.close();

	}

}