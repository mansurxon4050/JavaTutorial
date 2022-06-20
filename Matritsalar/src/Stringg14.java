import java.util.Scanner;

public class Stringg14 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.next();
        int k = 0;
        for (int i = 0; i < st.length(); i++) {
            char n = st.charAt(i);
            if (n >= 'A' && n <= 'Z') {
                k++;
            }
        }
        System.out.println(k + " ta");
    }
}
