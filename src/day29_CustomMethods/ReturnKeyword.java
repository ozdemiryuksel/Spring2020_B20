package day29_CustomMethods;

public class ReturnKeyword {
    public static void main(String[] args) {
        eligibleToBuy(23);
    }
    public static void eligibleToBuy(int age){
        if(age<=21) {
            System.out.println("Not Eligible");
            return;
        }
        System.out.println("Eligible");
    }
}
