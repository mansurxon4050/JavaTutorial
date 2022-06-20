        import java.util.Scanner;
        public class FOR010 {
        public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float s=0,n= kirit.nextInt();
            for (float i = 1; i <= n; i++) {
                s=s+(1/i);

            }
            System.out.println(s);
    }
}
