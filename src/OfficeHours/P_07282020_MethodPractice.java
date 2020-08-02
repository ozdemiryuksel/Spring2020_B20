package OfficeHours;

public class P_07282020_MethodPractice {
    public static void main(String[] args) {
        System.out.println(rev("yuksel"));
        System.out.println("\n================\n");
        isPalindrome("level");
        System.out.println("\n================\n");
        String[] names = {"aslan", "ece", "fikri", "neden", "ahmet"};
        for(String each:names){
            isPalindrome(each);
        }
    }

    public static String rev(String str){
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        return res;
    }

    public static void isPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(str.equalsIgnoreCase(rev)?str+" is palindrome":str+" is not palindrome");
    }

}
