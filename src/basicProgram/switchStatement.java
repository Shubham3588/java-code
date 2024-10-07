package basicProgram;

import java.sql.SQLOutput;



public class switchStatement {

    public static void main(String[] args) {
        char word ='Z';
        String value = "";
        switch(word){
            case 'A':
                 value = "ALPHA";
                 break;
            case 'B':
                value = "Beta";
                break;
            case 'C':
                value = "charlie";
                break;
            case 'D':
                value = "DUCK";
                break;
            default:
                System.out.print("No value matched");
        }
        System.out.println(value);

    }

}
