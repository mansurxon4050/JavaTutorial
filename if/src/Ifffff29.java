import java.util.Scanner;

public class Ifffff29 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n,k=0;
        n= kirit.nextInt();
        for (int i=1;i<=n;i++){
            if (n%2==0)
                k++;
        }
        if (k>=2 && k>99)
            System.out.println("3 xonali juft son");
        if (k>=2 && k<100)
        System.out.println("2xonali juft son");

    }
}
