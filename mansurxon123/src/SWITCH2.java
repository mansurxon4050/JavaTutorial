import java.util.Scanner;

public class SWITCH2 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int baho;
        baho = kirit.nextInt();
        switch (baho){
            case 1:
                System.out.println("yomon");
          break;
            case 2:
                System.out.println("qoniqarsiz");
                break;
            case 3:
                System.out.println("qoniqarli");
                break;
            case 4:
                System.out.println("yaxshi");
                break;
            case 5:
                System.out.println("a'lo");
            default:
                System.out.println(" baholash xato kiritildi");
        }
    }
}
