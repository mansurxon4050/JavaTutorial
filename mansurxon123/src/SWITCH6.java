import java.util.Scanner;

public class SWITCH6 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b = kirit.nextInt(); // 0<a<=5
        switch (a) {
            case 1 -> System.out.println("detsimetr =" + b / 10 + "metr");
            case 2 -> System.out.println("santimetr =" + b / 100 + " metr");
            case 3 -> System.out.println("kilometr =" + b * 1000 + " metr");
            case 4 -> System.out.println("millimetr =" + (b / 1000));
        }
    }
}
