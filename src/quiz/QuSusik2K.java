package quiz;

import java.util.Scanner;

public class QuSusik2K {

	public static void main(String[] args) {
		
		/*
		숫자 n을 입력받아서 아래의 수식을 만족하는 k의 최대값을 구하여 출력하는 프로그램을 작성하시오.
		가령 n이 20 이라면....k의 최대값은 4가 된다. (2*2*2*2 = 16)
		 */
		
		//1. 숫자 n을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("정수n을 입력하세요(0이상의정수):");
		int n = sc.nextInt();
		
		//2. k를 구하는 식
		int k = 0; //문제에서 k값
		int num = 2; //2를 거듭제곱할 변수
		int inc = 1;
		
		if(n==0) {
			System.out.println("만족하는 k값 없음");
			return;
		}
		if(n==1) {
			System.out.println("공식을 만족하는 k값 : 0");
			return;
		}
		
		//방법1
		/*
		while(num<=n) {
			num *=2;
			k++;
		}
		System.out.println("공식을 만족하는 k값:"+k);
		*/
		
		//방법2
		for(k=0 ; inc*2<=n ; k++) {
			inc = inc *2;
		}
		System.out.println("공식을 만족하는 k값:"+k);
		
		/*
		while(true) {
			if (k!=0) {
				num *= 2;
				if (num>n) {
					System.out.printf("공식을 만족하는 k값 :%d",k);
					break;
				}
			}
			k++;
		}
		*/
	}
}
