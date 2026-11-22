package curso_programacao;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		if(idade<18) {
			System.out.println("Você é menor de idade.");
		} else {
			System.out.println("Você é maior de idade.");
		}
		
		sc.close();
	}

}