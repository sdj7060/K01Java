package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {
		
		/*
		다음 수식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하시오.
		AZ
 		+ZA
		--------
  		99
		 */
		int A,Z;
		for (A=0 ; A<10 ; A++){
			for (Z=0 ; Z<10 ; Z++){
				if(A!=Z) {
					int result = (10*A+Z)+(10*Z+A);
					if (result==99){
						System.out.printf("%d%d + %d%d = %d\n",A,Z,Z,A,result);
					}
				}
			}
		}
			
		
	}

}
