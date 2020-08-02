package day35_ArrayList;
import java.util.ArrayList;
public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //autoboxing //0
        list.add(1,20); //1
        list.add(30); //2
        list.add(40); //3
        list.add(50); //4
        System.out.println(list);

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
