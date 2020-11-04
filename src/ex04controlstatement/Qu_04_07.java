package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {

//		int total = 0;
//		int j = 1;
//		while(j<=100) {
//			if(j%3==0 || j%7==0) {
//				if(j%21!=0) {
//					total += j;
//					System.out.print(j+"+");
//				}
//			}
//			j++;
//		}
//		
//		System.out.println("="+ total);
		
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			//3의 배수이거나 7의 배수
			if(i%3==0 || i%7==0) {
				//3과7의 공배수가 아닌 정수
				if(i%(3*7)!=0) {
					sum += i;
					if(i==99)
						System.out.print(i);
					else
						System.out.print(i+"+");
				}
			}
		}
		System.out.println("="+sum);
	}
}
