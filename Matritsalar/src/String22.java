import java.util.Scanner;

public class String22 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String str = kirit.next();
        int son, s = 0;
        for (int i = 0; i < str.length(); i++) {
            son = Integer.parseInt(String.valueOf(str.charAt(i)));
            s += son;
        }
        System.out.println(s);
    }

}
