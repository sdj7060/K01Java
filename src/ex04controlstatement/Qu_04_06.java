package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {

		int m=1;
		while(m<=5) {
			
			int n=1;
			while(n<=5) {
				//m은 n의 갯수만큼 출력한다.
				if(m>=n) {
					System.out.print("* ");
				}
				n++;
			}
			m++;
			System.out.println(); //한줄 출력후 줄바꿈
		}
	}

}
