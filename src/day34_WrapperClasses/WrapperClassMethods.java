package day34_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str); //123

        System.out.println(str+1);
        System.out.println(a+1);

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s1 = "TRUE"; //case insensitive
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1);

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2); //Unboxing
        System.out.println(d2*2);

        String s3 = "FalSe";
        boolean r2 = Boolean.valueOf(s3);
        System.out.println(r2);

    }
}
