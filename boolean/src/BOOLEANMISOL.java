import java.util.Scanner;

public class BOOLEANMISOL {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a, b;
        a = kirit.nextInt();
        b = kirit.nextInt();
        if (a != b) {
            if (a > b)
                System.out.println(a + " = kattaa");

            else
                System.out.println(b + " = katta");

        } else
            System.out.println(0);
        System.out.println(a + " " + b);
        }
    }
