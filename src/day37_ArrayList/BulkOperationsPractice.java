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

        System.out.println("----------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));
        System.out.println(numbers);

        System.out.println("----------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1,2,5,10,11));
        System.out.println(nums);

        System.out.println("----------------------");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,11,12,13,14));
        System.out.println(num1);

        System.out.println("----------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("ali", "veli", "deli", "ali", "veli", "ahmet", "mehmet"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("ali"));
        System.out.println(employees);

    }
}
