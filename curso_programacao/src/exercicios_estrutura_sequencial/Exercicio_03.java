package exercicios_estrutura_sequencial;
//https://www.studocu.com/pt-br/document/centro-universitario-unifbv-wyden/progrmacao/02-exercicios-1-estrutura-sequencial/53300988?sid=345e6b11-f097-4415-8512-e15ba57013b71795397380
import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).      
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.printf("DIFERENÇA = %d", (A * B - C * D) );
		
		
		sc.close();
				
	}

}
