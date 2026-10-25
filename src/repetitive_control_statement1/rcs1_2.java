package repetitive_control_statement1;

import java.util.Scanner;

public class rcs1_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;
        int num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 1) {
                odd++;
            } else {
                even++;
            }

            num = sc.nextInt();
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);

        sc.close();
    }
}
