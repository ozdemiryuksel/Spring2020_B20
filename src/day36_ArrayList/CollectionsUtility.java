package day36_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsUtility {
    /*
    Arrays: utility class for array
    Collections: utility class for collection
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(10);
        list.add(30);
        list.add(40);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max: "+list.get(list.size()-1));
        System.out.println("Min: "+list.get(0));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);
        Collections.swap(list2,1,2);
        System.out.println(list2);
        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('A');
        list3.add('B');
        list3.add('A');
        list3.add('A');
        list3.add('C');

        System.out.println(Collections.frequency(list3, 'A'));


    }
}
