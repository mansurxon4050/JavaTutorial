        import java.util.Scanner;

        public class FOR32 {
        public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
            int n = kirit.nextInt();
            float a = 1;
            System.out.print(a + " ");
            for (int i = 1; i < n; i++) {

                a = (a + 1 )/i;
                System.out.print(a + "  ");
            } }
}
