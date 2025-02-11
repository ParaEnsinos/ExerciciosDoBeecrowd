import java.util.Scanner;

public class Exercicio1006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada dos valores
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//calculo da média
		double media = ((a * 2) + (b * 3) + (c * 5))/10;
		
		//Saida dos resultados
		System.out.println(String.format("MEDIA = %.1f",media));
		
	}

}
