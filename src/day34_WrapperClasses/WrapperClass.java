package day34_WrapperClasses;
import java.util.Arrays;
public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;
        byte t = 100;
        int z = t;
        // Integer z2 = t; X

        Byte b1 = 50;
        int n1 = b1;
        byte b2 = 40;
        // Integer n2 = b1; X

        Integer n3 = new Integer(123);

        Integer[] arr = new Integer[3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; //Autoboxing

        Integer q1 = 500;
        int q2 = q1; // Unboxing

        // Double r1 = 300; wrapper clas is only dedicated to its primitive
        double r2 = 300;

    }
}
