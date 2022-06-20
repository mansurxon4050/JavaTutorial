import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int A = kirit.nextInt();
        int B = kirit.nextInt();
        int n = kirit.nextInt(),s=0;
        int[]a=new int[n];
        a[0]=A;
        a[1]=B;
        int d;
        for (int i = 2; i < n; i++) {
           d=a[1]-a[0];
            a[i]=a[i-1]+d;
            s+=a[i];
            System.out.print(a[i]+"  ");
            System.out.println(s+" ");
        }

    }
}
