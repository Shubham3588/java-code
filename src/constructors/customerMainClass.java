package constructors;

public class customerMainClass {
    public static void main(String[] args) {
        Customer shub = new Customer("shub",456.87,"test@gmail.com");
        System.out.println(shub.getName() + " with credit limit "+ shub.getCreditLimit() + " having mail id " + shub.getEmail());
        Customer priti = new Customer();
        System.out.println(priti.getName() + " with credit limit "+ priti.getCreditLimit() + " with email id" + priti.getEmail());
        Customer renu = new Customer("Renu","testrenu@gmail.com");
        System.out.println(renu.getCreditLimit());


    }
}
