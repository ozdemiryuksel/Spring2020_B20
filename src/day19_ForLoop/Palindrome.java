package day19_ForLoop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String p = "" ;
        for(int i=s.length()-1; i>=0; i--){
            p += s.charAt(i);
        }
        if(p.equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
