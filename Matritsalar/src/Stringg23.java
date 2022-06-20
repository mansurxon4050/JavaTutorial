import java.util.Scanner;
public class Stringg23 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        int son2, s = Integer.parseInt(String.valueOf(st.charAt(0)));
        for (int i = 1; i < st.length(); i += 2) {
            son2 = Integer.parseInt(String.valueOf(st.charAt(i + 1)));
            if (st.charAt(i) == '+') {
                s += son2;
            } else if (st.charAt(i) == '-') {
                s -= son2;
            }
        }
        System.out.println(s);
    }
}
