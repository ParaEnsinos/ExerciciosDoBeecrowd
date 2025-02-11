import java.util.Scanner;

public class Exercicio1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		int minutos = (60 * km) / 30 ;
		
		System.out.println(minutos+" minutos");
		sc.close();
	}

}
