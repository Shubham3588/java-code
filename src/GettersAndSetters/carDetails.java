package GettersAndSetters;

public class carDetails {

    private String make = "BMW";
    private String color = "Red";
    private int numberOfDoors = 2;
    private boolean isConvertible = true;

    public String getMake(){
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void setMake(String make){
        this.make=make;
        if(make==null){
            make="unknown";
        }
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "Porsche","BMW","Audi" -> this.make=make;
            default -> {this.make = "unknown car";}
        }
    }

    public   void carDetails(){
        System.out.println(make + " is having colour" + color + " with number of doors" + numberOfDoors + "is convertible?" + isConvertible);

    }
}
