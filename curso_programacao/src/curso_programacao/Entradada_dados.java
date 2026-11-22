package curso_programacao;

import java.util.Scanner;

public class Entradada_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
        // Consome a quebra de linha pendente
        sc.nextLine();
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.printf("Seu nome é %s%n", nome);
		sc.close();
	}

}
