package day40_CustomClassPractice;

public class BankAccount {
    String type;
    String holder;
    String number;
    double balance;

    public void setInfo(String accType, String accName, String accNum){
        type = accType;
        holder = accName;
        number = accNum;
    }

    public void getInfo(){
        System.out.println("Account Holder: "+holder);
        System.out.println("Account Number: "+number);
        System.out.println("Account Balance: "+balance);
        System.out.println("---------");
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("$ "+amount+" deposited to: "+holder);
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>=balance){
            System.out.println("$ "+amount+" withdrawing");
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("$ "+amount+" withdrawn from: "+holder);
        balance -= amount;
    }
}
