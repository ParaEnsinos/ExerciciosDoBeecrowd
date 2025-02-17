import java.util.Locale;
import java.util.Scanner;

public class Exercicio1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		// calculos
		// area do triangulo
		double areaDoTriangulo = A * C / 2.0;

		// a área do círculo de raio a = pi * r^2
		double areaDoCiruculoRaio = pi * Math.pow(C, 2.0);

		// a area do trapezio A + B * C / 2
		double areaDoTrapezio = ((A + B) * C) / 2.0;

		// a área do quadrado que tem lado B
		double areaDoQuadrado = B * B ;

		// a área do retângulo que tem lados A e B.
		double areaDoRetrangulo = A * B ;
		
		//SAIDA DOS VALORES
		
		System.out.printf("TRIANGULO: %.3f%n",areaDoTriangulo);
		System.out.printf("CIRCULO: %.3f%n",areaDoCiruculoRaio);
		System.out.printf("TRAPEZIO: %.3f%n",areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f%n",areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f%n",areaDoRetrangulo);
		
		
		sc.close();
	}

}
