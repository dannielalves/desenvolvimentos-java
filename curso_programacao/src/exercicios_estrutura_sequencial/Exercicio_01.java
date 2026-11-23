package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa
		int a, b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b =sc.nextInt();
		System.out.printf("SOMA = %d", a+b);		
		
		sc.close();

	}

}
