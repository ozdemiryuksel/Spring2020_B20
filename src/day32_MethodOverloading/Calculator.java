package day32_MethodOverloading;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first: ");
        double first = scan.nextDouble();
        System.out.println("operator: ");
        char operator = scan.next().charAt(0);
        System.out.println("enter second: ");
        double second = scan.nextDouble();

        double result = calculator(first, operator, second);

        System.out.println(first+" "+operator+" "+second+" = "+result);
    }

    public static double calculator(double num1, char oper, double num2){
        double result = (oper=='+')?num1+num2:(oper=='-')?num1-num2
                :(oper=='*')?num1*num2:(oper=='/')?num1/num2:(oper=='%')?num1%num2:0;
        return result;
    }
}
