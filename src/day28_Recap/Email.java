package day28_Recap;

public class Email {
    public static void main(String[] args) {
        String email = "yuksel.ozdemir@live.com";
        String name = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.length());
        System.out.println("email: "+email);
        System.out.println("name: "+name);
        System.out.println("domain: "+domain);
    }
}
