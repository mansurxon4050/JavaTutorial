import java.util.Scanner;

public class String53 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 =kirit.nextLine();
        char[] c={'.' , ',' , '!' , '?' , '-' , '(' , ')'};
        int k=0;
        for (int i = 0; i < st1.length(); i++) {
            for (char value : c) {
                if (st1.charAt(i)==value) k++;
            }
        }
        System.out.println(k);

    }
}
