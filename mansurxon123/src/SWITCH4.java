import java.util.Scanner;

public class SWITCH4 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int oy;
        oy = kirit.nextInt();
        switch (oy) {
            case 1 -> System.out.println("yavar 31 kun");
            case 2 -> System.out.println("fevral 28 kun");
            case 3 -> System.out.println("mart 31 kun");
            case 4 -> System.out.println("aprel 30 kun");
            case 5 -> System.out.println("may 31 kun");
            case 6 -> System.out.println("iyun 30 kun");
            case 7 -> System.out.println("iyul 31 kun");
            case 8 -> System.out.println("avgust 31 kun");
            case 9 -> System.out.println("sentabr 30");
            case 10 -> System.out.println("oktabr 31 kun");
            case 11 -> System.out.println("noyabr 30 kun");
            case 12 -> System.out.println("dekabr 31 kun");
            default -> throw new IllegalStateException("Unexpected value: " + oy);
        }
    }
}
