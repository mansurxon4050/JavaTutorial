        import java.util.Scanner;
        public class FOR024 {
        public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
            int n= kirit.nextInt();
            float x= kirit.nextInt(), k, s = 0, c, ishora = -1;
            for (int i = 0; i < n; i++) {
                c = 1;
                k = 1;
                for (int j = 1; j <= 2 * i ; j++) {
                    c *= x;
                    k *= j;
                }
                ishora *= -1;
                s += (c / k) * ishora;
                System.out.println("Yigindi = " + s);
            } }}
