package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = Math.max(a, b);
		int min = Math.min(a, b);

		for(int i = 1; i < 10; i++){
			int dan = a;
			for(int j = min; j <= max; j++){
				System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
				
				if(a > b){
					dan--;
					
				} else {
					dan++;
				}
			}
			System.out.println();
		}
	}
}
