package week01;

public class Day3_자바변수부터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.1412345678911;  // 정밀한 소수계산 double
		float f = 3.1412345678f;
		System.out.println(d);
		System.err.println(f);
		
		int i = 100000;  // int -21억~21억 정도표시 int 범위를 벗어남
		long l = 100000000000L; // long > int 자료형변수
		l = 1_000_000_000_000L;
		System.out.println(l);
		
		/*
		변수 이름 짓는법
		1. 저장값에 어울리는 이름
		2. _ 밑줄, 문자, 숫자 사용가능(공백안댐) 
		3. 밑줄 또는 문자로 시작
		4. 한단어 또는 연속의 단어로 
		5. 소문자로 시작 두개이상 단어시 첫단어 대문자(첫단어는 제외)
		6. 예약어 사용불가
		*/
		String nationality = "대한민국";
		String firstName = "철수";
		String lastName = "김";
		String dateOfBirth = "2001-3-31";
		String residentialAddress = "x호텔";
		String _flightNo = "KEF33";
		String flight_2_no = "KEFF32";
		//
		int accompany = 2;
		int lengthOfStay = 5;
		// 절대 변하지 않는 상수는 대문자로
		final String CODE = "KR"; // 변하지않는값 final 키워드
		final double PI = 3.14;
		final String dateBirth = "2000-11-12";
		
		
	}

}
