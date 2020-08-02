package day26_MultiDimensionalArrays;
import java.util.Arrays;
public class Intro {
    public static void main(String[] args) {
        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};

        char [][] ch2D = {{'A','B'}, {'C','D','E'}, {'F','G','H'}};
        // char [][] ch2D2 = {ch1, ch2, ch3};

        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(ch2D[2][2]);
        System.out.println(ch2D[2][1]+" "+ch2D[0][1]);

        System.out.println("----------------------------");

        int[][] nums = {{1,2}, {2,3,4}, {5,6,7}};
        System.out.println(Arrays.toString(nums[2]));

        System.out.println("----------------------------");

        for(int i=0;i<=nums.length-1;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));


    }
}
