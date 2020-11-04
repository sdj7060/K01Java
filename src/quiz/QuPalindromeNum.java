package quiz;

import java.util.Scanner;

public class QuPalindromeNum {

	public static int numChange(int num) {
		int temp=0;
		
		while (true) {
			temp += num % 10;
			temp = temp*10;
			num=num/10;
			if (num==0) {
				break;
			}
		}
		
		return temp/10;
	}
	
	public static void main(String[] args) {
		
		/*
		위 문제는 문자열이 회문인지 판단하는 문제이다. 이번에는 사용자로 부터 입력받은 정수가 회문수인지 판단하는 프로그램을 작성하시오.  
		과정설명]
		입력수에서 마지막 숫자를 추출한다 : %연산자 이용
		12345 % 10 = 5
		임시변수 temp에 위의 결과 5를 더한다. 
		temp = 5
		입력수를 10으로 나눠서 몫을 구한다. 그러면 마지막 자리가 잘려나간다.
		12345 / 10 = 1234.5 => 1234
		위의 수에서 마지막 숫자를 추출하기 위해 다시 % 연산한다. 
		1234 % 10 = 4
		temp에 10을 곱해 자리수를 올린후 4를 더한다.
		5 * 10 + 4 = 54
		입력수를 10으로 나눈 결과가 0이 될때까지 계속 반복한다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회문인지 판단할 숫자를 입력해주세요:");
		int num = sc.nextInt();
		
		int result = numChange(num);
		System.out.println("입력한정수를 뒤집어서 만든수="+result);
		
		if (result == num) {
			System.out.println("입력하신 숫자는 회문입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 회문이 아닙니다.");
		}
		
	}

}
