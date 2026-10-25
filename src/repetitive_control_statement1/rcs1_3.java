package repetitive_control_statement1;

import java.util.Scanner;

public class rcs1_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int sum = 0;
		int cnt = 0;
		a = sc.nextInt();
		while(a <= 100 && a >= 0){
			cnt++;
			sum += a;
			a = sc.nextInt();
		}
		double avg = (double)sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", avg);
	}
	
}
