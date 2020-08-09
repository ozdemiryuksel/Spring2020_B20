package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2ArrayList {
    public static void main(String[] args) {
        String[] arr1 = {"yuksel", "ali", "veli", "deli"};
        String[] arr2 = {"ahmet", "mehmet", "mahmut"};

        ArrayList<String> list = new ArrayList<>();
/*
        for(String each:arr1){
            list.add(each);
        }
        for(String each:arr2){
            list.add(each);
        }

 */
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list.toString());
    }
}
