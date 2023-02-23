package week01;

import java.util.Scanner;

public class Day02_입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*		int num = 100;
				
				System.out.println("num="+num);
				System.out.println("나이입력:");
				int age = scan.nextInt();
				System.out.println("age="+age);
		*/
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		
		System.out.println("첫번쨰 숫자 입력 : ");
		int a = scan.nextInt();
		System.out.println("두번쨰 숫자 입력 : ");
		int b = scan.nextInt();
		int c = a + b;
		System.out.printf("두 수의합 : %d \n",c);
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자하나입력 홀수판단");
		int d = scan.nextInt();
		System.out.println(d%2 == 1);
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적입력 : ");
		int e = scan.nextInt();
		System.out.println(e>=60 && e<=100);
	}

}
