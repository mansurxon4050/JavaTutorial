import java.util.Scanner;

public class String52 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String[] strArray = st1.split("\\s+");
        st1 = "";
        for (String x : strArray) {
            char c = x.charAt(0);
            String d = String.valueOf(x.charAt(0)).toUpperCase();
            x = x.replaceFirst(String.valueOf(c), d);
            st1 = st1.concat(x + " ");
        }       System.out.println(st1);
    }
}
//            x=x.replace(x.charAt(0),)