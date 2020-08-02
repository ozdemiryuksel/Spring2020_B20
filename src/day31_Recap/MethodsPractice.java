package day31_Recap;

public class MethodsPractice {

    public static void main(String[] args) {
        max(20,30);
        System.out.println(max2(10,20));
    }

    public static void max(int a, int b){
        int max = a > b ? a : a==b ? 0 : b;
        System.out.println(max);
    }

    public static int max2(int a, int b){
        return (a>b) ? a : b ;
    }
}
