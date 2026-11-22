
public class Main {

	public static void main(String[] args) {
		int idade = 35;
		double x = 14.4567815;
		// Imprimir na tela uma mensagem
		System.out.println("Olá mundo!");
		System.out.println("Boa tarde!");
		System.out.println("Idade: "+idade);
		System.out.println("Número X: "+x); //Sem formatação
		System.out.printf("Número X: %.2f%n", x); //Formatado com duas casas decimais
		System.out.printf("Número X: %.1f com 3 casas decimais%n", x);

	}

}
