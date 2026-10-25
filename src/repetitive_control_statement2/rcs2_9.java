package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++){
			for (int j = 1; j <= a; j++){
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}
}
