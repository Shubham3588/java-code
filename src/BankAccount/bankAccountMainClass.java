package BankAccount;

public class bankAccountMainClass {
    public static void main(String[] args) {
        bankAccount shubham = new bankAccount();
        shubham.setAccountNumber("34578754567654");
        shubham.setAccountBalance(3200);
        shubham.setCustomerName("Shubham Pandey");
        shubham.setEmail("test@gmail.com");
        shubham.setPhoneNumber("7654334567");
        shubham.depositingAmount();
        shubham.withdrawingAmount();



    }
}
