import java.util.Scanner;

public class String62 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        String[] a = st.split("\\a+");
        String newstr = "";
        String newA = "";
        for (String x : a) {
            for (int i = 0; i < x.length(); i++) {
                int l = x.charAt(i) + 1;
                if (l == 123)
                    l -= 26;
                char c = (char) l;
                newstr = newstr.concat(c + "");
            }
            newA = newA.concat(newstr + " ");
        }
        System.out.println(newA);
    }
}
