package day33_LocalDateTime;
import java.util.Arrays;
public class Calculate {

    public static void main(String[] args) {
        int a = 10;
        double b = 20;

        System.out.println(addition(a,(int)b));
        float num1 = 10;
        float num2 = 9;
        System.out.println(addition((int)num1, (int)num2));
        System.out.println(addition(90, 5.5));
        System.out.println(addition(10,30));
        System.out.println(addition(0.5,2));
        int[] arr1 = {4,3,2,1};
        Arrays.sort(arr1);
        char[] arr2 = {'C', 'B', 'A'};
        Arrays.sort(arr2);
        System.out.println("Cybertek");
        System.out.println('A');
        System.out.println(123);
        System.out.println(12.5);

        long l1 = 100;
        long l2 = 200;

        System.out.println(multiplication(l1, l2));

    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double addition(double a, int b){
        return a+b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static long multiplication(long a, long b){
        return a*b;
    }


}
