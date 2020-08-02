package day29_CustomMethods;

public class MethodWithoutParameter2 {
    public static void oddNumbers(){
        for(int i=1;i<=10;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printHello5X();
        System.out.println("yuksel");
        printHello5X();
        System.out.println("ozdemir");
        oddNumbers();
        System.out.println("----------------------");
        // age(birthYear:2000);
    }
    public static void printHello5X(){
        for(int i=10;i>=6;i--){
            System.out.println("hello");
        }
    }
    public static void age(int birthYear, int currentYear){}
    // int age = currentYear - birthYear;
    // System.out.println("You are "+age+" years old");
}
