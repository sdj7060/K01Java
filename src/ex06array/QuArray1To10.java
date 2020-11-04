package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		//크기 10인 배열 선언
		int[] arr = new int[10];
		int sum = 0;
		
		System.out.println("초기화된 배열 요소");
		//배열에 1~10까지의 정수를 초기화
		for (int i=0 ; i<arr.length ; i++) {
			arr[i]=i+1;
			System.out.print(i+" ");
		//배열의 모든 요소를 누적해서 더한다.
			sum += arr[i];
		}
		System.out.println();
		System.out.println("배열전체요소의합 :"+ sum);
		/*
		int sum = 0;
		//크기 10인 배열 선언
		int[] arr = new int[10];
		System.out.println("초기화된 배열 요소");
		for (int i=1 ; i<=10 ; i++) {
			arr[i-1]=i;
			System.out.print(i+" ");
			sum += arr[i-1];
		}
		System.out.println();
		System.out.println("배열전체요소의합 :"+ sum);
		*/
	}

}
