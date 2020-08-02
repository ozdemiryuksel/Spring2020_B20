package day29_CustomMethods;

import java.util.Enumeration;

public class EligibleToVote {

    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

    public static void main(String[] args) {
        eligibleToBuyAlcohol(true, 20);
        calculator(100, '-', 20);
    }

    public static void cote(String name, int age, boolean citizen, String candidateName){
        boolean eligibleToVote = age>=18&& citizen==true;
        if(eligibleToVote){
            System.out.println();
        }
    }

    public static void calculator(double num1, char operator, double num2){
        switch (operator){
            case '+':
                System.out.println("Addition: "+num1+num2);
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+num1*num2);
                break;
            case '/':
                System.out.println("Division: "+num1/num2);
                break;
            case '%':
                System.out.println("Remainder: "+num1%num2);
                break;
            default :
                System.out.println("Invalid!");
        }
    }

}
