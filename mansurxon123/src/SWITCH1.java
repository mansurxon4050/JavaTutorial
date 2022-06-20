import java.util.Scanner;

public class SWITCH1 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int day ;
        day= kirit.nextInt();
        switch (day){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
                case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println(" Juma");
                break;
                case 6:
                System.out.println("shanba");
                break;
                case 7:
                System.out.println("Yakshanba");
            default:
                System.out.println("bunday hafta kuni yuq");

        }
    }
}
