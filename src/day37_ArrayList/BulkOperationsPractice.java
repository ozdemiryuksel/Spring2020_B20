package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperationsPractice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("ali");
        students.add("veli");
        students.add("deli");
        students.add("ahmet");
        students.add("mehmet");
        students.add("hasan");

        System.out.println(students.containsAll(Arrays.asList("mahmut","ali","deli")));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));
        System.out.println(numbers);

    }
}
