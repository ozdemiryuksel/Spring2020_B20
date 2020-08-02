package day29_CustomMethods;

public class UniqueElements {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "B", "C"};
        uniques(arr1);

        String[] arr2 = {"D", "D", "E", "F", "F"};
        uniques(arr2);
    }

    public static void uniques(String[] arr){
        for(String a:arr){
            int count=0;
            for(String each:arr){
                if(a.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }
}
