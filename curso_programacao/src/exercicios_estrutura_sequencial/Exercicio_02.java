package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
		Scanner sc = new Scanner(System.in);
		double raio, area;
		double pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("%.4f",area);
		
		
		sc.close();
				
	}

}
