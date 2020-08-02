package day28_Recap;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"ali", "veli", "deli", "ahmet", "mehmet", "mahmut"};
        String[] group2 = {"bir", "iki", "uc", "dort", "bes"};
        String[] group3 = {"ankara", "istanbul", "izmir"};
        String[] group4 = {"sari", "kirmizi", "mavi", "yesil", "siyah", "beyaz", "mor"};

        String[][] batch = {group1, group2, group3, group4};

        for(int i=0;i<=batch.length-1;i++){
            String[] eachGroup = batch[i];
            // System.out.println(Arrays.toString(eachGroup));

            for(int j=0;j<=eachGroup.length-1;j++){
                System.out.print(eachGroup[j]+" ");
            }
        }
        System.out.println();
    }
}
