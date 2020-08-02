package Practice;

public class ReverseInt {
    public static void main(String[] args) {
        // reverse integer without use String
        int input = 34567;
        int reverse = 0;
        while(input != 0){
            reverse = reverse*10+input%10;
            input /= 10;
        }
        System.out.println(reverse);
    }
}
