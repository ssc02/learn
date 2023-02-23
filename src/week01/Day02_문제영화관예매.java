package week01;

import java.util.Scanner;

public class Day02_문제영화관예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[7];
		int seatCnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if(sel > 2 || sel <= 0) {
				System.out.println("입력 확인");
				continue;
			}
			if(sel ==1 ) {
				System.out.println("좌석확인");
				for(int i=0; i<seat.length; i++) {
					if(seat[i] ==0) {
						System.out.print("[ ] \t");
					} else {
						System.out.print("[X] \t");
					}
				}
				System.out.println();
				System.out.println("좌석 번호 선택 : ");
				int seatSel = sc.nextInt();
				if(seatSel <= 0 || seat.length < seatSel) {
					System.out.println("좌석번호 확인");
					continue;
				}
				if(seat[seatSel-1] != 0) {
					System.out.println("이미 선택된 좌석");
					continue;
				}
				seat[seatSel-1] = 1;
				seatCnt++;
			} else if(sel ==2 ) {
				System.out.println("매출액 : " +12000*seatCnt+"원");
				run = false;
			}
		}
	}

}
