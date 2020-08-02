package day37_ArrayList;

import com.sun.deploy.panel.JreTableModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));
        System.out.println("original: "+list);
        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println("uniques removed: "+list);

        System.out.println("--------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ali", "veli", "anna", "Emre", "ahmet"));
        // find same first and last character
        System.out.println("original: "+names);
        names.removeIf(p->p.toLowerCase().charAt(0)!=p.charAt(p.length()-1));
        System.out.println("removed: "+names);

        System.out.println("--------------");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 43, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); //90-100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); //80-99
        ArrayList<Integer> gradeOfC = new ArrayList<>(); //70-79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); //60-69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); //below 60
        // how many students at each grade, grade report, do not use loop

        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p->p<90);
        int sizeA = gradeOfA.size();

        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p->p<80||p>=90);
        int sizeB = gradeOfB.size();

        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p->p<70||p>=80);
        int sizeC = gradeOfC.size();

        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p->p<60||p>=70);
        int sizeD = gradeOfD.size();

        gradeOfF.addAll(grades);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        int sizeF = gradeOfF.size();

        System.out.println("A: "+sizeA);
        System.out.println("B: "+sizeB);
        System.out.println("D: "+sizeC);
        System.out.println("D: "+sizeD);
        System.out.println("F: "+sizeF);
    }
}
