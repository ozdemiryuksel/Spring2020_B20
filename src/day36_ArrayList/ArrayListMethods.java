package day36_ArrayList;

import java.security.acl.AclNotFoundException;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(50);

        System.out.println(list.indexOf(40));
        System.out.println(list.indexOf(70));
        System.out.println(list.lastIndexOf(40));
        System.out.println(list.contains(30));
        System.out.println(list.equals(list2));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
