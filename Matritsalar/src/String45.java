import java.util.Scanner;

public class String45 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        int k,min=1000;
        String[] stArray = st1.split("\\s+");
            for (String x: stArray){
                k=0;
                for (int i = 0; i < x.length(); i++) {
                    k++;
                }
                if (min>k) min=k;
            }
        System.out.println(min);
    }
}
