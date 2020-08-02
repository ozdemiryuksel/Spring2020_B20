package OfficeHours;

public class _7_20_2020_Max3DArray {
    public static void main(String[] args) {
        int[][][] arr3D= {{{1,2},{3,40}},{{5,6,7},{8,9,10}}};
        int max = arr3D[0][0][0];
        for(int[][] each2D:arr3D){
            for(int[] each1D:each2D){
                for(int each:each1D){
                    if(each>max){
                        max=each;
                    }
                }
            }
        }
        System.out.println("Max: "+max);
        int min = arr3D[0][0][0];
        for(int[][] each2D:arr3D){
            for(int[] each1D:each2D){
                for(int each:each1D){
                    if(each<min){
                        min=each;
                    }
                }
            }
        }
        System.out.println("Min: "+min);
    }
}
