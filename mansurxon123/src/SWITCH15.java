import java.util.Scanner;

public class SWITCH15 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n,m,valet,dama,qirol,tuz;
        n = kirit.nextInt();
        m= kirit.nextInt();
        switch (n){
         case 1,2,3,4,5,6,7,8,9,10,11,12,13,14-> {
             if (m == 1) {
                 System.out.println(n + " G'isht");
             } else if (m == 2) {
                 System.out.println(n + " Olma");                  //
             } else if (m == 3) {
                 System.out.println(n + " Chillak");
             } else if (m == 4) {
                 System.out.println(n + "Qarga");
             }
             if (n == 11) {
                 valet = n;
             } else if (n == 12) {
                 dama = n;
             } else if (n == 13) {
                 qirol = n;
             } else if (n == 14) tuz = n;
             else {
                 System.out.println(n + " Qarg'a");
             }
             }default -> System.out.println("Xato");
             }
             }
             }

