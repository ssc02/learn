package week01;

public class Day02_이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int arr[] = new int[3];
		arr[1] = 100;
		
		int[][] darr = new int[3][4];
		darr[0][2] = 400;
		
		int[][] darr2 = new int[3][];
		int[] arr1 = new int[2];
		int[] arr2 = new int[3];
		int[] arr3 = new int[1];
		// arr1,arr2,arr3 int만들어진 배열의 주소값
		darr2[0] = arr1;
		darr2[1] = arr2;
		darr2[2] = arr3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// darr 출력
		// 3
		for (int i = 0; i < darr.length; i++) {
			for (int k = 0; k < darr[0].length; k++) {
				System.out.printf("i= %d k =%d \n", i, k);
//				 System.out.print(darr[i][k] + " ");

			}
			System.out.println("===========");
		}
		System.out.println();
		for (int i = 0; i < darr2.length; i++) {
			System.out.printf(" darr2[%d] 의 각 방의 길이 ", i);
			System.out.println(darr2[i].length);
		}
		System.out.println("===========");
		for (int i = 0; i < darr2.length; i++) {
			for (int k = 0; k < darr2[i].length; k++) {
				System.out.printf("i= %d k =%d \n", i, k);
				// System.out.print(darr[i][k] + " ");

			}
			System.out.println("===========");
		}
		System.out.println();
	}

}
