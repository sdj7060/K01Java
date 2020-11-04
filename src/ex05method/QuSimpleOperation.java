package ex05method;

public class QuSimpleOperation {

	static void arithmetic(int n1, int n2) {
		System.out.println("덧셈결과 ->"+ (n1+n2));
		System.out.println("뺄셈결과 ->"+ (n1-n2));
		System.out.println("곱셈결과 ->"+ (n1*n2));
		System.out.println("나눗셈 몫 ->"+ (n1/n2));
		//%기호를 콘솔에 출력하기 위해 이스케이프 시퀸스를 사용함
		System.out.println("나눗셈 나머지 ->"+ (n1%n2));
	}
	public static void main(String[] args) {
		arithmetic (10, 20);
	}

}
