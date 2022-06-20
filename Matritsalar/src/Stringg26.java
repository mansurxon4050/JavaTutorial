import java.util.Scanner;

public class Stringg26 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        String st = kirit.next();
        int lenth = st.length();
            if (n > st.length()) {

                for (int i = 0; i < n - lenth; i++) {
                    st = "*".concat(st);
                }
            } else {
                st = st.substring(lenth - n);
            }
            System.out.println(st);
        }
    }

