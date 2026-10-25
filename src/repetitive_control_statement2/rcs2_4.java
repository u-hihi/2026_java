package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++){
			int a = sc.nextInt();
			sum += a;
		}
		double avg = (double)sum / n;
		System.out.printf("%.2f", avg);
	}
}
