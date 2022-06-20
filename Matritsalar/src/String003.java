import java.util.Scanner;

public class String003 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        char c = kirit.next().charAt(0);
        System.out.println((char) (c - 1) + " " + (char) (c + 1));
    }
}
