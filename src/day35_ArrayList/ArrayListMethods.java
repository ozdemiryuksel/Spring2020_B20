package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("yuksel");
        list.add("ali");
        list.add("veli");
        list.add("deli");
        list.add("ahmet");

        list.set(2,"mahmut");
        list.set(0,"hasan");

        System.out.println(list);

        list.clear();

        System.out.println(list);
        System.out.println(list.size());

        System.out.println("\n----------------\n");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        Integer a = 1;
        list2.remove(a);
        System.out.println(list2);

        System.out.println("\n----------------\n");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("ali");
        list3.add("veli");
        list3.add("deli");
        list3.add("hasan");
        list3.add("ahmet");
        System.out.println(list3);
        list3.remove(2);
        System.out.println(list3);
        list3.remove("ali");
        System.out.println(list3);
    }
}
