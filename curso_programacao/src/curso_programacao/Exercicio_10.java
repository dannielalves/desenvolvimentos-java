package curso_programacao;

import java.util.Scanner;

public class Exercicio_10 {
		//Versão3 - não aceita minutos negativos
	public static void main(String[] args) {
		/*
		 Uma operadora de telefonia cobra R$ 50,00 por um plano básico
		 que dá direito a 100 minutos de telefone. Cada minuto que exceder
		 a franquia de 100 minutos custa R$ 2,00. Fazer um programa para ler
		 a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		 * */
		Scanner sc = new Scanner(System.in);
		
		double preco = 50,  franquia = 100, preco_excedente = 2, consumo, fatura;
		System.out.print("Informe o consumo em minutos: ");
		consumo = Math.abs(sc.nextDouble());
		//condição
		if(consumo <= franquia) {
			preco_excedente = 0;
		}
		
		fatura = preco + (consumo - franquia) * preco_excedente;
		
		System.out.printf("Valor a pagar: R$ %.2f", fatura);
		
		
		sc.close();
	}

}
