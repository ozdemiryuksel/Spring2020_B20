package day38_Recap;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'T', 'O', 'A', 'C', 'B'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("ali", "veli", "deli", "ahmet", "mehmet", "ali"));
        System.out.println(students);
        Collections.swap(students, 1,4);
        System.out.println(students);
        System.out.println(Collections.frequency(students, "ali"));

        System.out.println("--------------");

        ArrayList<String> unique = new ArrayList<>();
        for(String each:students){
            int i = Collections.frequency(students, each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(students);
        unique2.removeIf(each -> Collections.frequency(unique2, each)>1);
        System.out.println(unique2);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,100,99,-1,-3,100,100,100));
        System.out.println("max: "+Collections.max(list));
        System.out.println("min: "+Collections.min(list));

        Collections.replaceAll(list, 9,99);

        System.out.println(list);

    }

}
