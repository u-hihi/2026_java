package selection_control_statement;

import java.util.Scanner;

public class scs4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		switch (a) {
			case 1:
				System.out.print("Number? dog");
				break;
			case 2:
				System.out.print("Number? cat");
				break;
			case 3:
				System.out.print("Number? chick");
				break;
			default:
				System.out.print("Number? I don't know.");
		}

	}

}

/*
선택제어문 - 형성평가4
1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
해당 번호가 없으면 "I don't know."라고 출력한다.
개-dog
고양이-cat
병아리-chick​ 
예제:
입력
Number? 2
출력
cat
*/
