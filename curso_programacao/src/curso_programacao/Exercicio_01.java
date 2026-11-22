package curso_programacao;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		String primeiro_nome;
		int idade;
		String cidade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		primeiro_nome = sc.next();
		sc.nextLine();
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite sua cidade: ");
		cidade = sc.nextLine();
		
		System.out.printf("%n-_-_-_-_SEUS DADOS-_-_-_-_-_-_%n");
		System.out.printf("Nome: %s%n", primeiro_nome);
		System.out.printf("Idade: %d anos%n", idade);
		System.out.printf("Cidade: %s%n", cidade);
		
		sc.close();
		
	}

}
