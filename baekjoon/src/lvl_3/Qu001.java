package lvl_3;

import java.util.Scanner;

public class Qu001 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}
	}

}
