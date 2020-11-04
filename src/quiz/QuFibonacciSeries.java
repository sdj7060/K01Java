package quiz;

import java.util.Scanner;

public class QuFibonacciSeries {
	
	public static void fibonacci (int num) {
		
		if (num>1) {
			int[] fib = new int[num];
			fib[0] = 0;
			fib[1] = 1;
			for (int i=2 ; i<num ; i++) {
				fib[i] = fib[i-1] + fib[i-2] ;
			}
			
			for (int i=0 ; i<num ; i++) {
				System.out.print(fib[i]+" ");
			}
		}
		else {
			System.out.println("피보나치 수열은 0,1부터 시작이므로 항상 2이상 입력해야 합니다.");
		}
		
	}
	//선언 해놓으면 전체에서 사용가능
	//public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		인자로 전달된 수만큼 피보나치 수열을 출력하는 메소드를 작성하시오.
		피보나치수열은 0, 1 부터 시작한다. 따라서 실행결과는 다음과 같다. 
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ......
		 */
		
		//1. 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요:");
		int num = sc.nextInt();
		
		//2. 피보나치 수열 메소드
		fibonacci(num);
		
	}

}
