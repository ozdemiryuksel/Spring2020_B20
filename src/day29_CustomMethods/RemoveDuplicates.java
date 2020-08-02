package day29_CustomMethods;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abababacccdddeee";
        removeDup(str);
    }
    public static void removeDup(String str){
        String nonDup = "";
        for(String each:str.split("")){
            if (!nonDup.contains(each)) {
                nonDup += each ;
            }
        }
        System.out.println(nonDup);
    }

}
