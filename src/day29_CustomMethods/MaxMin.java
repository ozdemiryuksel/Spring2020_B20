package day29_CustomMethods;

public class MaxMin {

    public static void main(String[] args) {
        int[] numbers = {2,5,3,4,1};
        maxNum(numbers);
        minNum(numbers);
    }

    public static void maxNum(int[] arr){
        int max = arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println("max: "+max);
    }

    public static void minNum(int[] arr){
        int min = arr[0];
        for(int each:arr){
            if(each<min){
                min=each;
            }
        }
        System.out.println("min: "+min);
    }


}
