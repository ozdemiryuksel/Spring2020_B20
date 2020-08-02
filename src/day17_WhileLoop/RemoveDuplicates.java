package day17_WhileLoop;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabccd" ;
        String result = "";
        for(int i=0;i<=str.length()-1;i++){
            String s = ""+str.charAt(i);
            if(!result.contains(s)){
                result += s ;
            }
        }
        System.out.println(result);
    }
}
