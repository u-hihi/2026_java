package operator;

import java.util.Scanner;

public class operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		a += 5;
		b *= 2;

		System.out.printf("width = %d\n", a);
		System.out.printf("length = %d\n", b);
		System.out.printf("area = %d\n", a * b);

	}

}

/*
연산자 - 형성평가3
직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 
가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
예제:
입력
20 15
출력
width = 25
length = 30
area = 750
*/
