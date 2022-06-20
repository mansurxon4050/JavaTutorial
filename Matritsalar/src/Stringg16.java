import java.util.Scanner;

public class Stringg16 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.next();
        int k, l = 0;
        for (int i = 0; i < st.length(); i++) {
            char n = st.charAt(i);
            if (n >= 'A' && n <= 'Z') {
                k = n - 'A';
                for (int j = 'a'; j <= 'z'; j++) {
                    l++;
                    if (l == k) {
                        System.out.print(j+" ");
                    }
                }
            } else
                System.out.print(n);
        }
    }

}
