package repetitive_control_statement1;

import java.util.Scanner;

public class rcs1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		while(a >= b){
			System.out.printf("%d ", b);
			b++;
		}
	}
}
