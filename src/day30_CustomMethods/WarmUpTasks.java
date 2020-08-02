package day30_CustomMethods;
import javafx.geometry.Pos;

import java.util.Arrays;
public class WarmUpTasks {

    public static void main(String[] args) {
        maxNumber(20,20);
        int[] dizi = {5,9,2,7,1,6,3};
        printDescending(dizi);
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        combineArrays(arr1,arr2);
        PosNegZero(0);
        int[] arr3 = {10, -10, -20, -30, 0, 0, 90, 500};
        for(int each:arr3){
            PosNegZero(each);
        }


    }

    public static void maxNumber(int a, int b){
        if(a==b){
            System.out.println("equal");
            return;
        }
        if(a>=b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }

    public static void printDescending(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void combineArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0;
        for(int each:arr1){
            arr3[i]=each;
            i++;
        }
        for(int each:arr2){
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }

    public static void addition(){

    }



}
