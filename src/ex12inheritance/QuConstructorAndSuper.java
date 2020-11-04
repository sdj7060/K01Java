package ex12inheritance;

class Car
{
       	int gasoline;

		public Car(int gasoline) {
			this.gasoline = gasoline;
			System.out.println("Car class 생성자");
		}
}
class HybridCar extends Car
{
       	int electric;

		public HybridCar(int gasoline, int electric) {
			super(gasoline);
			this.electric = electric;
			System.out.println("HybridCar class 생성자");
		}
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	public HybridWaterCar(int gasoline, int electric, int water) {
			super(gasoline, electric);
			this.water = water;
			System.out.println("HybridWaterCar class 생성자");
		}
		public void showNowGauge()
       	{
					System.out.println("showNowGauge 메소드");
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}

