package week01;

import java.util.Scanner;

public class Day02_배열응용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = { 10, 49, 51, 36, 17 };
		/*
		// 문제 1) 다음 리스트를 값을 입력하면 번호 출력 // 예) 51 ==> 2
		System.out.println("리스트 값 입력 : ");
		int num = sc.nextInt();
		int check = -1;
		for(int i = 0;i<a.length;i++) {
			if(a[i] == num) {
				check = i;
				break;
			}
		}
		if(check != -1) {
			System.out.println("방 번호 : " + check);
		} else {
			System.out.println("없는값");
		}
		*/
		/*
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		int b[] = { 0,0,0,0,0 };
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 1) {
				b[i] = a[i];
			}
			System.out.print(b[i]+" ");
		}
		*/
		/*
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
		int c[] = { 0,0,0,0,0 };
		int idx = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]%2 == 1) {
				c[idx] = a[i];
				idx++;
			}
		}
		for(int i =0; i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
		*/
		/*
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		int arr[] = {1001, 20, 1002, 45, 1003, 54};	// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		System.out.println("학번 입력 : ");
		int hak = sc.nextInt();
		for(int i=0;i<arr.length;i=i+2) {
			if(hak==arr[i]) {
				System.out.println("점수 : "+arr[i+1]);
			}
		}
		*/
		// for문 i++, i=i+2, i+=2 <<<<<<<<<<<<<<<<<
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		for(int i = 1;i<arr.length;i+=2) {
			if(arr[i]==score) {
				System.out.println("학번 : "+arr[i-1]);
			}
		}
	}

}
