package day32_MethodOverloading;
import Library.Util;
import java.util.Arrays;
public class MethodCalls {
    public static void main(String[] args) {
        String firstName = "yuKSel";
        String lastName = "OzDEmiR";
        System.out.println("entered: "+lastName+" "+firstName);

        String fullName = Util.formatFullName(lastName, firstName);
        System.out.println("fullname: "+fullName);

        String uniques = Util.uniques(fullName);
        System.out.println("uniques: "+uniques);

        String reversed = Util.reverse(fullName);
        System.out.println("reversed: "+reversed);

        System.out.println("\n-----------------\n");

        int[] a = {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 70};
        int n = 2500;

        int[] b = Util.addElement(a, n);
        System.out.println(Arrays.toString(b));
    }
}
