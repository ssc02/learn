package week01;

import java.util.Scanner;

public class Day02_미니마블배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 같은 배열 = 잡힌다 총 3바퀴 종료
		int[] game = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p1 = { 1, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 2, 0, 0, 0, 0, 0, 0, 0 };

		boolean turn = true;
		// turn == true : p1 false = p2

		int idx1 = 0; // p1 위치
		int idx2 = 0; // p2 위치
		int play1 = 1; // 말
		int play2 = 2; // 말
		int p1cnt = 0; // 턴 수
		int p2cnt = 0; // 턴수
		int size = game.length;

		while (true) {
			// 게임 화면 출력
			System.out.printf(" turn [ %d: %d ] \n", p1cnt, p2cnt);
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				if (p1[i] == play1) {
					System.out.print("옷");
				} else {
					System.out.print("__");
				}
			}

			System.out.println();
			for (int i = 0; i < size; i++) {
				if (p2[i] == play2) {
					System.out.print("옷");
				} else {
					System.out.print("__");
				}
			}

			if (p1cnt == 3 || p2cnt == 3) {
				break;
			}

			System.out.println();
			System.out.println("값 입력: ");
			int move = sc.nextInt();
			if (move < 1 || move > 3) {
				System.out.println("입력 오류");
				continue;
			}
			int px = 0;
				
//			if (turn) {
//				System.out.println("p1 턴");
//				px = idx1;
//			} else {
//				System.out.println("p2 턴");
//				px = idx2;
//			}

				// 삼항연산자 -> 한줄짜리 조건문 : 미니if <<<<<<<<<
				// 조건식 ? 참값 : 거짓값
				// 한계는 삼항연산자를 통해서 값할당(=대입연산자) 사용 못한다

			// 밑에 삼항 연산자로 위에 식을 축소 시킴 

			System.out.println(turn? "p1턴" : "p2턴");
			px = turn ? idx1 : idx2 ;

			px += move;
			         // 8
			if (px >= size) {
				// px-=size; // 9-8 1 px = px - size;
				px %= size; // 8%8 = 0 9%8 = 1

				if (turn) {
					p1cnt++; // 값할당은 삼항연산자 못씀 
				} else {
					p2cnt++;
				}
			}

			if (turn) {
				p1[idx1] = 0; // 기존 자리를 0으로 바꾼후 이동자리 변경
				idx1 = px;
				p1[idx1] = play1;
				if (idx1 == idx2) {
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = play2;
					System.out.println("p2잡았다");
				}
			} else {
				p2[idx2] = 0;
				idx2 = px;
				p2[idx2] = play2;

				if (idx2 == idx1) {
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = play1;
					System.out.println("p1잡았다");
				}
			}
			// && and || or ! not      ! 표는 낫 연산자이다
			// ! true -> false false-> true
			turn = !turn;

		} // while 종료

		// 삼항연산자 조건? 참 : 거짓

		// String win = p1cnt == 3 ? "p1이겼다" : "p2이겼다";

		// System.out.println(win);

		System.out.println("게임종료 ");
		System.out.println(p1cnt == 3 ? "p1이겼다" : "p2이겼다");
	}

}
