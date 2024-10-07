package basicProgram;

public class methodOverloading {
    public static double convertToCentimeters(int height){
        double heightInCentimeters = height*2.54;
        return heightInCentimeters;
    }

    public static void convertToCentimeters(int heightInFeet,int heightInInches){
        int convertedHeightInFeet = heightInFeet*12;
        int actualHeightInInches=convertedHeightInFeet+heightInInches;
        System.out.println(actualHeightInInches);
        convertToCentimeters(actualHeightInInches);
        System.out.println(convertToCentimeters(actualHeightInInches));
    }

    public static void main(String[] args) {
        convertToCentimeters(2,5);
    }
}
