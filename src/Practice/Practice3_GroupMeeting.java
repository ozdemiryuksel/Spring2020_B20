package Practice;

public class Practice3_GroupMeeting {
    public static void main(String[] args) {
        String[] arr = {"E","R","I","R"};
        for(String a:arr){
            int count=0;
            for(String each:arr){
                if(a.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(a);
            }
        }
    }
}
