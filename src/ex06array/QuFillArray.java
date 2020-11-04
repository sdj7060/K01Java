package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[10];//입력받은 정수를 순서대로 입력
		int[] arr2 = new int[10];//홀/짝 구분해서 입력
		int indexStart=0;//arr2배열의 첫번째 인덱스 저장 (홀수인경우)
		int indexEnd=9;//마지막 인덱스 저장 (짝수인경우)
		
		for (int i=0 ; i<arr1.length ; i++) {
			
			System.out.print(i+1+"번째 정수를 입력하세요:");
			int inputnum = scanner.nextInt();
			//첫번째 배열에는 입력한 순서대로 채워준다.
			arr1[i] = inputnum;
			
			if(inputnum%2!=0) {
				//입력받은 숫자가 홀수이면 앞에서부터 채우고 인덱스 +1 증가
				arr2[indexStart++]=inputnum;
			}
			else {
				//입력받은 숫자가 짝수이면 뒤에서부터 채우고 인덱스 -1 감소
				arr2[indexEnd--]=inputnum;
			}
		}
		System.out.println("순서대로입력된결과");
		for (int i=0 ; i<arr1.length ; i++ ) {
			System.out.printf("%d ",arr1[i]);
		}
		System.out.println("\n홀수/짝수 구분입력결과");
		for (int i=0 ; i<arr2.length ; i++ ) {
			System.out.printf("%d ",arr2[i]);
		}
		
		
		
	}
}
