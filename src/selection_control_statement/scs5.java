package selection_control_statement;

import java.util.Scanner;

public class scs5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		switch (year) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("30");
				break;
			case 2:
				System.out.print("28");
				break;
		}

	}

}

/*
선택제어문 - 형성평가5
평년의 월로 1 ~ 12사이의 정수만 입력값으로 주어진다. 
이를 입력받아 월의 날수를 출력하는 프로그램을 작성하시오.
예제:
입력
2
출력
28
*/