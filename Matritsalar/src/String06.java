import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
       while (true) {
           Scanner mansurxon = new Scanner(System.in);
           char n = mansurxon.next().charAt(0);
           if (n >= 'A' && n <= 'Z' || n >= 'a' && n <= 'z') {
               System.out.print("lorin harfi !!!  ");
           } else if (n >= '0' && n <= '9') {
               System.out.print("Raqam !!!  ");
           }
       }
    }
}
