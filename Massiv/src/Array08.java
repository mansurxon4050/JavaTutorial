import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k=0,n= kirit.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= kirit.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i]%2==1){
               k++;
                System.out.print(a[i]+"  ");

            }
        }System.out.print(k+"=ta");
    }
}
