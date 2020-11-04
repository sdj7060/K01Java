package ex05method;

public class QuCircleCalculator {

	//파라메타(매개변수)
	//원의 넓이(반환값이 없는형태
	static void circleArea(double rad) {
		double area = (3.14*rad*rad);
		System.out.println("원의넓이:"+area);
	}
	//원의 둘레(반환값이 있는 형태)
	static double circleRound(double rad) {
		double round = (2*3.14*rad);
		return round;
	}
	public static void main(String[] args) {
		//원의 넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과출력됨
		circleArea(10.2);
		//원의 둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력함
		System.out.println("원의 둘레:"+ circleRound(10.2));
	}

}
