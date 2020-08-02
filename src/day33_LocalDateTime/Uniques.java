package day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr1 = {2,2,1,3,3,4,5,6};
        uniqueElements(arr1);
        char[] arr2 = {'C', 'B', 'C', 'A', 'D', 'D', 'E'};
        uniqueElements(arr2);
        String[] arr3 = {"bir", "iki", "uc", "iki", "dort", "uc", "bes", "alti"};
        uniqueElements(arr3);
    }

    public static void uniqueElements(int[] arr){
        for(int element : arr){
            int count = 0;
            for(int b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(char[] arr){
        for(char element : arr){
            int count = 0;
            for(char b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(String[] arr){
        for(String element : arr){
            int count = 0;
            for(String b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

}
