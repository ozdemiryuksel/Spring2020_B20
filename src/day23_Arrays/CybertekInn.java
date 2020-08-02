package day23_Arrays;
import java.util.Scanner;
public class CybertekInn {
    public static void main(String[] args) {
        /*
        write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

         */

        Scanner scan = new Scanner(System.in);
        int total = 0;
        while(true) {
            System.out.println("Welcome to Cybertek Inn");
            System.out.println("Please choose");
            System.out.println("1. King $120");
            System.out.println("2. Queen $100");
            System.out.println("3. Single $80");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
            }
            System.out.println("do you wanna add room");
            String a = scan.next().toLowerCase();
            if(a.equals("no")){
                break;
            }
        }
        System.out.println("Your total is:"+total);
    }
}
