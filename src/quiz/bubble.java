package quiz;

import java.util.Random;

/*
버블정렬(Bubble Sort) : 정렬이 진행되는 과정이 거품이 보글보글 피어오르는
	모습과 비슷하다 하여 지어진 명칭이다.
	정렬 알고리즘 중에서는 가장 단순하고 효율성이 떨어지는 알고리즘이다.
	데이터가 10개인 경우 45번의 비교가 필요하다.
 */

public class bubble {

	public static void main(String[] args) {
		
		//1.중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
		Random random = new Random();
		int[] arr = new int[10];
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i]= random.nextInt(10000)%99+1;
				for(int j=0 ; j<i ; j++) {
					if(arr[j]==arr[i]) {
						i--;
					}
				}
		}
		//난수 확인
		System.out.println("생성된 난수");
		for (int i=0 ; i<10 ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("=============================="
				+ "");
		//2.버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 알고리즘이다.
		//(단, 정렬되는 과정을 모두 출력해야 한다.)
		
		//for문1 : 배열의 정렬이 1사이클 끝날때마다 정렬할 전체 배열이 줄어듬
		for (int a=9 ; a > 1 ; a--) {
			//for문2 : 배열 크기 비교 및 스왑 
			for (int i=0 ; i<a ; i++) {
				//조건에 해당하면 스왑 메소드 호출
				if (arr[i] > arr[i+1]) {
					//스왑 메소드
					swap(arr, i);
				}
			}
			//계산결과출력
			for (int i=0 ; i<10 ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		
		//마지막 확인
		System.out.println("정렬된 배열");
		for (int i=0 ; i<10 ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}///end of main
	
	//swap 매소드
	static void swap(int[] ar, int i) {
		int temp; 
		
		temp = ar[i];
		ar[i] = ar[i+1];
		ar[i+1] = temp;
	}
}
