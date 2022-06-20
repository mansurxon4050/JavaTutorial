import java.util.Scanner;

public class String63 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        int k = kirit.nextInt();
        String newst = "";
        String[] a = st.split(" \\s*");
        for (String x : a) {
            String newA = "";
            for (int i = 0; i < x.length(); i++) {
                int m = x.charAt(i) + k;
                if (m > 122)
                    m -= 26;
                char c = (char) m;
                newA = newA.concat(String.valueOf(c));
            }
            newst = newst.concat(newA + " ");
        }
        for (int i = 97; i < 123; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println(newst);
    }
}
