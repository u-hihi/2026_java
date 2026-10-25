package repetitive_control_statement2;

import java.util.Scanner;

public class rcs2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
