package quiz;

import java.util.Scanner;

public class QuConvertTime {
	
	static final int HOUR = 60*60;
	static final int MIN = 60;
	
	public static void convertTime (int second) {
		int h, m, s;
		h = second / HOUR;
		second = second % HOUR;
		m = second / MIN;
		second = second % MIN;
		s= second;
		
		System.out.printf("[%d시간 %d분 %d초]",h,m,s);
	}
	
	public static void main(String[] args) {
		
		/*
		‘초’를 ‘시간’으로 변환하기
		초를 입력받아서 00시간 00분 00초 형태로 출력하는 프로그램을 메소드를 작성하시오.
		출력예 : 2458초 -> 0시간 40분 58초
       	   3456초 -> 0시간 57분 36초
		 */
		
		//1. 초를 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int second = scanner.nextInt();
		
		//2. 시간으로 변경하는 메소드
		convertTime(second);
		
	}

}
