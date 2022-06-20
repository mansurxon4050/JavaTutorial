import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        String st = kirit.next();
        String st1 = null;
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < n; j++) {
                st1 = "*".concat(String.valueOf(st.charAt(i)));
                System.out.print(st1);
            }
        }


    }

}
