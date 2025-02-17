
import java.util.Scanner;

public class Exercicio1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner (System.in);
		int k,t;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();	
		
		// calculo
		k = (x + y + Math.abs(x - y)) / 2;
		
		t = (k + z + Math.abs(k - z)) / 2;
		
		System.out.println(t + " eh o maior");
		
		sc.close();
	}

}
