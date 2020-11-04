package ex06array;

public class QuTwoDimArray {

	public static void addOneArr(int[] arr, int add)
	{
		for(int i=0; i<arr.length; i++){
			arr[i]+=add;
		}
	}
	
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int i=0 ; i<arr.length ; i++) {
			//이차원배열에서는 배열의 이름을 통해 세로길이를 알수 있음
			addOneArr(arr[i], add);
		}
	}

	public static void main(String[] args) {
		//배열선언 : 비어있는 부분은 Null로 초기화됨.
		int[][] arr = {					
			{1, 2, 3, 4},
			{5, 6, 7},
			{8, 9}
		};
		arrPrint(arr);		
		System.out.println();
		addTwoArr(arr, 2);
		arrPrint(arr);
	}
	
	static void arrPrint(int[][] arr) {
		for(int[]a : arr) {
			for(int b : a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
	}

}
