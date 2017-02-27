package testbug;

/**
 * Created by YJ on 2017/2/18.
 */
public class testbug {
    public static void main(String[] args) {

        System.out.println("ceshi");
        int a = 10;
        int b = 10;
        int c = add(a,b);
        System.out.println("ceshi");
    }

    public static int add(int a, int b) {
        int c = 0;
        c = a+c;
        ceshi();
        return c;
    }

    public static String ceshi(){
        System.out.println("ceshi");
        return "ceshi";
    }
}
