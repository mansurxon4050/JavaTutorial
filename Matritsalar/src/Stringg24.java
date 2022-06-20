import java.util.Scanner;

public class Stringg24 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k, s = 0;
        String st = kirit.next();
        String st1 = "";
        for (int i = 0; i < st.length(); i++) {
            k = 1;
            int n = Integer.parseInt(String.valueOf(st.charAt(i)));
            for (int j = 1; j < st.length() - i; j++) {
                k = k * 2;
            }
            s = s + (n * k);
            st1 = st1.concat(String.valueOf(s));
        }
        System.out.println(st1);
    }
}
