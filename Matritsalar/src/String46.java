import java.util.Scanner;

public class String46 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String[]a=st1.split("\\s+");
        int max=0,k=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length()>max){
                max=a[i].length();
                k=i;
            }
        }
        System.out.println(a[k]);
    }
}
