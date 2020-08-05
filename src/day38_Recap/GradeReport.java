package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(100,95,85,75,65,87,77,47,63,53,43, 93,67,45,34));
        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();
        ArrayList<Integer> gradeB = new ArrayList<>();
        ArrayList<Integer> gradeC = new ArrayList<>();
        ArrayList<Integer> gradeD = new ArrayList<>();
        ArrayList<Integer> gradeF = new ArrayList<>();

        gradeA.addAll(list);
        gradeA.removeIf(each -> each<90);

        gradeB.addAll(list);
        gradeB.removeIf(each -> each<80 || each >=90);

        gradeC.addAll(list);
        gradeC.removeIf(each -> each<70 || each >=80);

        gradeD.addAll(list);
        gradeD.removeIf(each -> each<60 || each >=70);

        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);

        System.out.println("Grade A: "+gradeA.size()+" "+gradeA);
        System.out.println("Grade B: "+gradeB.size()+" "+gradeB);
        System.out.println("Grade C: "+gradeC.size()+" "+gradeC);
        System.out.println("Grade D: "+gradeD.size()+" "+gradeD);
        System.out.println("Grade F: "+gradeF.size()+" "+gradeF);

    }
}
