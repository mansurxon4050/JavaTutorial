import java.util.Scanner;

public class Stringg49 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        char c = st1.charAt(0);
        st1=st1.replace(c,'.');
        st1=st1.substring(0,st1.length()-1);
        st1=st1.concat(String.valueOf(c));
        System.out.println(st1);
    }
}
