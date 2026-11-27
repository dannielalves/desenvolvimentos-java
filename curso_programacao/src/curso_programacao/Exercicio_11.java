package curso_programacao;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// Estrutura de repetição While - Enquanto
		/*Fazer um programa que lê números interiros até um zero ser lido, 
		 * ao final mostra a soma dos números lidos*/
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int soma = 0;
		while(num != 0) {
			soma += num;
			num = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
