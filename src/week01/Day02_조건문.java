package week01;

import java.util.Scanner;

public class Day02_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 조건문은 조건에 개수에 따라 만들어 주기 
	//  단 논리연산자는 조건문 1개로만 가능 

	// 숫자값이 20보다 작니 숫자값이 10보다 크니 
		Scanner scan = new Scanner(System.in);
	// 1.사용자에게 정수값을 1개 입력받기    
		System.out.println("정수 1개 입력 : ");
		int a = scan.nextInt();
	// 2. 그 값이 양수 , 0, 음수 조건문을 만들어서 출력  
	//예)  4 --> 양수    -5 --> 음수  0 -->  0 출력 
		if(a>0) {
			System.out.println(a + " --> 양수");
		}
		if(a==0) {
			System.out.println(a + " --> 0");
		}
		if(a<0) {
			System.out.println(a + " --> 음수");
		}
	// 2. 사용자에게 정수값 1개 입력받아서  5의 배수이면 5의 배수라고 출력
		System.out.println("정수 1개 입력 : 5배수체크");
		int b = scan.nextInt();
		if(b%5 == 0) {
			System.out.println("5의배수입니다");
		}
		if(b%5 !=0) {
			System.out.println("5배수아닙니다");
		}
	// 3. 사용자에게 점수값을 입력받아서 60점 이상이면 합격 출력
	// 60점 미만 -> 불합격 
	  // 점수 음수, 100보다 크지 않다는 예외처리 : 점수값이 올바르지않습니다
		System.out.println("성적 입력 : ");
		int c = scan.nextInt();
		if(c<60 && c >= 0) {
			System.out.println("불합격");
		}
		if(c>=60 && c<=100) {
			System.out.println("합격");
		}
		if(c>100 || c < 0) {
			System.out.println("점수값 확인");
		}
	}

}
