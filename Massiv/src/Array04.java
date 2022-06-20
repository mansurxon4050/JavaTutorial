import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int A = kirit.nextInt();
        int D = kirit.nextInt();
        int n = kirit.nextInt(),s=A;
        int[]a=new int[n];
        a[0]=A/D;
        a[1]=A;
        for (int i = 2; i < n; i++) {
            s*=D;
            a[i]=s;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
