package day31_Recap;

public class WarmUpTasks {

    public static void main(String[] args) {
        String str = "aabccde";
        String uniques = uniques(str);
        System.out.println(uniques);
    }

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each : str.toCharArray()){
            if(each==ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){
        String uniques = "";
        for(char each:str.toCharArray()){
            int count = frequency(str, each);
            if(count==1){
                uniques += each;
            }
        }
        return uniques;
    }
}
