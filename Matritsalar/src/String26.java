import java.util.Scanner;

public class String26 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        int n = kirit.nextInt();
        int uzun = st1.length();
        if (n > uzun) {
            for (int i = 0; i < n - uzun; i++) {
                st1 = "*".concat(st1);
            }
        } else {
            st1 = st1.substring(st1.length() - 1 - n);
        }
        System.out.println(st1);
    }
}