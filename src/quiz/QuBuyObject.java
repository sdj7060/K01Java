package quiz;

import java.util.Scanner;

public class QuBuyObject {

	public static void buy (int _money) {
		int a,b,c,e,f;
		
		if (_money>=1600) {
			
			//b는 최대 과자 구매갯수
			b= _money - (_money % 700);
			b= b / 700 ;
			
			//과자를 구매한다 1개에서 b개까지
			for (int i=1 ; i<=b ; i++) {
				//c는 과자구매하고 남은 돈
				c =_money-(i*700);
				//System.out.println(i+" "+c);
				//e는 최대 빵 구매 갯수
				e= c - c % 500;
				e= e / 500 ;
				//빵 구매한다 1개부터 e개까지
				for (int j=1 ; j<=e ; j++) {
					//f는 빵,과자 구매하고 남은돈
					f=c-(j*500);
					//System.out.println(" "+j +" "+f);
					//a는 음료구매갯수
					a= f/400;
					if (a==0) {
						
					}
					else if (f%400==0) {
						System.out.printf("빵%d개, 과자%d개, 음료%d개",j,i,a);
						System.out.println();
					}
				}
			}
		}
		else {
			System.out.println("구매 불가");
		}
		System.out.println("위 방법중 하나를 선택하세욤^^*");
	}
	
	public static void main(String[] args) {
		
		/*
		현재 소유하고 있는 금액을 입력받아서 아래 물건을 잔돈을 남기지않고 
		최소 1개이상 구매하려면 어떻게 구매해야 하는지 프로그램을 통해 구현하시오.
		빵 : 500원
		과자 : 700원
		음료수 : 400원
		 */
		//1. 금액을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 금액을 입력하세요(1600원이상):");
		int money = sc.nextInt();
		
		//2.구매 메소드
		
		buy(money);
		
		
		
	}

}
