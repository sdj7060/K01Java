package quiz;

public class AAA {

	public static void main(String[] args) {

//		시나리오] 숫자를 홀/짝수인지 먼저 판단한 후 100이상인지를 판단하는
//	프로그램을 if~else구문을 이용하여 작성하시오.
		int i = 17;
		if(i%2==0) {
			if(i>=100) {
				System.out.println("짝수면서 100이상");
			}
			else {
				System.out.println("짝수면서 100미만");
			}
		}
		else {
			if(i>=100) {
				System.out.println("홀수면서 100이상");
			}
			else {
				System.out.println("홀수면서 100미만");
			}
		}
		
		
//시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
//프로그램을 작성하시오. 90점 이상은 A학점...60점미만은 F학점으로
//판단하여 출력하시오.

		int kor=90, eng=80, math=70;
		double avg = (kor+eng+math)/3.0;
		if(avg>=90) {
			System.out.println("학점:A");
		}
		else if (avg>=80) {
			System.out.println("학점:B");
		}
		else if (avg>=70) {
			System.out.println("학점:C");
		}
		else if (avg>=60) {
			System.out.println("학점:D");
		}
		else {
			System.out.println("학점:F");
		}
		
//시나리오] 1~10까지의 합을 구하는 프로그램을 while 문으로 작성하시오.
		
		int j=1, sum=0;
		while(j<=10) {
			sum += j ;
			j++;
		}
		System.out.println("1~10까지 합은:"+ sum);

//시나리오] 1부터 100까지의 정수중 3의배수이거나 5의 배수인 수의 합을 구하는 프로그램을 while문을 이용해 작성하시오.

		int k=1, sum2=0;
		while(k<=100) {
			if (k%3==0 || k%5==0) {
				sum2 += k ;
			}
			k++;
		}
		System.out.println("1~100사이의 3과5의 배수의 합은:"+ sum2);
		
//시나리오] 구구단을 출력하는 프로그램을 작성하시오.
//(단 while문을 이용하시오.)
		int dan=2;
		while(dan<=9) {
			int su=1;
			while (su<=9) {
				System.out.printf("%2d*%-2d=%3d",dan, su, (dan*su));
				System.out.print("  ");
				su++;
			}
			System.out.println();
			dan++;
		}
		
//시나리오] E03 예제의 수열문제를 do~while문으로 변경하여 구현하시오.

//시나리오] 1부터 1000까지의 정수중 4의배수이거나 7의배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
//(단, do~while문을 사용해야 한다.)

//시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
//(단, 사용자가 X,x(대소문자 구분없음를 입력하면 프로그램이 종료되어야 하며 do~while문으로 구현해야 한다.)

//시나리오] 1~100까지의 합을 구하는 프로그램을 for문을 이용하여 구현하시오. 

//시나리오] for문을 이용하여 1~10사이의 정수중 2의 배수의 합을 구하는 프로그램을 작성하시오.

//연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오.

	}

}
