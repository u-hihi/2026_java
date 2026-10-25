package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 1; i <= 10; i++){
			int n = sc.nextInt();
			if(n % 2 == 0){
				cnt1++;
			}
			if(n % 2 == 1){
				cnt2++;
			}
		}
		System.out.println("even : " + cnt1);
		System.out.println("odd : " + cnt2);
	}
}
