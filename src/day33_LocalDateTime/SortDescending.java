package day33_LocalDateTime;
import java.util.Arrays;
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        System.out.println(Arrays.toString(sortDesc(arr)));
    }

    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k=arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
}
