import java.util.Scanner;

public class Exercicio1011 {

	public static void main(String[] args) {

		// valor de pi
		double pi = 3.14159;
		
		// entrada do valor do raio da esfera

		Scanner sc = new Scanner(System.in);

		double R = sc.nextDouble();

		// calculo volume da esfera
		double volumeDaEsfera =  (((double) 4 / 3) *pi * Math.pow(R, 3.0)); // ou você pode colocar .0 o programa entende que e double não precisa fazer o casting
	
		
		//Saida do valor do volume da esfera
		
		System.out.println(String.format("VOLUME = %.3f",volumeDaEsfera));

		sc.close();

	}

}
