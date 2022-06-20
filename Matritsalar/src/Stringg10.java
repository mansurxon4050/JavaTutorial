import java.util.Scanner;

public class Stringg10 {
    public static void main(String[] args) {
        Scanner mansurxon = new Scanner(System.in);
        String st = mansurxon.next();
        char st2;
        for (int i = st.length() - 1; i >= 0; i--) {
            st2 = st.charAt(i);
            System.out.print(st2 + " ");
        }
    }
}

