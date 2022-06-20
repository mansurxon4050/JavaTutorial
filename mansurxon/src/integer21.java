import java.util.Scanner;

public class integer21 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        System.out.println(a/60 +"minut");
        System.out.println(a + "sekund");
        System.out.println(a/3600 + "soat");
    }
}
