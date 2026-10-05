package selection_control_statement;

import java.util.Scanner;

public class scs1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < b) {
			System.out.printf("%d", b - a);
		} else {
			System.out.printf("%d", a - b);
		}

	}

}

/*
선택제어문 - 형성평가1
두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
예제:
입력
50 85
출력
35
*/
