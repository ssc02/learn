package week01;

import java.util.Scanner;

public class Day02_문제배열응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int arr[] = { 10, 20, 30, 40, 50 };
//		int b[] = new int[5];
//		int in[] = new int[5];
//		boolean run = true;
//		int idx = -1;
//
//		for(int i=0; i<in.length;i++) {
//			System.out.println("숫자 입력");
//			in[i] = sc.nextInt();
//		}
//
//		for(int j=0; j<in.length;j++) {
//			idx = -1;
//			for(int n=0; n<arr.length;n++) {
//				if(in[j] == arr[n]) {
//					idx = n;
//					b[j] = n;
//				} else {
//					b[j] = idx;
//				}
//			}
//		}
//
//		for(int m =0;m<b.length;m++) {
//			System.out.print(b[m]+" ");
//		}
		int result = 99;
		int key = 0;
		int idx = 0;
		int cnt = 1;
		while (key != -1) {
			System.out.print("key값 입력 : ");
			key = sc.nextInt();
			if (result == key) {
				idx = cnt;
				System.out.println("key값 99가 첫번째 나타난 것은 " + idx + "번째 이다.");
				break;
			}
			cnt++;
			if (idx == 0) {
				System.out.println("not found");
			} 
		}
		
	}

}
