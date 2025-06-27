package AccessModifiers;

public class ElectricCar extends Car {

	private String batteryDuration;
	
	public String make;

	public ElectricCar(String color, String make, String batteryDuration) {
		super(make, color);
		this.batteryDuration = batteryDuration;

	}

	public void CustomDetails() {
		System.out.println("batterDuration=" + batteryDuration);
	}
	
	public void carDetails() {
		System.out.println("batterDuration=" + batteryDuration);
	}
}