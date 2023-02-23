package week01;

import java.util.Random;
import java.util.Scanner;

public class Day02_중복숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		int size = arr.length;
		/*
		for (int i = 0; i < size;) {
			int rnd = rd.nextInt(size); // 0 - 3
			if (check[rnd] == 0) {
				check[rnd]= 1; // 체크배열에 값넣고 확인 후 arr에 값넣기
				arr[i] = rnd + 1;
				System.out.println(arr[i]);
				i++;
			}
		}
		*/
		// 2. 내가 원하는 값 다 넣고 섞기
				for (int i = 0; i < size; i++) {
					arr[i] = i+1;
				}
				// 1 2 3 4 
				int k =0;
				while(k < 500) {
					int r = rd.nextInt(size);
					int temp = arr[0];
					arr[0] = arr[r];
					arr[r] = temp;
					k++;
				}
				for (int i = 0; i < size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();		
				
				// 숫자 찾기  값 찾을시 9로 바뀜
				int gameNum = 1;
				
				for(int i =0;i<size;) {
					for (int n = 0; n < size; n++) {

						System.out.print(arr[n] + " ");
					}
					System.out.println();
					System.out.println(gameNum + "위치입력 > ");
					int num = sc.nextInt();
					if(num <0 || num >=size) {
						continue;
					}
					if(arr[num] == gameNum) {
						arr[num] = 9;
						gameNum++;
						i++;
					}
					
				}
				
		        System.out.println("게임종료 ");
				
	}

}
