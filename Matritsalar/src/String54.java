import java.util.Scanner;

public class String54 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st = kirit.nextLine();
        int k=0;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)>='A' && st.charAt(i)<='Z')
                k++;
        }
        System.out.println(k);
    }
}
