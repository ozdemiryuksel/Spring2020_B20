package day10_IfStatemenets;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '9';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122) ; // upper lower

        if(isAlphabetic){
            System.out.println(character+" is alphabetic");
        }
        else{
            System.out.println(character+" is not alphabetic");
        }
    }
}
