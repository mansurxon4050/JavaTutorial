import java.util.Scanner;

public class String68 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String str = kirit.next();
        int k = 0, m = 0;
        for (int i = 0; i < str.length(); i++) {
            char min = str.charAt(0);
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) >= min) {
                    min = str.charAt(i); //  oldin indeksida bor element kelsa xato deb chiqarmadi!!
                } else {
                    System.out.println(str.charAt(i) + " qonuniyatni buzgan element !");
                    k = 1;
                    break; }
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (str.charAt(i) >= min) {
                    min = str.charAt(i);
                } else {
                    System.out.println(str.charAt(i) + " qonuniyatni buzgan element !");
                    m = 1;
                    break;
                } } }
        if (k != 1 && m != 1) System.out.println(0);
    }
}