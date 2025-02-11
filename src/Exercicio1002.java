import java.util.Locale;
import java.util.Scanner;

public class Exercicio1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f",area)); // aqui vai retornar um string formatada
		
		sc.close();

	}

}
