package ex12inheritance;
//직사각형을 표현한 클래스
class Rectangle
{
	int x;
	int y;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void ShowAreaInfo() {
		if (x==y) {
			System.out.println("정사각형의 면적:"+(x*y));
		}
		else {
			System.out.println("직사각형의 면적:"+(x*y));
		}
	}
	
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	int z;
	
	public Square (int z) {
		super(z,z);
		this.z=z;
	}
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}
