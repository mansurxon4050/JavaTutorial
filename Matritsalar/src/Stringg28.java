import java.util.Scanner;

public class Stringg28 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String S = kirit.nextLine();
        char C = kirit.next().charAt(0);
        String Str = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                S = S.concat(String.valueOf(S.charAt(i)).concat(String.valueOf(C)));
                System.out.println(S);
            }

        }
    }
}
