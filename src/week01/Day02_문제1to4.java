package week01;

import java.util.Random;
import java.util.Scanner;

public class Day02_문제1to4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] arr = new int[4];
		int[] check = new int[4];
		boolean run = true;
		int idx = 1;
		
		for (int i = 0; i < arr.length;) { //랜덤값 부여 
			int num = rd.nextInt(4) + 1;
			if (check[num - 1] != 1) {
				check[num - 1] = 1;
				arr[i] = num;
				i++;
			}
		}
		while(run) {
			for(int j =0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			System.out.println("숫자 입력 (1~4) : ");
			int in = sc.nextInt();
			if(in < 0 || in >3) {
				System.out.println("입력 오류");
				continue;
			}
			if(arr[in] == idx) {
				arr[in] = 9;
				idx += 1;
			}
			System.out.print("결과 : ");
			for (int n = 0; n < arr.length; n++) {
				System.out.print(arr[n]+" ");
			}
			System.out.println();
			if(idx > 4) {
				System.out.println("끝");
				run = false;
			}
		}
	}

}
