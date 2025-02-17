import java.util.Scanner;

public class Exercicio1021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N, resto, restoMoedas;
		int divisaoNotas, nota, divisaoMoedas, moedas;

		N = sc.nextDouble();

		// Calculo notas
		resto = N;

		// Nota 100
		nota = 100;
		divisaoNotas = (int) resto / nota;
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto = resto % 100;

		// nota 50
		nota = 50;
		divisaoNotas = (int) resto / 50;
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto = resto % 50;

		// nota 20
		nota = 20;
		divisaoNotas = (int) resto / 20;
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto = resto % 20;

		// nota 10
		nota = 10;
		divisaoNotas = (int) resto / 10;
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto= resto % 10;

		// nota 5
		nota = 5;
		divisaoNotas = (int) resto / 5;
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto= resto % 5;

		// nota 2
		nota = 2;
		divisaoNotas = (int) resto / 2;
		System.out.printf("%d nota(s) de R$ %d.00%n", divisaoNotas, nota);
		resto = resto % 2;

		// moedas

		// moedas 100
		restoMoedas = N;
		moedas = 100;
		divisaoMoedas = (int) restoMoedas / moedas;
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", divisaoMoedas, moedas);
		resto = resto % moedas;

		// moeda 50
		moedas = 50;
		divisaoMoedas = (int) resto / moedas;
		System.out.printf("%d moeda(s) de R$ 0.50%n", divisaoMoedas, moedas);
		resto = resto % moedas;

		// moedas 25
		moedas = 25;
		divisaoMoedas = (int) resto / moedas;
		System.out.printf("%d moeda(s) de R$ 0.25%n", divisaoMoedas, moedas);
		resto = resto % moedas;

		// moedas 10
		moedas = 10;
		divisaoMoedas = (int) resto / moedas;
		System.out.printf("%d moeda(s) de R$ 0.10%n", divisaoMoedas, moedas);
		resto = resto % moedas;

		// moedas 5
		moedas = 5;
		divisaoMoedas = (int) resto / moedas;
		System.out.printf("%d moeda(s) de R$ 0.05%n", divisaoMoedas, moedas);
		resto = resto % moedas;
		
		System.out.println((int)resto + " moeda(s) de R$ 0.01");

		sc.close();

	}

}
