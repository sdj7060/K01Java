package quiz;

import java.util.Scanner;

public class QuBinaryNumber {

	public static void main(String[] args) {
		
	/*
	10진수를 입력받아서 2진수로 변환해서 출력하는 프로그램을 작성하시오. 
	단, 이미 제공되는 변환함수를 사용하지말고 아래 예시에서 주어진데로 프로그램을 작성하고, 
	배열(Array)을 활용한다. 10진수 12 는 2진수 1100으로 변환할 수 있다. 
	즉 12을 2로 나눈 나머지를 역순으로 이어붙이면 된다. 
	 */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("2진수로 변환할 정수를 입력하세요:");
	int num = sc.nextInt();
	
	int[] arr = new int[100];
	
	
	int i=0;
	while (true) {
		arr[i] = num%2;
		if (num<=1) {
			break;
		}
		num = num/2;
		i++;
	}
	
	for (int j=i ; j>0 ; j--) {
		System.out.print(arr[j]);
	}
	
	}
}
