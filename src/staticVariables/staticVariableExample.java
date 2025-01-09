package staticVariables;

public class staticVariableExample {
    private static String  name ;

    public staticVariableExample(String name){
        this.name=name;
    }
    public void printName(){
        System.out.println("name="+name);
    }


}
