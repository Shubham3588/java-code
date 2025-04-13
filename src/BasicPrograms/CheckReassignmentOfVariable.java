package BasicPrograms;

public class CheckReassignmentOfVariable {
    public static void main(String[] args) {

        CheckReassignmentOfVariable t  = new CheckReassignmentOfVariable();
        t.test1();
        test2();
    }

    public void test1(){
        int age=30;
        String name = "Shubham";
        System.out.println("My name is " + name + "I am " + age + " Years old");
        name = "Ankit";
        System.out.println("My name is " + name + "I am " + age + " Years old");

    }
    public static void test2(){
        int age=27;
        String name = "Priti";
        System.out.println("My name is " + name + "I am " + age + " Years old");
    }
}
