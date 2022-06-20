import java.util.Scanner;

public class String69 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        int k = 0, t = 0;
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) == ')' && k != t)
                System.out.println(st1.charAt(i) + " ')' xato quyilgan");
            else if (st1.charAt(i) == '(') {
                k++;
                for (int j = i + 1; j < st1.length(); j++) {
                    if (st1.charAt(j) == ')') {
                        t++;
                        break;
                    }
                }
            }
        }
        if (k == t) System.out.println(0);
        else System.out.println(-1);
    }
}
