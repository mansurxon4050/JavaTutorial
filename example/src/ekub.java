import java.util.Scanner;

public class ekub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sonni kiriting :");
        int a = scanner.nextInt();
        System.out.println("M sonni kiriting :");
        int b = scanner.nextInt();

        int min, ekub = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = 1; i < min; i++) {
            if (a % i == 0 && b % i == 0) {

                ekub = i;
            }
        }
        System.out.println("Eng katta umumiy boluvchisi : " + ekub);
    }
}
