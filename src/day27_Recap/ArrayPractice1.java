package day27_Recap;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice1 {
    public static void main(String[] args) {
        String[] names = {"ali","veli","deli"};
        System.out.println(names[1]);

        System.out.println("-------------------------");

        for(int i=0;i<=names.length-1;i++){
            if(!names[i].startsWith("a")){
                continue;
            }
            System.out.println(names[i]);
        }

        System.out.println("-------------------------");

        int[] numbers = new int[5];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names?");
        String[] students = new String[scan.nextInt()];
        scan.nextLine();
        for(int i=0;i<=students.length-1;i++){
            System.out.println("enter name");
            students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));
    }
}
