import java.util.Scanner;

public class Strin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        String st2 = scanner.next();
        char c = scanner.next().charAt(0);
        if (st1.contains(String.valueOf(c))){
            st1=st1.replace(String.valueOf(c),st2.concat(String.valueOf(c)));
        }
        System.out.println(st1);
    }
}
