import java.util.Scanner;

public class Array05fibonachchi {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt(),f1=1,f2=1,f;
        int[]a=new int[n];
        a[0]=1;
        a[1]=1;
        for (int i = 2; i < n; i++) {
            f=f1+f2;
            f1=f2;
            f2=f;
            a[i]=f;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
