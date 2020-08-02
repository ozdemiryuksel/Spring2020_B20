package day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str="AABBBBCCC";
        String result = ""; //A2B3C3
        String nonDup = Util.removeDup(str);

        for(int i=0;i<=nonDup.length()-1;i++){
            char ch = nonDup.charAt(i);
            int count = Util.frequency(str,ch);
            result += ""+ch+count;
        }

        /*
        for(char each: nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            result += ""+each+count;
        }
        */

        /*
        char ch1 = nonDup.charAt(0);
        int count1 = Util.frequency(str,ch1);
        char ch2 = nonDup.charAt(1);
        int count2 = Util.frequency(str,ch2);
        char ch3 = nonDup.charAt(2);
        int count3 = Util.frequency(str,ch3);
        result = ""+ch1+count1+ch2+count2+ch3+count3;
        */
        System.out.println(result);
    }
}
