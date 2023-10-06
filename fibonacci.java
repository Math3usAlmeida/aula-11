package laçoEnquanto;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a=0, b=1,c, n, i=0;
		System.out.println("entre com o numero");
		n = in.nextInt();
		
		while(i<=n) {
			c = a+b;
			System.out.println(b);
			a = b;
			b = c;
			i++;
		}
		in.close();

	}

}
