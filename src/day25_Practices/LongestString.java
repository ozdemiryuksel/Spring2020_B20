package day25_Practices;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Ali", "Veli", "Muhammed", "Ahmet"};
        int maxLength = arr[0].length();
        for(String each : arr){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }
        for(String each : arr){
            if(each.length()==maxLength){
                System.out.println(each);
            }
        }
    }
}
