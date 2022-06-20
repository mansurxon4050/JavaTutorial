import java.util.Scanner;

public class FOR36 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt(),k= kirit.nextInt(),c=1,s=0;
        for (int i = 1; i <= n; i++) {
            c=1;
            for (int j = 1; j <= k; j++) {
                c*=i;
            }
            System.out.println(i +"-hadi= " +  c);
            s+=c;
        }
        System.out.println(n + " ta hadlari yigindisi= " +s);


    }
}
