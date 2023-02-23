package week01;

public class Day02_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int nums[] = new int[5]; // 각방에 0으로 초기값을 넣어둠
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		// 배열은 0 ~ 갯수-1 개 : 마지막 방번호( 갯수-1 )
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("while");
		int j = 0;
		while(j<5) {
			System.out.println(nums[j]);
			j++;
		}
		*/
		// 참조형 변수: 주소값을 참조한다 : 배열 , String, Scanner
		
		int[] arr = null; // 주소의 초기값 형태 
		// arr 정수배열 사용할껀데 아직 방을 안만듬
		//arr => 여러개의 정수값들을 저장하는 공간의 주소값 
		System.out.println("arr=" + arr); // 메모리방이 없다 
		arr = new int[3]; // heap 메모리방에 연속적으로 정수 3개 들어가는
		               // int 방 3개 만들어지고 그 주소값을 다시 arr 넣어줬다 
		System.out.println("arr=" +arr);// 메모리방이 있다 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("======");
		//# 배열의 사용법(1)
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("=====");
		// # 배열의 사용법(2) : 축약형
		int[] temp = {10, 20, 30};
		
		for(int i=0; i<3; i++) {
			System.out.println(temp[i]);
		}
		
	}
}
