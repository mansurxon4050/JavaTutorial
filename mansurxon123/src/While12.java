import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int i = 0, k=0,s=0, n = kirit.nextInt();
        while (n > 0) {
            k = n % 10;
            n/=10;
            i++;
            if (k%2==1){
                s=1;
            }
        }
        if (s==1)System.out.println(" toq raqam bor");
        else System.out.println(" toq raqam yuqq");

    }
}
