package selection_control_statement;

import java.util.Scanner;

public class scs2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a == 0) {
			System.out.print("zero");
		} else if (a > 0) {
			System.out.print("plus");
		} else {
			System.out.print("minus");
		}

	}

}
/*
선택제어문 - 형성평가2
정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
예제:
입력
0
출력
zero
*/
