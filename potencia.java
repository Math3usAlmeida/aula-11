package laçoEnquanto;
import java.util.Scanner;
public class potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double base, potencia, resultado = 1;
		int expoente;
		
		System.out.println("digite o expoente");
		expoente = in.nextInt();
		
		System.out.println("digite a base");
		base = in.nextDouble();
		
		while(expoente > 0) {
			resultado *= base;
			expoente--;
		}
		
		System.out.println("o expoente é " + resultado);
		
	in.close();
		
	}

}
