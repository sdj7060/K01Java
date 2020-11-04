package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
스트림(Stream)
	: IO모델의 핵심개념이라 할수있는 스트림은 '데이터의흐름'
	혹은 '데이터의 흐름을 형성해주는 통로' 정도로 정의할수있다.
	입력 (input)스트림, 출력(output)스트림으로 나눌수있다.
 */
public class E01ByteFileCopy {

	public static void main(String[] args) {
		
		
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0;
		/*
		IO관련 작업에서는 많은부분에서 예외처리가 필요하다.
		이때 예외를 throws하는것보다 try~catch로 예외처리를
		해주는것을 권장하고 있다. 예외를 무시하게되면 문제가
		생겼을때 적절한 조치를 취하기 힘들기 때문이다.
		 */
		try {
			//원본파일을 읽어오기위한 입력스트림 생성
			in = new FileInputStream("src/ex20io/BANDIZIP6-SETUP.EXE");
			//복사본을 만들기 위한 출력스트림 생성
			out = new FileOutputStream("src/ex20io/BANDIZIP6-SETUP_copy.EXE");
			//원본에서 1byte를 읽어 저장하기 위한 변수
			int bDate;
			
			while(true) {	
				//원본파일에서 1byte씩 읽어온다.
				bDate = in.read();
				
				if(bDate==-1) {
					//파일의 끝까지 읽으면 -1을 반환하므로 반복문을 탈출한다.
					break;
				}
				
				//읽어온 데이터를 복사본으로 출력한다.
				out.write(bDate);
				//1byte를 읽을때마다 +1씩 증가함(파일의용량)
				copyByte++;
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
		}
		catch(IOException e) {
			System.out.println("파일스트림 생성시 오류발생됨");
		}
		finally {
			try {
				//IO작업이 완료되면 스트림을 닫아준다.
				in.close();
				out.close();
				
				System.out.println("복사된 KByte 크기:"+ (copyByte/1024));
			}
			catch(IOException e) {
				System.out.println("파일스트림닫기오류");
			}
		}
		
	}

}
