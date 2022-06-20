import java.util.Scanner;

public class SWITCH8 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int d,m;
        d= kirit.nextInt();
        m = kirit.nextInt();
        switch (m){
            case 1-> System.out.println(d + "yanvar");
            case 2-> System.out.println(d + "fevral");
            case 3-> System.out.println(d + "mart");
            case 4-> System.out.println(d + "aprel");
            case 5-> System.out.println(d + "may");
            case 6-> System.out.println(d + "iyun");
            case 7-> System.out.println(d + "iyul");
            case 8-> System.out.println(d + "avgust");
            case 9-> System.out.println(d + "sentabr");
            case 10-> System.out.println(d + "oktabr");
            case 11-> System.out.println(d + "noyabr");
            case 12-> System.out.println(d + "dekabr");
            default -> System.out.println("xato");

        }
    }
}
