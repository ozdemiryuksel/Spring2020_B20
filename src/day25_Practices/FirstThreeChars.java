package day25_Practices;
public class FirstThreeChars {
    public static void main(String[] args) {
        String[] words={"ali","veli","mehmet","ahmet"};
        for(String each : words){
            System.out.println(each.substring(0,3));
        }
    }
}
