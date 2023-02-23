package week01;

import java.util.Scanner;

public class Day02_빙고 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];
		int size = game.length;
		int turn = 0;
		int win = 0;
		int count = 0;
		
		while(true) {
			// 게임 판 출력
			for (int i = 0; i < size; i++) {
				if (game[i] == 0) {
					System.out.print("[ ] \t");
				} else if (game[i] == 1) {
					System.out.print("[O] \t");
				} else {
					System.out.print("[X] \t");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if(count ==9) {
				win =3; // 무승부
			}
			if (win != 0) {
				System.out.println("게임종료");
				break;
			}
			// 사용자에게 값 입력 받기
			System.out.println("p" + (turn + 1) + "턴");
			System.out.println("위치: (1-9)");
			int idx = sc.nextInt();
			idx--; // 배열위치 
			if (idx < 0 || idx >= size) {
				System.out.println("다시");
				continue;
			}
			if (game[idx] != 0) {
				System.out.println("이미 선택");
				continue;
			}
			if (turn == 0) {
				// p1
				game[idx] = 1;
				turn = 1;
			} else {
				// p2
				game[idx] = -1;
				turn = 0;
			}
			// 가로
				for (int i = 0; i < size; i += 3) {
					int sum = game[i] + game[i + 1] + game[i + 2];
					if (sum == -3) {
						win = 2;
						break;
					}
					if (sum == 3) {
						win = 1;
						break;
					}
				}
				// 세로
				for (int i = 0; i < size - 6; i++) {
					int sum = game[i] + game[i + 3] + game[i + 6];
					if (sum == -3) {
						win = 2;
						break;
					}
					if (sum == 3) {
						win = 1;
						break;
					}
				}
				// 대각선 /
				int sum1 = game[2] + game[4] + game[6];
				// 대각선 \
				int sum2 = game[0] + game[4] + game[8];
				if (sum1 == 3 || sum2 == 3) {
					win = 1;
				}
				if (sum1 == -3 || sum2 == -3) {
					win = 2;
				}
				count++; // 플레이횟수 합산
			}
			if (win == 1) {
				System.out.println("P1 : O 승리");
			} else if (win == 2) {
				System.out.println("P2 : X 승리");
			} else {
				System.out.println("무승부");
			}

		
				
	}

}
