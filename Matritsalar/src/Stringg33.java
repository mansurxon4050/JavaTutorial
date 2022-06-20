import java.util.Scanner;

public class Stringg33 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String s1 = kirit.nextLine();
        String s2 = kirit.next();
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.contains(s2)) {
                s1 = s1.replaceFirst(s2, "");
                k++;
            }
        }
        System.out.println(k);
    }
}
