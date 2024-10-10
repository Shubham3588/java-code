package GettersAndSetters;

public class mainCarClass {
    public static void main(String[] args) {

        carDetails car = new carDetails();
    //    System.out.println(car.getMake());
      //  car.carDetails();

        car.setMake("Mahindra");
        car.setColor("Red");
        car.setNumberOfDoors(2);
        car.setConvertible(false);
        car.carDetails();


    }
}
