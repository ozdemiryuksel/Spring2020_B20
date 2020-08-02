package day25_Practices;
import java.util.Arrays;
public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7,8,9};
        int[] arr2 = {3,6,9};

        int size = arr1.length+arr2.length;

        int[] arr3 = new int[size];

        int i = 0;

        for(int each:arr1){
            arr3[i] = each ;
            i++;
        }
        for(int each:arr2){
            arr3[i] = each ;
            i++;
        }

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);
        System.out.println("Max: "+arr3[arr3.length-1]);


    }
}
