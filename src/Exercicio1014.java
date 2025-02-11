import java.util.Scanner;

public class Exercicio1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // distância total percorrida
		double y = sc.nextDouble(); // total de combustível gasto
		
		double consumoMedio = x / y;
		
		System.out.println(String.format("%.3f km/l",consumoMedio));
		
		sc.close();
	}

}
