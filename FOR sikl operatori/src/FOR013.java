        import java.util.Scanner;
        public class FOR013 {
        public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float n,s=0,k=-1,c=-1;
        n= kirit.nextInt();
        for (float i = 1.1f; i <= n; i+=0.1) {
             c*=k;
            s+=i*c;

        }
            System.out.println(s);
    }
}
