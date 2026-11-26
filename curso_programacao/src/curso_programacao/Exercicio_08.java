package curso_programacao;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		/*
		 Uma operadora de telefonia cobra R$ 50,00 por um plano básico
		 que dá direito a 100 minutos de telefone. Cada minuto que exceder
		 a franquia de 100 minutos custa R$ 2,00. Fazer um programa para ler
		 a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		 * */
		double minutos,fatura, preco = 50, franquia = 100,  extra = 2.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Minutos consumidos: ");
		minutos = sc.nextDouble();
		if(minutos <=franquia) {
			extra = 0;
			fatura = preco + (minutos - franquia) * extra;
			System.out.printf("Valor a pagar: R$ %.2f", fatura);
		} else {
			extra = 2;
			fatura = preco + (minutos - franquia) * extra;
			System.out.printf("Valor a pagar: R$ %.2f", fatura);
		}
		
		sc.close();

	}

}
