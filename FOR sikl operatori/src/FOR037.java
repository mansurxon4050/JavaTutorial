        import java.util.Scanner;
        public class FOR037 {
        public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k,n,s=0;
        n= kirit.nextInt();
        for (float i = 1; i <= n; i++) {
            k=1;
            for (int j = 1; j <= 1; j++) {
                k*=i;
            }
            s+=k;
            System.out.println(s +  " M ");
        }
        System.out.println(s);

    }
}
