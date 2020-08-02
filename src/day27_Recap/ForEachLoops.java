package day27_Recap;
public class ForEachLoops {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("------------------------");

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("------------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        for(int each : scores){

        }

    }
}
