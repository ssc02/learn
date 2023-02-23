package week01;

public class Day01_변수값교체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;

		System.out.printf(" x= %d y =%d \n", x, y);
		// 변수 = 값;
		// x = y; // x = 20 y = 20
		// y = x;

		int z = x;
		x = y;
		y = z;
		System.out.printf(" x= %d y =%d \n", x, y);
		
		
		//println, printf 차이 <<<<<<<<<<<<<
		int coin = 2300;
        int coin500 = coin/ 500;
        int coin100 = coin % 500 /100;
        System.out.println(coin+" 은 500원 " + coin500 +"개 100원" + coin100 +"개");
        System.out.printf("%d원=  500원(%d개), 100원(%d개) \n",coin,coin500,coin100);
        System.out.printf("%d원",coin);
        System.out.println("test \t 테스트 \n 다음줄");
	}

}
