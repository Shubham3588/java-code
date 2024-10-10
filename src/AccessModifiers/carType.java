package AccessModifiers;

public class carType {

    private  String make = "BMW" ;
    private  String color = "RED";
    private  int doors = 02;
    private  boolean convertible = true;



    public   void carDetails(){
        System.out.println(make + " is having colour" + color + " with number of doors" + doors + "is convertible?" + convertible);

    }
}
