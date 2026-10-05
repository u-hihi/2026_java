package operator;

import java.util.Scanner;

public class operator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.printf("sum %d\n", a + b + c + d);
		System.out.printf("avg %d\n", (a + b + c + d)/4);
	}

}

/*
연산자 - 형성평가1
국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
예제:
입력
70 95 63 100
출력
sum 328
avg 82
 */

