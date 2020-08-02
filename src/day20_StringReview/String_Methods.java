package day20_StringReview;

public class String_Methods {
    public static void main(String[] args) {
        String str = " cybertek ";
        str = str.toUpperCase();
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        str = str.substring(3,str.length());
        System.out.println(str);
    }
}
