package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		int sum = 0;
		int cnt = 0;

		for (int i = min; i <= max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				cnt++;
			}
		}

		double avg = (cnt == 0) ? 0 : (double) sum / cnt;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
