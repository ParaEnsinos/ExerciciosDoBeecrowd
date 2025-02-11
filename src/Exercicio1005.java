//import java.util.Locale;
import java.util.Scanner;

public class Exercicio1005 {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A= sc.nextDouble();
		double B = sc.nextDouble();
		
		//CALCULAR A MÉDIA
		double media = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.println(String.format("MEDIA = %.5f",media));
		sc.close();
		

	}

}
