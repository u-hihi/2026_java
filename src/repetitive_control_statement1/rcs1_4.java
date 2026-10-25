	package repetitive_control_statement1;

import java.util.Scanner;

public class rcs1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int cnt = 0;

		do {
			a = sc.nextInt();
			if (a % 3 == 0 || a % 5 == 0) {
			} else {
				cnt++;
			}
		} while (a != 0);

		System.out.print(cnt);
	}
	
}
