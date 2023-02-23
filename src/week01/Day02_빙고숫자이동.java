package week01;

import java.util.Scanner;

public class Day02_빙고숫자이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int arr[] = { 0, 0, 3, 0, 0, 3, 0, 3, 3 };
		int win = 0; // 빙고
		for(int i=0;i<arr.length;i++) {
			if(i%3==2) {
			System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + "  ");
			}
			
		}
		while(true) {
			// 가로체크
			for (int i = 0; i < arr.length; i += 3) {
				if (3 == arr[i] && arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]) {
					win = 1;
					break;
				}
			}
			// 세로체크
			for (int i = 0; i < arr.length - 6; i++) {
				if (3 == arr[i] && arr[i] == arr[i + 3] && arr[i + 3] == arr[i + 6]) {
					win = 1;
					break;
				}
			}
			// 대각선 / : 2 4 6
			if (arr[0] == 3 && arr[0] == arr[4] && arr[0] == arr[6]) {
				win = 1;
				break;
			}
			// 대각선 \ : 0 4 8
			if (arr[0] == 3 && arr[0] == arr[4] && arr[0] == arr[8]) {
				win = 1;
				break;
			}
			
			if(win == 1) {
				System.out.println("빙고");
				break;
			}
		}
				*/
		/*
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print("[ ]" + " \t");
			} else {
				System.out.print("[O]" + " \t");
			}
			if (i % 3 == 2) {
				System.out.println();
			}
		
		}
		*/
		/*
		// 숫자이동
		int[] game = { 0, 0, 0, 2, 0, 0, 0 };
		int player = -1; // 현재 플레이어 위치
		for (int i = 0; i < 7; i++) {
			if (game[i] == 2) {
				player = i; // 3
			}
		}
		System.out.println(game[player]+" "+player);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.println("1. 왼쪽 2. 오른쪽 ");
			int sel = sc.nextInt();
			if(sel == 1) {
				if(player > 0) {
					game[player] = 0;
					player--;
					game[player] = 2;
				} else {
					game[player] = 0;
					player = game.length-1;
					game[player] = 2;
				}
			} else if(sel ==2) {
				if(player < game.length-1) {
					game[player] = 0;
					player++;
					game[player] = 2;
				} else {
					game[player] = 0;
					player = 0;
					game[player] = 2;
				}
			} else if(sel ==3){
				System.err.println("끝");
				break;
			} else {
				System.out.println("오류");
			}
		}
		*/
		
		
	}

}
