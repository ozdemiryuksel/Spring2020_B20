package day00;
import java.util.Scanner;
public class r2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int ind1=0;
        int ind2=0;
        for(int i=0; i<str.length()-7; i++){
            if(str.substring(i,i+5).equals("bread")){
                ind1 = i;
                for(int j=i; j<str.length()-7; j++){
                    if(str.substring(j,j+5).equals("bread")){
                        ind2 = j;
                        System.out.println(ind1+" "+ind2);
                    }
                }
            }
        }
    }
}
