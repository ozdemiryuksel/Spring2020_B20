package day40_CustomClassPractice;

public class BofA {
    public static void main(String[] args) {
        BankAccount yuksel = new BankAccount();
        yuksel.setInfo("Saving", "Yuksel Ozdemir", "12345678");
        yuksel.getInfo();
        yuksel.deposit(1000);
        yuksel.checkBalance();
        yuksel.withdraw(500);
        yuksel.checkBalance();
        yuksel.withdraw(1000);
        yuksel.checkBalance();
    }
}
