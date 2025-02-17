import java.util.Scanner;



public class Exercicio1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int N, anos, mes, dias ,restoDaDivisao;
		
		N = sc.nextInt();
		
		//calculos
		
		anos = N / 365;
		restoDaDivisao = N % 365;
		mes = restoDaDivisao / 30;
		dias = restoDaDivisao% 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		
		
		sc.close();
	}

}
