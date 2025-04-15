package Methods;

public class ConvertHeight {

    public static double convertToCentimeters(int heightInInches) {
        double heightInCnetimeter = heightInInches * 2.54;
        return heightInCnetimeter;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        double convertedHeight = (heightInFeet * 12) + remainingHeightInInches;
        double heightInCentimeters = convertToCentimeters((int) convertedHeight);
        return heightInCentimeters;

    }
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(7, 6));
    }
}
