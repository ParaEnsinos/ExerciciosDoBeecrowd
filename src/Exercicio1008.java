import java.util.Scanner;

public class Exercicio1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int numeroHorasTrabalhadas = sc.nextInt();
		
		double valorRecebePorHora = sc.nextDouble();
		
		double salario = numeroHorasTrabalhadas * valorRecebePorHora ;
		
		System.out.println("NUMBER = "+numeroFuncionario);
		System.out.println(String.format("SALARY = U$ %.2f",salario));

	}

}
