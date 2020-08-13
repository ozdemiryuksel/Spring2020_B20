package day00;
import java.util.*;
public class replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int d=0;
        System.out.println("Day "+d+" "+Arrays.toString(inhabitants));
        while(inhabitants[1]!=0||inhabitants[2]!=0||inhabitants[3]!=0||inhabitants[4]!=0||inhabitants[5]!=0||inhabitants[6]!=0||inhabitants[7]!=0){
            for(int k=0; k<inhabitants.length; k++){
                if(k==0){
                    if(inhabitants[k+1]==0){
                        inhabitants[k] /= 2 ;
                    }
                }
                if(k>=1&&k<=6){
                    if(inhabitants[k-1]==0||inhabitants[k+1]==0){
                        inhabitants[k] /= 2 ;
                    }
                }
                if(k==7){
                    if(inhabitants[k-1]==0){
                        inhabitants[k] /= 2 ;
                    }
                }
            }
            d++;
            System.out.println("Day "+d+" "+Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
    }
}