import java.util.Scanner;

public class Exercicio1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, resto, horas, segundos, minutos;

		// Entrada do tempo de duração em segundos

		N = sc.nextInt();

		// calculo de conversão horas:minutos:segundos
		horas = N / 3600;
		resto = N % 3600;

		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();

	}

}
