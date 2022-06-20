import java.util.Scanner;

public class Stringg05 {
    public static void main(String[] args) {
        Scanner mansurxon = new Scanner(System.in);
        char n=mansurxon.next().charAt(0);
        for (int i = 25; i >= 0; i--) {
            System.out.print((char) (n+i)+"  ");
        }
    }
}
