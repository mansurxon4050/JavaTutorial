import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= kirit.nextInt();
        }
        int d=0,m=0;
        for (int i = 0; i < n-1 ; i++) {
        d=a[1]-a[0];
        if (d==a[i+1]-a[i]){
            m++;
        }
        }
        if (m==n-1) System.out.print(d+" ayirmasi");
        else System.out.println(0);
    }
}
