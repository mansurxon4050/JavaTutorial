            import java.util.Scanner;
            public class SWITCH19 {
            public static void main(String[] args) {
            Scanner kirit = new Scanner(System.in);
            int a= kirit.nextInt();
            switch (a%5){
            case 1-> System.out.print("Yashil");
            case 2-> System.out.print("qizil");
            case 3-> System.out.print("sariq");
            case 4-> System.out.print("oq");
            case 5-> System.out.print("qora");
            }switch (a%12){
            case 1-> System.out.println(" sichqon");
            case 2-> System.out.println(" sigir");
            case 3-> System.out.println(" yolbars");
            case 4-> System.out.println(" quyon");
            case 5-> System.out.println(" ajdar");
            case 6-> System.out.println(" ilon");
            case 7-> System.out.println(" ot");
            case 8-> System.out.println(" qo'y");
            case 9-> System.out.println(" maymun");
            case 10-> System.out.println(" tovuq");
            case 11-> System.out.println(" it");
            case 12-> System.out.println(" to'ng'iz");
            default -> System.out.println(" xato");
        }
    }
}
