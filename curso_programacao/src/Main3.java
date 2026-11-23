import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		System.out.printf("O número interiro informado foi %d%n", x);

		double y;
		System.out.print("Digite um número com ponto flutuante: ");
		y = sc.nextDouble();
		System.out.printf("O número Double informado foi %.2f%n", y);

		char z;
		System.out.print("Digite um caractere: ");
		z = sc.next().charAt(0);
		System.out.printf("O caractere informado foi: %s%n", z);

		sc.close();

	}

}
