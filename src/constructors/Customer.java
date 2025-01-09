package constructors;

import java.util.SplittableRandom;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public Customer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public Customer(){
        this("Shubham",234.65,"test@email.com");
    }
    public Customer(String name,String email){
        this(name,678.98,email);
        this.name=name;
        this.email=email;
    }
}
