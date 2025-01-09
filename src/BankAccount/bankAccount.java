package BankAccount;

import java.util.Scanner;

public class bankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositingAmount(){
        double amountCredited;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit");
        amountCredited = sc.nextDouble();

         accountBalance = amountCredited+accountBalance;
        System.out.println("Your Account Balance is" + accountBalance);
        return accountBalance;
    }
    public double withdrawingAmount(){
        double withdrawlAmount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        withdrawlAmount = sc.nextDouble();
        if(withdrawlAmount>accountBalance){
            System.out.println("Insufficient Balance");

        } else{
            accountBalance=accountBalance-withdrawlAmount;
            System.out.println("Account balance is: " +accountBalance);

        }
        return accountBalance;

    }
}
