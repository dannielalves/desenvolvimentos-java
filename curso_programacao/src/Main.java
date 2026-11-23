import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 35;
		double salario = 4000.0;
		double x = 14.4417815;
		// Imprimir na tela uma mensagem
		System.out.println("Olá mundo!");
		System.out.println("Boa tarde!");
		System.out.println("Idade: " + idade);
		System.out.println("Número X: " + x); // Sem formatação
		System.out.printf("Número X: %.4f%n", x); // Formatado com duas casas decimais
		System.out.printf("Número X: %.1f com 3 casas decimais (arredondado)%n", x); // Formatado com uma casa decimal
		Locale.setDefault(Locale.US); // Formatação padrão americano
		System.out.printf("Número X: %.2f%n", x);
		System.out.println("#############################################");
		System.out.printf("Resultado: %.2f metros de comprimento.%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, salario);
	}

}
