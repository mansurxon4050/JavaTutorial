import java.util.Scanner;

public class SWITCH3 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int fasl;
        fasl= kirit.nextInt();
        switch (fasl){
            case 3,4,5 :
                System.out.println("bahor");
                break;
            case 6, 7 , 8:
                System.out.println("yoz");
            break;
            case 9,10,11:
                System.out.println("kuz");
            break;
            case 12,1,2:
                System.out.println("qish");
            default:
                System.out.println("oy raqamlari xato kiritildi");
        }
    }
}
