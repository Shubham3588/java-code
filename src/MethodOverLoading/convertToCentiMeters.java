package MethodOverLoading;

public class convertToCentiMeters {

    public static void main(String[] args){

      // double heightInCM = convertToCentimeters(1);
        System.out.println(convertToCentimeters(1));

      //   heightInCM = convertToCentimeters(5,2);
        System.out.println(convertToCentimeters(5,2));

    }
    public static double convertToCentimeters(int height){
        double convertedHeight = height*2.54;
        return  convertedHeight;
    }
    public static double convertToCentimeters(int heightInFeet,int heightInInches){
       int heightInInch = heightInFeet*12+heightInInches;

       return  convertToCentimeters(heightInInch);
    }
}
