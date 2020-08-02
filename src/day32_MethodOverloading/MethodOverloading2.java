package day32_MethodOverloading;

public class MethodOverloading2 {

    public static void main(String[] args) {
        add2Num(10,20);
        add3Num(10,20,30);
        add4Num(10,20,30,40);

        System.out.println("\n------------\n");

        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
    }

    public static void add2Num(double a, double b){
        System.out.println(a+b);
    }

    public static void add3Num(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void add4Num(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }

    // ---

    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void add(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }
    
}
