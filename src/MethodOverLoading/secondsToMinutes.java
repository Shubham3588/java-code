package MethodOverLoading;

public class secondsToMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(46100)) ;
        System.out.println(getDurationString(120,100)) ;

    }

    public static String getDurationString(int seconds){


        int hours = seconds/3600;
        int remainSeconds  = seconds%3600;
        int minutes = remainSeconds/60;
        remainSeconds = remainSeconds%60;


    return hours + "h " + minutes + "m " + remainSeconds + "s";

    }

    public static String getDurationString(int minutes,int seconds){

        int hours = minutes/60;
        int remainMinutes = minutes%60;



    return hours + " h" + remainMinutes +"m"+ seconds +"s";
    }
}
