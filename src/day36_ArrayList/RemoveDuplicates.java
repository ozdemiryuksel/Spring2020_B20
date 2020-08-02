package day36_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('B');
        list.add('C');
        list.add('C');

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();
        for(Character each:list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);
    }
}
