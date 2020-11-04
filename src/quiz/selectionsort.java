package quiz;

import java.util.Random;

public class selectionsort {
	
	public static void selection(int arr[]) {
		int num=0;
		
		for (int k=0 ; k<10 ; k++) {
			int swap=0;
			int n=k;
			
			for (int i=k ; i<10 ; i++) {
				num = arr[i];
				for (int j=k ; j<=i ; j++) {
					if(num>arr[j]) {
						num=arr[j];
						n=j;
					}
				}
			}
			//swap
			swap=arr[k];
			arr[k]=num;
			arr[n]=swap;
			
			for (int i=0 ; i<10 ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("====================================");
		for (int i=0 ; i<10 ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		선택정렬은 전체요소 중에서 최소값을 찾아 첫번째 자리와 교환한다.
		1회전을 수행하면 최소값이 맨 앞에 오게되므로 
		첫번째 자료를 제외한 나머지 자료에서 다시 최소값을 찾아 두번째 자리와 교환한다. 
		이 과정을 반복한다. 
		자료가 N개라면 교환은 (N-1)번 이루어진다.
		 */
		//1.1~100 사이의 중복되지 않는 정수 10개의 난수를 생성한다. 
		//2.생성한 난수는 크기 10인 배열에 저장한다. 
		int[] num = new int[10];
		Random random = new Random();
		for (int i=0 ; i<10 ; i++) {
			num[i]=random.nextInt(1000)%99+1;
			for (int j=0 ; j<i ; j++) {
				if(num[i]==num[j]) {
					i--;
				}
			}
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("====================================");
		//3.위 그림을 참조하여 선택정렬로 오름차순 정렬한다.
		selection(num);
		
	}
}
