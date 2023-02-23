package week01;

public class Day02_whilefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while - for문 차이점 
			// while : 여러 복잡한 조건반복문 , 무한반복문 
			// for : 배열 의 방번호랑 같이 사용을 한다 
			// 1. while의 i while문 영역 밖에서도 접근가능
			// 2. for의 k for문 영역 밖에서도 접근 불가
			
			int i =0;
			while(i < 10) {
				i++;
				if(i == 5) {
					continue; 
				}
				System.out.println(i);	
				// i++; continue 때문에 증가를 못해서 에러발생 
			}
			
		

			System.out.println("=================");
			
			// for문의 기본형 
			//for(초기값 ; 조건식 ; 증감식 ){   }		
			
			for( int k =0; k< 10; k++ ) {
				
			    if(k == 5) {
			    	continue;
			    }
			    System.out.println(k);
			    
			}
	}

}
