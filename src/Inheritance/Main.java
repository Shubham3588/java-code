package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",600);
        doAnimalStuff(animal,"Fast");

        Dog d = new Dog();
        doAnimalStuff(d,"Fast");

    }

    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____________________________");

    }


}

