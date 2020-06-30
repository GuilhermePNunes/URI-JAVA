package iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat casas = new DecimalFormat("0.0000");
		
		double raio = in.nextDouble();
		
		in.close();
		
		double n = 3.14159;
		
		double a = (raio*raio)*n;
		
		
		
		System.out.println("A=" + casas.format(a));
		System.out.printf("A=%.4f", a);
		
	}

}
