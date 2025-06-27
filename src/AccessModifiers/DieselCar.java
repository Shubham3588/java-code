package AccessModifiers;

public class DieselCar extends Car {

	private String mileage;

	public DieselCar(String color, String make, String batteryDuration) {
		super(make, color);
		this.mileage = batteryDuration;

	}

	public void CustomDetails() {
		System.out.println("mileage=" + mileage);
	}
	
	public void carDetails() {
		System.out.println("mileage=" + mileage);
	}
}