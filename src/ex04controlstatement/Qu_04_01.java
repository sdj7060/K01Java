package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("문자하나를 입력하세요:");
		int number = System.in.read();
		if(number>=48 && number<=57) 
		{
			/*
			입력받은 숫자는 문자형태의 숫자이므로 실제 숫자로 바꾸려면 '0'을 뺴줘야한다.
			숫자형문자가 가지고있는 아스키코드값에서 48(0의 아스키코드)을 빼면 해당문자의 정수가 된다.
			즉 '4' - '0' = (정수) 4
			*/
			if((number-48)%2==0) 
			{
				System.out.println("2의 배수입니다.");
			}
			else 
			{
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else 
		{
			System.out.println("숫자가 아닙니다.");
		}
	}
}
