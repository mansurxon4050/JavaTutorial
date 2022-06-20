import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= kirit.nextInt();
        }int min;
        for (int i = 0; i < n; i++) {
        min=a[n-1];
            if (min>a[i]){
                System.out.print(a[i]+" ");
                break;
            }
        }
    }
}
