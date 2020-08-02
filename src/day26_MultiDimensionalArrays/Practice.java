package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] testers = {"ali", "veli", "ahmet", "mehmet"};
        String[] developers = {"nuri", "muri"};
        String[] SM = {"yuksel"};
        String[] PO = {"kadir"};
        String[] BA = {"alex"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "adem";
        scrumTeam[1][1] = "metin";

        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("----------------------------");

        for(String[] each:scrumTeam){
            for(String name:each){
                System.out.println(name);
            }
        }

        System.out.println("----------------------------");

        int[][] scores = {{10,20,20,45},{60,55,75,100},{93,40,125,135}};
        // print out numbers divisible by 3 and 5
        for(int[] each1DArray:scores){
            for(int eachElement:each1DArray){
                if(eachElement%3==0&&eachElement%5==0){
                    System.out.println(eachElement+" ");
                }
            }
        }
        System.out.println("----------------------------");

        int[][] a1 = {{1,2},{3,4,5}};
        int[][] a2 = {{6,7},{8,9,10}};

        int[][][] a3 = {{{1,2},{3,4,5}},{{6,7},{8,9,10}}};

        System.out.println(Arrays.deepToString(a3));

    }
}
