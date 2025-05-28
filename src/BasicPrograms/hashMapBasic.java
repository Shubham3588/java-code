package BasicPrograms;

import java.util.HashMap;

public class hashMapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> roll = new HashMap<>();
        roll.put("Rahul",2);
        roll.put("Shyam",3);
        roll.put("Maheep",6);
        roll.put("Maheep",6);

        System.out.println(roll);

    }
}
