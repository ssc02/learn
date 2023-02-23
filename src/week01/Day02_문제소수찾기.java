package week01;

import java.util.Scanner;

public class Day02_문제소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		if(a > 0) {
			for(int i = 2; i<=a;i++) {
				int cnt = 0;
				for(int j=2; j<=i;j++) {
					if(i%j==0) {
						cnt++;
					}
				}
				if(cnt==1) {
					System.out.println(i + " ");
				}
			}
		}
	}

}
