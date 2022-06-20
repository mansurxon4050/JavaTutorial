import java.util.Scanner;

public class Stingg07 {
    public static void main(String[] args) {
        Scanner mansurxon = new Scanner(System.in);
        String st = mansurxon.next();
        int stboshi = st.charAt(0);
        int stoxiri = st.charAt(st.length() - 1);
        System.out.println(stboshi + " " + stoxiri);

    }
}
