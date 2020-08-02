package day31_Recap;

public class MethodsPractice2 {
    public static void main(String[] args) {
        String name = "level";
        reverse1(name);
        System.out.println(reverse2(name));
        System.out.println(name.equalsIgnoreCase((reverse2(name)))); //datatype
    }

    public static void reverse1(String str){
        // void method
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
    public static String reverse2(String str){
        // datatype method
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
