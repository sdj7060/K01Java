package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {

		final double PI = 3.14;
		int r = 10; //r은 반지름
		
		//공식 : 원의넓이 = 반지름(r) * 반지름(r) * 3.14(PI)
		int area1 = (int)(r*r*PI);
		float area2 = (float)(r*r*PI);
		double area3 = (double)(r*r*PI);
		/*
		큰 자료형을 작은 자료형에 대입할때에는 자료의 손실이 있을수 있으므로
		반드시 강제형변환(명시적형변환)을 통해 형변환후 대입해야한다.
		 */
		System.out.println("int형의 넓이:"+ area1);
		System.out.println("float형의 넓이:"+ area2);
		System.out.println("double형의 넓이:"+ area3);
		
	}

}
