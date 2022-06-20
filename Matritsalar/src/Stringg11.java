import java.util.Scanner;

public class Stringg11 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1, st = kirit.next();
        char st2;
        for (int i = 0; i < st.length(); i++) {
            st2 = st.charAt(i);
            st1 = " ".concat(String.valueOf(st2));
                    System.out.print(st1 );
        }
    }
}
