package week01;

import java.util.Scanner;

public class Day02_배열응용1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		// 인덱스(방번호) 0   1   2   3   4
		int[] arr = { 87, 11, 45, 98, 23 };
		// 문제1) 인덱스를 입력받아 성적 출력
		System.out.println(arr.length);
		while(true) {
			System.out.println("인덱스 입력 : ");
			int num = sc.nextInt();
			if(num < 0 || num >= arr.length) {
				System.out.println("0~4입력하세요");
				continue;
			}
			System.out.println("인덱스 "+num+"의 성적은 :" + arr[num]);
			break;
		}
		*/
		/*
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		//  log = 0 --> 배열에서 index 
		                     // 0    1     2      3    4 
			int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
			int[] scores = { 87, 11, 45, 98, 23 };
			
			System.out.println("성적 입력>> ");
			int score = sc.nextInt();
			for(int i = 0; i<hakbuns.length; i++) {
				if(score == scores[i]) {
					System.out.println(scores[i]+"점의 학생 학번은 : "+hakbuns[i]);
					break;
				}
			}
		*/
		/*
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점	
			int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
			int[] scores = { 87, 11, 45, 98, 23 };
			System.out.println("학번 입력 : ");
			int hakbun = sc.nextInt();
			for(int i=0;i<hakbuns.length;i++) {
				if(hakbuns[i] == hakbun) {
					System.out.println(scores[i]);
					break;
				}
				if(i==hakbuns.length-1) {
					System.out.println("없는학번");
				}
			}
			*/
		/*	
			// 문제4) 학번을 입력받아 성적 출력 단, 없는학번 입력 시 예외처리
			// 예)
			// 학번 입력 : 1002		성적 : 11점
			// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
				int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
				int[] scores = { 87, 11, 45, 98, 23 };
				int check = -1;
				System.out.println("학번입력 : ");
				int hak = sc.nextInt();
				for(int i=0; i<hakbuns.length;i++) {
					if(hak==hakbuns[i]) {
						check = i;
						break;
					}
				}
				if(check==-1) {
					System.out.println("없는학번");
				} else {
					System.out.println(hakbuns[check]+"학번의 점수는 "+scores[check]);
				}
				*/
		// 문제 5) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
			int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
			int[] scores = { 87, 11, 45, 98, 23 };
			int max = scores[0];
			int maxhak = 0;
			for(int i=0;i<scores.length;i++) {
				if(scores[i] > max) {
					max = scores[i];
					maxhak = i;
				}
			}
			System.out.println(hakbuns[maxhak]+"번("+max+"점)");
	}

}
