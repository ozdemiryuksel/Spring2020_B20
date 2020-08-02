package day34_WrapperClasses;
import java.util.Scanner;
public class WrapperClassPractice2 {
    public static void main(String[] args) {
        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=1;i<=5;i++){
            System.out.println("enter number");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);


    }

}
