package day29_CustomMethods;

public class Frequency {
    public static void main(String[] args) {
        int count = frequency("hhdhdjjkkkkdhhhhhhhhhh", 'k');
        System.out.println(count);
        int count2 = frequency("hhdhdjjkkkkdhhhhhhkkhhhh", 'k');
        System.out.println(count2);
    }

    public static int frequency(String str, char ch){
        // String str="hhdhdjjkkkkdhhhhhhhhhh", char ch='k';
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            char each = str.charAt(i);
            if(each==ch){
                count++;
            }
        }return count;
    }

}
