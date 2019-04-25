package temperature;

public class Temperature {

	public static void main(String[] args) {
		int[] temperatures = {-10, 5, 25, 38};
		
		for (int i=0; i < temperatures.length; i++) {
			examineTemperature(temperatures[i]);
		}

	}

	private static void examineTemperature(int temp) {
		System.out.print("Temperature is " + temp + " Celsius.");
		
		int fTemp = celsiusToFahrenheit(temp);
		
		System.out.println("... that is " + fTemp + " Fahrenheit.");
		
		if (fTemp < 45) {
			System.out.println("This is chilly.");
		} else if (fTemp < 80) {
			System.out.println("This is pretty warm");
		} else
			System.out.println("There's nothing special.");
	}

	private static int celsiusToFahrenheit(int temp) {
		int fTemp = ((9 * temp) / 5) + 32;
		return fTemp;
	}

}
