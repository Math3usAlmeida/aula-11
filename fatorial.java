package laçoEnquanto;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double  n, f;
		System.out.println("entre com o numero que deseja saber o Fatorial");
		f = in.nextDouble();
		
		n = f;
		
		while(n > 1) {
			f = f *(n-1);
			n--;
			
		}
		System.out.println("o Fatorial é "+f);
		in.close();
	}

}
