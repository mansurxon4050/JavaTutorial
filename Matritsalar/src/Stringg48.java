import java.util.Scanner;

public class Stringg48 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st2 = kirit.next();
        char c =st2.charAt(0);
        st2=st2.replace(c, '.');
        st2=st2.replaceFirst(".", String.valueOf(c));
        System.out.println(st2);
    }
}
