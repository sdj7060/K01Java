package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	//과목수를 저장하기위한 상수 선언
	public static final int SUBJECTS=3;
	
	public static void main(String[] args) {

		//1] 학생수를 사용자로부터 입력받자
		//-Scanner클래스 사용
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int haksangnum = scanner.nextInt();
		System.out.println("학생수:"+haksangnum);
		
		//2] 입력받은 학생 수만큼 국영수 점수를 저장할수 있는 int형 배열을 선언하고 메모리를 할당해라
		//	행의 수 : 학생수
		//	열의 수 : 과목수
		
		//String[] titles = {"국어", "영어", "수학"};
		
		//3] 다시 학생 수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장하라
		int [][] jumsu = new int [haksangnum][6];
		for (int i=0 ; i<haksangnum ; i++) {
			System.out.println("["+(i+1)+"번째 학생의 점수 입력]");
			jumsu[i][0]= i+1;
			//아래 세개는 for문으로 합칠 수 있다.(위 String 배열 이용)
			System.out.print("국어점수 입력?");
			int kor =scanner.nextInt();
			jumsu [i][1]= kor;
			System.out.print("영어점수 입력?");
			int eng =scanner.nextInt();
			jumsu [i][2]= eng;
			System.out.print("수학점수 입력?");
			int math =scanner.nextInt();
			jumsu [i][3]= math;
			
			jumsu [i][4]= kor+eng+math;
			jumsu [i][5]= (kor+eng+math)/3; 
		}
		System.out.println("=======================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("=======================");
		arrPrint(jumsu);
		System.out.println("=======================");
		
	}
	
	static void arrPrint(int[][] arr) {
		for(int[]a : arr) {
			for(int b : a) {
				System.out.print(b+ "  ");
			}
			System.out.println();
		}
	}

}
