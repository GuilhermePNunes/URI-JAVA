package iniciante;

import java.util.Scanner;

public class Ex1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		System.out.println("X = " + (a+b));
	}
}
