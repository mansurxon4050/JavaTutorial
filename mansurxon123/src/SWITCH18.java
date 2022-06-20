            import java.util.Scanner;
            public class SWITCH18 {
            public static void main(String[] args) {
            Scanner kirit = new Scanner(System.in);
            int a;
            a = kirit.nextInt();
            switch (a/100) {
            case 1-> System.out.print("bir yuz");
            case 2-> System.out.print("ikki yuz");
            case 3-> System.out.print("uch yuz");
            case 4-> System.out.print("tort yuz");
            case 5-> System.out.print("besh yuz");
            case 6-> System.out.print("olti yuz");
            case 7-> System.out.print("yetti yuz");
            case 8-> System.out.print("sakkiz yuz");
            case 9-> System.out.print("to'qqiz yuz");
            }switch ((a%100)/10) {
            case 1 -> System.out.println(" o'n");
            case 2-> System.out.print(" yigirma");
            case 3-> System.out.print(" o'ttiz");
            case 4-> System.out.print(" qirq");
            case 5-> System.out.print(" ellik");
            case 6-> System.out.print(" oltmish");
            case 7-> System.out.print(" yetmish");
            case 8-> System.out.print(" sakson");
            case 9-> System.out.print(" to'qson");
            }switch (a % 10) {
            case 1 ->System.out.println(" bir");
            case 2-> System.out.println(" ikki");
            case 3-> System.out.println(" uch");
            case 4-> System.out.println(" tort");
            case 5-> System.out.println(" besh");
            case 6-> System.out.println(" olti ");
            case 7-> System.out.println(" yetti");
            case 8-> System.out.println(" sakkiz");
            case 9-> System.out.println(" toqqiz");
            default-> System.out.println(" xato");
        }
    }
}







