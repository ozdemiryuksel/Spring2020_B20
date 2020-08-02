package day24_Arrays;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,10} ;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        String s1 = Arrays.toString(arr);
        System.out.println(s1);
        String[] names = {"ali","veli","ahmet","mehmet"};
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: "+arr[arr.length-1]);
        System.out.println("Min: "+arr[0]);
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
