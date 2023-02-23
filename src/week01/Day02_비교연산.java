package week01;

public class Day02_비교연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모두 true
		/*System.out.println(10 != 3);
		System.out.println(3 < 8);
		System.out.println(5 < 38);
		System.out.println(12 > 3);
		System.out.println(11 == 11);
		System.out.println(3 != 10);		
		int num1 = 17;
		System.out.println(num1 %3 == 0 );
		int num2 = 28;
		System.out.println(num2 %2 == 0);
		System.out.println(num2 %2 != 1);*/
		// 3과목의 평균이 60점 이상이면, true   // 1개 
		// 단, 어느 한 과목이라도 50점 미만이면, false // 조건 3개 
		// 총 조건이 4개가 논리연산자로 연결이 되어야 한다 
		int kor = 100;
		int eng = 87;
		int math = 41;
		double avg = (kor + eng + math)/3.0;
		
		System.out.println(avg>=60 && (kor>=50 && eng>=50 && math>=50));
		
		// 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
		int height1 = 199;
		int weight1 = 199;

		int height2 = 200;
		int weight2 = 68;
		System.out.println(height1>=200 || weight1 >=200);
		System.out.println(height2>=200 || weight2 >=200);

	}

}
