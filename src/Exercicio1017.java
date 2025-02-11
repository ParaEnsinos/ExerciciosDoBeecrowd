import java.util.Scanner;

public class Exercicio1017 {

	public static void main(String[] args) {
		
		
		//Entrada de Informações
		Scanner sc = new Scanner(System.in);
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		//calculo
		double quantidadeDeLitros =  ((double)velocidadeMedia / 12) * tempoGasto;
		
		//Saida 
		System.out.println(String.format("%.3f",quantidadeDeLitros));
		
		
		sc.close();
	

	}

}
