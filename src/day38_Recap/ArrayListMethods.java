package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("toyota", "mercedes", "tesla", "nissan", "honda", "mercedes", "tesla", "mercedes"));
        System.out.println(cars);

        System.out.println("---------------");

        ArrayList<String> cars1 = new ArrayList<>();
        cars1.addAll(cars);
        cars1.remove("mercedes");
        System.out.println(cars1);
        cars1.removeAll(Arrays.asList("mercedes"));
        System.out.println(cars1);

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.addAll(cars);
        cars2.removeIf(each->each.contains("s"));
        System.out.println(cars2);

        ArrayList<String> cars3 = new ArrayList<>();
        cars3.addAll(cars);
        cars3.retainAll(Arrays.asList("tesla"));
        System.out.println(cars3);

        System.out.println("---------------");

        System.out.println(cars.contains("lexus"));
        System.out.println(cars.containsAll(Arrays.asList("toyota", "honda")));
        System.out.println(cars.size());
        System.out.println(cars);
        cars.set(cars.size()-1, "toyota");
        System.out.println(cars);
        cars.set(cars.indexOf("toyota"), "lexus");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);


    }
}
