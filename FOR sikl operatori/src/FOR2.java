import java.util.Scanner;

public class FOR2 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,k=0;
        a= kirit.nextInt();
        b= kirit.nextInt();
        for (int i = a; i <=b ; i++)
        { k++;
            System.out.print(i);
        }
        System.out.print("  "+k + " ta son bor");
    }
}
