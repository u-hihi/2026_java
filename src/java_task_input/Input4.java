package java_task_input;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("sum = %d", a + b + c);
    }
}

/*
입력-형성평가4
세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
예제
입력 20 50 100
출력 sum = 170
입력 3 2 1
출력 sum = 6
 */