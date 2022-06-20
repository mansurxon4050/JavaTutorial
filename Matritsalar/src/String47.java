import java.util.Scanner;

public class String47 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String[] stArray = st1.split("\\s+");
        st1 = "";
        for (String x : stArray) {
            st1 = st1.concat(x + ".");
        }
        System.out.println(st1);
    }
}
