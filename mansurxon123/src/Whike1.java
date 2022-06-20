import java.awt.print.Book;
import java.util.Scanner;

public class Whike1 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int p= kirit.nextInt();
        int s= kirit.nextInt();
        int k=0,i=1;
        while (s<4){
            k=s+(s*p/100);
            s=k;i++;
        }
        System.out.println(k+"   "+i);
    }
}
