package week01;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println((250*12)-(250*12*0.15));
		// 문제2) 시험점수를 30, 50, 40점 을 받았다. 평균은?
		System.out.println((30+50+40)/3);
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println(3*6/2);
		// 문제4) 100초를 1분 40초로 출력 <<<<<<<<
		System.out.println(100/60+"분"+100%60+"초");
		// 문제5) 800원에서 500원짜리 개수 , 800에서 500원을뺀 100원짜리 개수 출력
		System.out.println("500원 "+ (800/500) + "개 100원 " + (800%500/100) + "개");

		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10.0 / 3); // 실수정수계산시 실수나온다
		System.out.println(10 % 3);
		
		System.out.println("결과"+ 10 + 3); 
        // 문자가 앞에 있고 뒤에 숫자있으면 다 문자로 인식 <<<<<
	}

}
