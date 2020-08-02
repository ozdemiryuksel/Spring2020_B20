package day27_Recap;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        String[] names = {"ali","veli","ahmet","mehmet"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int[] score = {10,20,30,40,50,60,70,80};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Max: "+score[score.length-1]);
        System.out.println("Min: "+score[0]);

        System.out.println("-----------------");

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","B","C"};
        String[] s3 = {"A","C","B"};
        System.out.println(Arrays.equals(s1,s2));
        System.out.println(Arrays.equals(s1,s3));
        Arrays.sort(s3);
        System.out.println(Arrays.equals(s1,s3));

        System.out.println("-----------------");



    }
}
