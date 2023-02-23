package week01;

import java.util.Scanner;

public class Day02_배열컨트롤러 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		boolean run = true;
		while(run) {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[5]값삭제 (중복) ");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			// 1 추가
			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("추가 할수없음");
					continue;
				}
				System.out.println("추가값 : ");
				int data = sc.nextInt();
				if (data == 0) {
					System.out.println("0은 추가 불가능");
					continue;
				}
				arr[cnt] = data;
				cnt++;
			} else if(sel ==2 ) { // 2 삭제 인덱스
				if(cnt==0) {
					System.out.println("삭제 값 없음");
					continue;
				}
				System.out.println("삭제할 인덱스 : ");
				int idx = sc.nextInt();
				if(idx < 0 || cnt <= idx) {
					System.out.println("인덱스 오류");
					continue;
				}
				int index = 0;
				for(int i=0;i<cnt;i++) {  // <<<<<<<<<<<<<<<<<<<<
					if(idx != i) {
						arr[index] = arr[i];
						index++;
					}
				}
				cnt--;
				arr[cnt] =0;
//				idx 2        arr[0] = arr[0] / arr[1]=arr[1] / arr[2] arr[3]
//				index       
			} else if(sel==3) { // 값 삭제
				if(cnt==0) {
					System.out.println("삭제 값 없음");
					continue;
				}
				System.out.println("삭제할 값 : ");
				int delCheck = -1;
				int data = sc.nextInt();
				for(int i=0;i<cnt;i++) {
					if(data==arr[i]) {
						delCheck = i;
						break;
					}
				}
				if (delCheck == -1) {
					System.out.println("삭제 값 없음");
					continue;
				}
				int index = 0;
				for (int i = 0; i < cnt; i++) {
					if (delCheck != i) {
						arr[index] = arr[i];
						index++;
					}
				}
				cnt--;
				arr[cnt] = 0;
			} else if(sel ==4 ) { // 값 삽입
				if(cnt==5) {
					System.out.println("값 삽입 불가");
					continue;
				}
				System.out.println("값 삽입 인덱스 : ");
				int idx = sc.nextInt();
				if (idx < 0 || idx >= cnt) {
					System.out.println("해당위치 삽입 불가");
					continue;
				}
				System.out.println("삽입 값 >> ");
				int val = sc.nextInt();
				if (val == 0) {
					System.out.println("0은 추가 불가 ");
					continue;
				}
				// 100 20  idx = 0 val 10
//				i=2 2>0 i--
//						arr[2] = arr[1]
				for (int i = cnt; i > idx; i--) {  // <<<<<<<<<<<<<<<<
					arr[i] = arr[i-1];
				}
				arr[idx] = val;
				cnt++;
			} else if(sel == 5) { // 중복 값 삭제
				int check = 0;
				if(cnt ==0 ) {
					System.out.println("삭제 값 없음");
					continue;
				}
				int delIdx = -1;
				System.out.println("삭제 값 입력>> ");
				int data = sc.nextInt();
				while(true) {
					delIdx = -1;
					for(int i=0;i<cnt;i++) {
						if(data == arr[i]) {
							delIdx = i;
							check = 1;
							break;
						}
					}
					if (delIdx == -1) {
						break;
					}
					int index = 0;
					for (int i = 0; i < cnt; i++) {
						if (delIdx != i) {
							arr[index] = arr[i];
							index++;
						}
					}
					cnt--;
					arr[cnt] = 0;
				}
				if (check == 0) {
					System.out.println("삭제 값 없음");
					continue;
				}
			} else {
				System.out.println("다시선택");
			}

		}
	}

}
