import java.util.Scanner;

public class kasr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sonni kiriting :");
        int a = scanner.nextInt();
        System.out.println("M sonni kiriting :");
        int b = scanner.nextInt();
        // kasrni maxraji doim suratidan katta buladi !

        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
            System.out.println("a :"+a+"  b :"+b);
        }
        System.out.println("qisqarmaydigan korinishi : " + a + "/" + b);
    }
}
