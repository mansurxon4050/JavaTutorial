import java.util.Scanner;

public class FOR20 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n,s=0,k=1;
        n= kirit.nextInt();
        for (int i = 1; i <=n ; i++) {
            k*=i;
            s+=k;
            System.out.println(k);
        }
        System.out.println(s);

    }
}
