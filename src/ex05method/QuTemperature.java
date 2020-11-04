package ex05method;

public class QuTemperature {

	//섭씨 -> 화씨
	//celsiusToFahrenheit
	static double celsiusToFahrenheit (double cel) {
		return 1.8* cel + 32;
	}
	//화씨 -> 섭씨
	//fahrenheitToCelsius
	static double fahrenheitToCelsius (double fah) {
		return  (fah-32) / 1.8;
	}
	public static void main(String[] args) {

		System.out.println("섭씨20도 -> 화씨=");
		System.out.println(celsiusToFahrenheit (20));
		
		System.out.println("화씨98동 -> 섭씨=");
		System.out.println(fahrenheitToCelsius (98));
		
	}

}
