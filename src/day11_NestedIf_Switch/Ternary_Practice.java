package day11_NestedIf_Switch;

public class Ternary_Practice {
    public static void main(String[] args) {
        int age = 5 ;
        String citizenship = "US";
        String result = "";
        if(age>=18 && citizenship=="US"){
            result = "Can Vote";
        }
        else{
            result = "Can NOT Vote";
        }
        System.out.println(result);
    }
}
