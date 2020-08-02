package OfficeHours;
import java.util.Arrays;
import java.util.Scanner;
public class P_07212020_ArrayDesc {
    public static void main(String[] args) {
        int[] arr = {98, 97, 100, 200, 55, 68, 79, 34};
        System.out.println("entered: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted: "+Arrays.toString(arr));
        int[] descArr = new int[arr.length];
        int ind = arr.length-1;
        for(int i=0;i<=ind;i++){
            descArr[i]=arr[ind-i];
        }
        System.out.println("descending: "+Arrays.toString(descArr));

        System.out.println("\n----------------------\n");

        int[] arr2 = {98, 97, 100, 200, 68, 79, 34, 56, 12, 21};
        System.out.println("entered: "+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("sorted: "+Arrays.toString(arr2));
        int[] descArr2 = new int[arr2.length];
        int k=0;
        int ind2 = arr2.length-1;
        for(int each:arr2){
            descArr2[ind2-k] = each;
            k++;
        }
        System.out.println("descending: "+Arrays.toString(descArr2));

        System.out.println("\n----------------------\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers?");
        int size = scan.nextInt();
        int[] arr3 = new int[size];
        for(int i=0; i<=size-1; i++){
            System.out.println("Enter a number");
            arr3[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] descArr3 = new int[arr3.length];
        int k2=0;
        int ind3 = arr3.length-1;
        for(int each:arr3){
            descArr3[ind3-k2] = each;
            k2++;
        }
        System.out.println("descending: "+Arrays.toString(descArr3));

    }
}
