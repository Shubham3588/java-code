package AccessModifiers;

public class mainClass {
	public static void main(String[] args) {
		ElectricCar electricCarOrig = new ElectricCar("RED", "BMW", "2hrs");

		electricCarOrig.carDetails();
		
		
		
		Car electricCar = new ElectricCar("RED", "BMW", "2hrs");
		
		getDetails(electricCar); 
		
		Car dieselCar = new DieselCar("Black", "Alto", "20km");
		
		getDetails(dieselCar);	
	}
	
	
	public static void getDetails(Car car) {
		car.carDetails();
		
		if(car instanceof DieselCar) {
			System.out.println("DIESEL");
			
		}else if (car instanceof ElectricCar) {
			System.out.println("ELECTRIC");
			
		}
	}
	
	
}
