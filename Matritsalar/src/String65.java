import java.util.Scanner;

public class String65 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        char c = kirit.next().charAt(0);
        int k = 0;
        String[] a = st1.split("\\s+");
        for (String x : a) {
                    k=c-x.charAt(0);break;
        }
        if (k<0)
        System.out.println(Math.abs(k)+" birlik chapga siljigan");
        else System.out.println(k+" birlik ongga siljigan");
        System.out.println();
        for (int i = 97; i < 123; i++) {
            System.out.print((char)i +" ");
        }
    }
}
