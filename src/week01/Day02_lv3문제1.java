package week01;

public class Day02_lv3문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		int cnt = 0;
		for(int i=50; i<=100;i++) {
			if(i%9==0) {
				cnt++;
			}
		}
		System.out.println("답 : " + cnt);
		//arr 의 값을 temp1 에 복사후 출력
		
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp1[] = new int[5];
		
		for(int i=0; i<arr.length;i++) {
			temp1[i] = arr[i]*2;
			System.out.print(temp1[i]+"\t");
		}
	}
}
