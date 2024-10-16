package Inheritance;

public class Animal {
    private String type;
    private String Size;
    private int weight;

    public Animal(){

    }

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.Size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", Size='" + Size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void move(String speed){
        System.out.println(type+ " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " Makes some kind of noise");
    }
}
