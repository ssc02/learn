package week01;

import java.util.Random;
import java.util.Scanner;

public class Day02_변수주기랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		/*int num = 10; 
		//변수가 사라지는 시점 -> main { }영역이 끝나면 변수가 사라진다
		
		if(num %2 == 0) {
			
			int even = num; //if문 영역 안에서 변수를 생성 
			int odd = num+1;
			System.out.println(even);
			System.out.println(odd);
		}*/
		
		/*		System.out.println("정수 1 입력: ");
				int inputNum = scan.nextInt(); //사용자에게 정수값을 입력받아옴
				int randNum = rd.nextInt(10); // int 범위에서 무작위로 랜덤값 1개 가져옴 
				randNum = rd.nextInt(10)+1; // 랜덤값 범위 1~ 10 사이에서 아무 숫자 1개를 가져온다
				System.out.println(inputNum +" " +randNum);
		*/
		
		// if문 1개 
		System.out.println(" [ 과일 ] ");
		System.out.println("1. 사과");
		System.out.println("2. 바나나");
		System.out.println("3. 포도");
		System.out.println("메뉴 선택 >>");
//		if(){} 이 중간에 다른 코드 못온다 else{}
			int sel = scan.nextInt();	
			if(sel == 1) {
				System.out.println("[사과 선택]");
			}else if(sel == 2) {
				System.out.println("[바나나 선택]");
			}else if(sel == 3) {
				System.out.println("[포도 선택]");
			}else {
				System.out.println("[입력 오류]");
			}
		
	}

}
