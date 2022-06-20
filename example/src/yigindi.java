import java.util.Scanner;

public class yigindi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n ta xadini kiriting :");
        int n = scanner.nextInt();
        System.out.println("x ni kiriting :");
        int x = scanner.nextInt();

        int s = x, k = x, fac = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {

            k*=x;
            fac*=i;
            System.out.println("k : "+k +"  fac :"+fac);

        }

    }
}

// x  8  32

// !  3!
//
//        for (int i = 0; i < n; i++) {
//        for (int j = i; j <= 2 * i - 1; j++) {
////                k*=x;
////                fac*=j;
//        System.out.print("i "+i);
//        System.out.print("j"+j);
//        System.out.println();
//
//        }
////            System.out.println(fac);
//
//        }
////        System.out.println("aswdefg"+k);
