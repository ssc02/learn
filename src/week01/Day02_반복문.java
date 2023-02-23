package week01;

import java.util.Scanner;

public class Day02_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i= i+1;			
		}*/
		
		/*		int total = 0;
				int i = 1;
				int cnt = 0;
				while(i<=10) {
					total = total + i;
					i = i+1;
					cnt = cnt+1;
				}
				System.out.println("총합 : " + total);
				System.out.println("반복횟수 : " + cnt);
		*/
		// 무한 반복문
		Scanner sc = new Scanner(System.in);
		/*boolean run = true; // 실행하다, 운영하다
		System.out.println("무한반복문 실행 1");
		while(run == true) {
			System.out.println("-100입력 종료");
			int num = sc.nextInt();
			if(num == -100) {
				run = false; // run false 값을 넣은거 
			}
			System.out.println("num= " + num);
		}*/
		
		/*
		System.out.println("무한반복문 실행 2");
		while(true) {
			System.out.println("-100입력 종료");
			int num = sc.nextInt();
			if(num == -100) {
				break; // 반복문 즉시 종료 
				// 밑에줄은 다 무시 바로 종료 된다 
			}
			System.out.println("num= " + num);
		}
		
		System.out.println("반복문 종료");*/
		
		int dbid = 1234;
		int dbpw = 1111;
		
		int menu = 0;
		while(true) {
			System.out.println("==메뉴 ==");
			System.out.println(" 3. 로그인 ");
			
			menu = sc.nextInt();
			if(menu != 3) {
				continue;
			}
			
			System.out.print("ID : ");
			int id = sc.nextInt();
			System.out.print("PW : ");
			int pw = sc.nextInt();
			
			if(dbid != id || dbpw != pw) {
				if(dbid != id) {
					System.out.println("아이디 불일치");
				}
				if(dbpw != pw) {
					System.out.println("비밀번호 불일치");
				}
				System.out.println("로그인실패");
				continue;
			}
			System.out.println("로그인성공");
			break;
		}
		
	}

}
