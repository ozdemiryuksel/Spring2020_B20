package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount ali = new BankAccount();
        BankAccount veli = new BankAccount();
        BankAccount deli = new BankAccount();
        BankAccount ahmet = new BankAccount();
        BankAccount mehmet = new BankAccount();

        ali.setInfo("Business", "Ali Birinci", "453534523");
        veli.setInfo("Savings", "Veli Ikinci", "454364561");
        deli.setInfo("Checking", "Deli Adam", "475457657");
        ahmet.setInfo("Savings", "Ahmet Dorduncu", "4234534534");
        mehmet.setInfo("Checking", "Mehmet Besinci", "4532113312");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(ali, veli, deli, ahmet, mehmet));

        for(BankAccount each:accounts){
            each.deposit(500);
            each.getInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withdraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("--------------");
        accounts.removeIf(each -> each.balance<1000);
        for(BankAccount each:accounts){
            each.getInfo();
        }
    }
}
