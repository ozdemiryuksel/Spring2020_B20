package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import Library.Util;

public class Frequency {
    public static void main(String[] args) {
        String str = "AAABBC";
        ArrayList<String> list = new ArrayList<>();
        for(String each:str.split("")){
            list.add(each);
        }
        System.out.println(list);

        String nonDup = Util.removeDup(str);
        for(String each:nonDup.split("")){
            int count = Collections.frequency(list,each);
            System.out.print(each+count);
        }
        // add line
    }
}
