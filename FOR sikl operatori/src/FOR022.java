import java.util.Scanner;

public class FOR022 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n,x;
        float k=1,s;
        n= kirit.nextInt();
        x= kirit.nextInt();
        s=1+x;
        for (float i = 2; i <=n; i++) {
            x*=x;
            k*=i;
            s+=x/k;
        }   System.out.println(s);
    }
}
