import java.util.Scanner;

public class Exercicio1010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorAPagar = numeroPeca1 * valorUnitarioPeca1 + numeroPeca2 * valorUnitarioPeca2;
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f",valorAPagar));
		
		
		sc.close();

	}

}
