import java.util.Locale;
import java.util.Scanner;

public class Exercicio1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1, y1, x2, y2;
		double distancia;

		// Entrada de Dados
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		// calculo v = Math.sqrt(Math.pow(x2 - x1,2.0) + Math.pow(y2 + y1,2.0))
		distancia = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

		// Saida de Dados
		System.out.printf("%.4f%n", distancia);

		sc.close();

	}

}
