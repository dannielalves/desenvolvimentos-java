package curso_programacao;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		// Objetivo: solicitar um número ao usuário e apresentar sua tabuada de 1 até 10.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		System.out.printf("%nTabuada do %d%n", num);
		for(int i = 1;i<=10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num * i);
		}
		
		
		
		
		
		sc.close();
	}

}
