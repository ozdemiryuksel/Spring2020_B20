package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitsLetters {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','c','3','d','$'));
        System.out.println("array: "+chars);
        chars.removeIf(p -> Character.isDigit(p)||Character.isLetter(p));
        System.out.println("special: "+chars);

        System.out.println("---------------");
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','1','b','2','c','3','d','$'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits: "+digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters: "+letters);

        ArrayList<Character> special = new ArrayList<>();
        special.addAll(list);
        special.removeAll(letters);
        special.removeAll(digits);
        System.out.println("special: "+special);

    }
}
