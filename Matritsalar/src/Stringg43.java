import java.util.Scanner;

public class Stringg43 { // A harfi qatnashgan so'zlar soni tpish !!!
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        int k,t=0;
        String[]stArray=st1.split("\\s+");
        for (String x: stArray){
                k=0;
            for (int i = 0; i < x.length(); i++) {
                if (String.valueOf(x.charAt(i)).equalsIgnoreCase("A"))
                    k++;
            }
            if (k>=1)
                t++;
        }
        System.out.println(t);
    }
}
