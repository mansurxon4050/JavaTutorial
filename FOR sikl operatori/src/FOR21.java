import java.util.Scanner;

public class FOR21 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n;
        float k=1,s=0;
        n= kirit.nextInt();
        for (float i = 1; i <=n ; i++) {
            k*=i;
            s+=1/k;
            System.out.println(k);
        }
        System.out.println(s);
    }
}
