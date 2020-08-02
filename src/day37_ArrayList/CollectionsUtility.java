package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,20,0,-1,-3,400,500));
        //Max min
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Max: "+max+", Min: "+min);

        System.out.println("----------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("ali", "veli", "deli", "ahmet", "mehmet"));
        System.out.println(names);
        Collections.replaceAll(names, "ali", "yuksel");
        System.out.println(names);


    }
}
