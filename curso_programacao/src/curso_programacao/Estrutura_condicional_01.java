package curso_programacao;

import java.util.Scanner;

public class Estrutura_condicional_01 {

	public static void main(String[] args) {
		// Estrutura condicional simples
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.print("Informe a hora: ");
		hora = sc.nextInt();
		
		if(hora<12) {
			System.out.println("Bom dia!");
			
		} else if (hora< 18){
			System.out.println("Boa tarde!");
			
		} else {
			System.out.println("Boa Noite!");
		}
		
		sc.close();

	}

}
