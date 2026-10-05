package selection_control_statement;

import java.util.Scanner;

public class scs3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.print("leap year");
		} else {
			System.out.print("common year");
		}

	}

}

/*
선택제어문 - 형성평가3
년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
예제:
입력
2008
출력
leap year
*/
