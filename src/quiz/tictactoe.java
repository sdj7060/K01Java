package quiz;

import java.util.Scanner;

public class tictactoe {

		
	public static void show (char arr[][]) {
		System.out.println("--------------");
		System.out.println("| "+arr[0][0]+" | "+arr[0][1]+" | "+arr[0][2]+" |");
		System.out.println("--------------");
		System.out.println("| "+arr[1][0]+" | "+arr[1][1]+" | "+arr[1][2]+" |");
		System.out.println("--------------");
		System.out.println("| "+arr[2][0]+" | "+arr[2][1]+" | "+arr[2][2]+" |");
		System.out.println("-------------");
		
	}
	public static void main(String[] args) {
		
		// 크기가2인 이차원배열
		char[][] arr = new char[3][3];
		int count=1;
		//배열을 스페이스로 채움
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = ' ';
			}
		}
		
		//좌표를 입력받고 입력받은 
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("좌표를 입력하세요(x,y):");
			String aaa = sc.nextLine();

			if(aaa.length()<3) {
				System.out.println("올바른 좌표의 형태로 입력해주세요.");
				continue;
			}
			
			int x, y;
			x=aaa.charAt(0)-48;
			y=aaa.charAt(2)-48;
			
			if(x>=3 || y>=3) {
				System.out.println("올바른 좌표의 형태로 입력해주세요.");
				continue;
			}
			
			//좌표에 맞는 배열에 O,X를 입력 (같은 좌표면 다시 반복)
			if(count%2==1) {
				if (arr[x][y]==' ')
					arr[x][y] = 'O';
				else {
					System.out.println("먼저 입력한 좌표입니다. 다른좌표를 입력하세요.");
					count--;
				}
			}
			else {
				if (arr[x][y]==' ')
					arr[x][y] = 'X';
				else {
					System.out.println("먼저 입력한 좌표입니다. 다른좌표를 입력하세요.");
					count--;
				}
			}
			show(arr);
			count++;
			
			//승리조건확인
			String str = String.format("%c%c%c",arr[0][0],arr[0][1],arr[0][2]);
			if (str.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str2 = String.format("%c%c%c",arr[1][0],arr[1][1],arr[1][2]);
			if (str2.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str2.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str3 = String.format("%c%c%c",arr[2][0],arr[2][1],arr[2][2]);
			if (str3.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str3.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str4 = String.format("%c%c%c",arr[0][0],arr[1][0],arr[2][0]);
			if (str4.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str4.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str5 = String.format("%c%c%c",arr[0][1],arr[1][1],arr[2][1]);
			if (str5.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str5.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str6 = String.format("%c%c%c",arr[0][2],arr[1][2],arr[2][2]);
			if (str6.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str6.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str7 = String.format("%c%c%c",arr[0][0],arr[1][1],arr[2][2]);
			if (str7.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str7.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			String str8 = String.format("%c%c%c",arr[2][0],arr[1][1],arr[0][2]);
			if (str8.contains("OOO")==true) {
				System.out.println("게임종료.O가 이겼습니다.");
				break;
			}
			if(str8.contains("XXX")==true) {
				System.out.println("게임종료.X가 이겼습니다.");
				break;
			}
			//승부가 나지않으면 무승부 출력
			if(count==10) {
				System.out.println("무승부입니다.");
				break;
			}
		}
		
	}		
}

