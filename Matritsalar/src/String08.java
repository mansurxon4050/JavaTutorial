import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        char c = kirit.next().charAt(0);
        int n = kirit.nextInt();
        String st = "";

        for (int i = 0; i < n; i++) {
            st = st.concat(String.valueOf(c));
        }
        System.out.println(st);
    }
}
