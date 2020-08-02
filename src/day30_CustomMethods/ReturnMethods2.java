package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "level";
        String reversed = revStr2(name);
        System.out.println(name+" is palindrome? "+name.equalsIgnoreCase(revStr2(name)));


    }

    public static void revStr1(String str){
        String result = "";
        for(int i=str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String revStr2(String str){
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }

}
