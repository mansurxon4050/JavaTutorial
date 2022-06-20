import java.util.Scanner;

public class Stringg08 {
    public static void main(String[] args) {
        Scanner mansurxon = new Scanner(System.in);
        int n=mansurxon.nextInt();
        String belgi = mansurxon.next();
        String harf=belgi;
        for (int i = 1; i < n; i++) {
            belgi=harf.concat(belgi);
        }
        System.out.println(belgi);
    }

}
