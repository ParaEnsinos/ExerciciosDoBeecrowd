import java.util.Scanner;

public class Exercicio1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		//entrada de dados nome do vendedor/ sálario fixo / vendas efetuadas mês
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendaEFetuadasMes = sc.nextDouble();
		
		//calculo do total a receber no final do mês
		double totalAReceber = salarioFixo + (vendaEFetuadasMes*(15.0/100.0));
		
		
		//Saida do valor total 
		System.out.println(String.format("TOTAL = R$ %.2f",totalAReceber));
	
		
		sc.close();
	}

}
