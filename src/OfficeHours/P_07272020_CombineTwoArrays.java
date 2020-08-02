package OfficeHours;
import java.util.Arrays;
import java.util.Scanner;
public class P_07272020_CombineTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("type? i, s :");
        String type = scan.next();
        System.out.println("arr1 size?");
        int s1 = scan.nextInt();
        System.out.println("arr2 size?");
        int s2 = scan.nextInt();
        int s3 = s1+s2;

        if(type.equals("i")){
            int[] arr1 = new int[s1];
            int[] arr2 = new int[s2];
            int[] arr3 = new int[s3];
            System.out.println("enter arr1");
            for(int i1=0;i1<=s1-1;i1++){
                arr1[i1] = scan.nextInt();
            }
            System.out.println("enter arr2");
            for(int j1=0;j1<=s2-1;j1++) {
                arr2[j1] = scan.nextInt();
            }
            for(int i3=0;i3<=s1-1;i3++){
                arr3[i3] = arr1[i3];
            }
            for(int j3=0;j3<=s2-1;j3++) {
                arr3[j3+s1] = arr2[j3];
            }
            System.out.println(Arrays.toString(arr3));
        }

        if(type.equals("s")){
            String[] arr1 = new String[s1];
            String[] arr2 = new String[s2];
            String[] arr3 = new String[s3];
            System.out.println("enter arr1");
            for(int i1=0;i1<=s1-1;i1++){
                arr1[i1] = scan.next();
            }
            System.out.println("enter arr2");
            for(int j1=0;j1<=s2-1;j1++) {
                arr2[j1] = scan.next();
            }
            for(int i3=0;i3<=s1-1;i3++){
                arr3[i3] = arr1[i3];
            }
            for(int j3=0;j3<=s2-1;j3++) {
                arr3[j3+s1] = arr2[j3];
            }
            System.out.println(Arrays.toString(arr3));
        }

        /*
        char[] a1 = {'A', 'B', 'C'};
        char[] a2 = {'D', 'E', 'F', 'G'};

        char[] a3 = new char[a1.length+a2.length];
        */

        /* method 1
        int index = 0;
        for(char each:a1){
            a3[index]=a1[index];
            index++;
        }
        for(char each:a2){
            a3[index]=a2[index-a1.length];
            index++;
        }
        System.out.println(Arrays.toString(a3));
        */

        /*
        int index=0;
        for(int i=0; i<=a1.length-1; i++){
            a3[index]=a1[i];
            index++;
        }
        for(int j=0; j<=a2.length-1; j++){
            a3[index]=a2[j];
            index++;
        }
        System.out.println(Arrays.toString(a3));
        */
    }
}
