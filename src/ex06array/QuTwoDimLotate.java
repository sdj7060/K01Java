package ex06array;

public class QuTwoDimLotate {

	
	public static void arrLotate (int[][] arr) {
		/*
		절차
			1.배열의 마지막행을 1차원배열 변수에 임시로 저장
			2.배열의 2행을 3행으로,1행을 2행으로 옮긴다.
			3.1번에서 임시로 저장했던 값을 1행으로 옮긴다.
			
			※2차원배열에서 배열이름[인덱스]가 하나의 행을 가리킨다는것을 활용하는 문제임
		 */
		//절차1
		int[] lotate = arr[arr.length-1];
		//절차2 : 세로크기에 상관없이 동작해야 하므로 length를 사용한다.
		for (int row=(arr.length-1) ; row>0 ; row--) {
				arr[row]=arr[row-1];
		}
		//절차3
		arr[0]=lotate;
	}
	
	public static void main(String[] args) {
		
		//배열초기화를 위한 변수
		int k = 1;
		//3by3 배열 생성
		/*
		2차원배열에서
			배열의이름.length => 세로길이 반환
			배열의이름[세로인덱스].length =>해당 가로행의 길이 반환
		 */
		int[][] arr = new int[3][3];
			for (int i=0 ; i<arr.length ; i++) {
				for (int j=0 ; j<arr[i].length ; j++) {
					arr[i][j]= k++;
				}
			}
			System.out.println("arrLotate호출 전");
			//초기화 직후 출력
			arrPrint(arr);

			//한행씩 이동하기
			arrLotate(arr);
			System.out.println("arrLotate 한 번 호출 후");
			arrPrint(arr);
			
			arrLotate(arr);
			System.out.println("arrLotate 두 번 호출 후");
			arrPrint(arr);
			
			arrLotate(arr);
			System.out.println("arrLotate 세 번 호출 후");
			arrPrint(arr);
	}
	//이차원배열을 출력하기 위한 메소드
	static void arrPrint(int[][] arr) {
		for(int[]a : arr) {
			for(int b : a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
	}

}
